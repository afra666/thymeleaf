package p;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class App {
    /***
     * 只返回字符串，无法返回html
     * 
     */
    @RequestMapping("/index")
    @ResponseBody
    public String toString() {
        return "index";
    }

    /***
     * 返回html
     */
    @GetMapping("/index2")
    public String a() {
        return "index2";
    }
}
