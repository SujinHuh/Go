package EHS.MonitoringSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

    @GetMapping("hi")
    public String index(Model model) {
//        model.addAttribute("data","hello");
        return "hi";
    }


    @GetMapping("alert/alertconfigEx")
    public String alterEx(Model model) {
        return "alert/alertconfigEx";
    }



    @GetMapping("popup/alert")
    public String alert(Model model) {
        return "popup/alert";
    }
}
