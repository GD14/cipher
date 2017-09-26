package com.rong.ssm.util.cpabe;

import bswabe.*;
import com.rong.ssm.util.cpabe.policy.LangPolicy;
import it.unisa.dia.gas.jpbc.Element;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class CpabeTool {

    /**
     * @param
     * @author Junwei Wang(wakemecn@gmail.com)
     */

    public void setup(String pubfile, String mskfile) throws IOException,
            ClassNotFoundException {
        byte[] pub_byte, msk_byte;
        BswabePub pub = new BswabePub();
        BswabeMsk msk = new BswabeMsk();
        Bswabe.setup(pub, msk);

		/* store BswabePub into mskfile */
        pub_byte = SerializeUtils.serializeBswabePub(pub);
        Common.spitFile(pubfile, pub_byte);

		/* store BswabeMsk into mskfile */
        msk_byte = SerializeUtils.serializeBswabeMsk(msk);
        Common.spitFile(mskfile, msk_byte);
    }

    public byte[]   keygen(BswabePub pub, BswabeMsk msk,
                       String attr_str) throws NoSuchAlgorithmException, IOException {
        byte[] prv_byte;
        String[] attr_arr = LangPolicy.parseAttribute(attr_str);
        BswabePrv prv = Bswabe.keygen(pub, msk, attr_arr);
		/* store BswabePrv into prvfile */
        prv_byte = SerializeUtils.serializeBswabePrv(prv);
        return prv_byte;
    }

    public void enc( BswabePub pub, String policy, String inputfile,
                    String encfile) throws Exception {

        BswabeCph cph;
        BswabeCphKey keyCph;
        byte[] plt;
        byte[] cphBuf;
        byte[] aesBuf;
        Element m;
        keyCph = Bswabe.enc(pub, policy);
        cph = keyCph.cph;
        m = keyCph.key;
        System.err.println("m = " + m.toString());

        if (cph == null) {
            System.out.println("Error happed in enc");
            System.exit(0);
        }

        cphBuf = SerializeUtils.bswabeCphSerialize(cph);

		/* read file to encrypted */
        plt = Common.suckFile(inputfile);
        aesBuf = AESCoder.encrypt(m.toBytes(), plt);
        // PrintArr("element: ", m.toBytes());
        Common.writeCpabeFile(encfile, cphBuf, aesBuf);
    }

    public byte[] dec(BswabePub pub, byte[] prv_byte, String encfile) throws Exception {
        byte[] aesBuf, cphBuf;
        byte[] plt;
        byte[] pub_byte;
        byte[][] tmp;
        BswabeCph cph;
        BswabePrv prv;

		/* read ciphertext */
        tmp = Common.readCpabeFile(encfile);
        aesBuf = tmp[0];
        cphBuf = tmp[1];
        cph = SerializeUtils.bswabeCphUnserialize(pub, cphBuf);

        prv = SerializeUtils.unserializeBswabePrv(pub, prv_byte);

        BswabeElementBoolean beb = Bswabe.dec(pub, prv, cph);
        System.err.println("e = " + beb.e.toString());
        if (beb.b) {
            plt = AESCoder.decrypt(beb.e.toBytes(), aesBuf);
            return plt;
        } else {
            System.exit(0);
        }
        return null;
    }

}
