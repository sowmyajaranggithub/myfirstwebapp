package com.in28minutes.springboot.myfirstwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {

    ///login => com.in28minutes.springboot.myfirstwebapp.login.LoginController => login.jsp
    @RequestMapping("say-hello-login")
    @ResponseBody
    public String gotoLoginpage() {
        return "say-hello";
    }
}
