package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    //"say=hello"=>"Hello! what are you learning toady"
   @RequestMapping("say-hello")
   @ResponseBody
public String sayHello(){
       return "Hello! what are you learning toady";
}
    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
       StringBuffer sb= new StringBuffer();
       sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My first HTML page - changed</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page with body - changed");
        sb.append("</body>");
        sb.append("</html>") ;
        return sb.toString();

    }
//"say-hello-jsp" => sayHello.jsp
    // /src/main/resources/META-INF/resources/WEB-INF/JSP/sayHello.jsp
    @RequestMapping("say-hello-jsp")
//    @ResponseBody
    public String sayHelloJsp() {
        return "sayHello";
    }


}
