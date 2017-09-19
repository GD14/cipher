package com.rong.ssm.controller;

import com.rong.ssm.common.CommonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by luter on 2017-9-5-0005.
 */
@Controller
@RequestMapping(value = "/query")
public class QueryController {
    @RequestMapping(value = "/cusQuery")
    public String cusQuery(HttpServletRequest request) {
        return "cusQuery";
    }
    @RequestMapping(value = "/cusQueryInfo")
    public String cusQueryInfo(HttpServletRequest request) {
        return "cusQueryInfo";
    }
    @RequestMapping(value = "/cusQueryPro")
    public String cusQueryPro(HttpServletRequest request) {
        return "cusQueryPro";
    }
    @RequestMapping(value = "/cusQueryCalls")
    public String cusQueryCalls(HttpServletRequest request) {
        return "cusQueryCalls";
    }
    @RequestMapping(value = "/cusQueryMes")
    public String cusQueryMes(HttpServletRequest request) {
        return "cusQueryMes";
    }
    @RequestMapping(value = "/empQuery")
    public String empQuery(HttpServletRequest request) {
        return "empQuery";
    }
    @RequestMapping(value = "/empQueryInfo")
    public String empQueryInfo(HttpServletRequest request) {
        return "empQueryInfo";
    }
    @RequestMapping(value = "/empQueryPro")
    public String empQueryPro(HttpServletRequest request) {
        return "empQueryPro";
    }
    @RequestMapping(value = "/empQueryCalls")
    public String empQueryCalls(HttpServletRequest request) {
        return "empQueryCalls";
    }
    @RequestMapping(value = "/empQueryMes")
    public String empQueryMes(HttpServletRequest request) {
        return "empQueryMes";
    }
}
