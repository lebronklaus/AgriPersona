package com.xiuhao.persona.controller;

import com.xiuhao.persona.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        return "hello persona";
    }

    @RequestMapping("/tag")
    @ResponseBody
    public String getTag(@RequestParam("username") String username){
        return loginService.getTag(username);
    }
}
