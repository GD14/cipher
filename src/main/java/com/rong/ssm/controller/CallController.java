package com.rong.ssm.controller;

import com.rong.ssm.common.CommonResult;
import com.rong.ssm.pojo.Call;
import com.rong.ssm.service.CallService;
import com.rong.ssm.vo.QueryCallVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by GD14 on 2017/9/8.
 */
@Controller
@RequestMapping(value = "/api/call")
public class CallController {
    @Autowired
    private CallService callService;
    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public CommonResult<List<Call>> List(QueryCallVo queryCallVo, HttpServletRequest request) throws Exception {
        List<Call> callList=callService.listCallByPhone(queryCallVo);
        return new CommonResult<>("0",callList);
    }
}
