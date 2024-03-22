package com.mvc.Controller;

import com.mvc.Service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam String t1, @RequestParam String t2) {
        ModelAndView modelAndView = new ModelAndView();
        AddService service = new AddService();
        int result = service.AddService(Integer.parseInt(t1), Integer.parseInt(t2));
        modelAndView.setViewName("display.jsp");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
