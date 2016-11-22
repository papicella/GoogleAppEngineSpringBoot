package pivotal.au.example.gae.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRest
{
    @RequestMapping("/about")
    public String home()
    {
        return "Running on Google App Engine @" + new java.util.Date();
    }
}
