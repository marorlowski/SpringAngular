package contollers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestContoller {

    @RequestMapping("/")
    @ResponseBody
    public String mainPage(){
        return "To działa";
    }
}
