package p;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class App {
    //返回.html页面
    @RequestMapping("index")
    public String page1() {
        return "/index.html";
    }

    //返回String型变量
    @ResponseBody
    @RequestMapping("/a")
    public String page2() {
       return "Hello world !";
    }
}
