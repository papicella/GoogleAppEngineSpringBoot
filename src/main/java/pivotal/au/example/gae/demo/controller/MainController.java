package pivotal.au.example.gae.demo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController
{
    private static Log logger = LogFactory.getLog(MainController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainPage (Model model) throws Exception
    {
        logger.info("Received request to shown main.html");

        return "main";

    }
}
