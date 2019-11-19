package p;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class App{
    @RequestMapping("")
    public String firstPage() {
        return "/a.html";
    }
    @ResponseBody
    @RequestMapping(value = "/doForm",method = RequestMethod.POST)
    public String strFunc(HttpServletRequest request){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        return username+"-"+password;
    }
}

/***
 <form action="/doForm" method="post" >
 用户名
 <input type="text" name="username">
 密码
 <input type="password" name="password">

 <input type="submit">
 </form>
 */
