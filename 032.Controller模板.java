package p;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class App{
    @RequestMapping("")
    public String firstPage() {
        return "/a.html";
    }
    @ResponseBody
    @RequestMapping(value = "/doForm",method = RequestMethod.POST)
    public String strFunc(){
        return "Hello world!";
    }
}

/***
 <form action="/doForm" method="post">
        <input type="submit" value="创建文件">
 </form>
 */
