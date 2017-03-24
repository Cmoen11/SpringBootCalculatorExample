package com.test.uia.matte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting(@RequestParam(value="tall1", required=false)  String tall1,
                           @RequestParam(value = "tall2", required = false) String tall2,
                           @RequestParam(value = "mathType", required = false) String mathType,
                           Model model) {
        if (tall1 != null && tall2 != null && mathType != null) {
            switch (mathType) {
                case "pluss" :
                    model.addAttribute("svar", Double.parseDouble(tall1) + Double.parseDouble(tall2));
                    break;
                case "gange" :
                    model.addAttribute("svar", Double.parseDouble(tall1) * Double.parseDouble(tall2));
                    break;
                case "dele" :
                    model.addAttribute("svar", Double.parseDouble(tall1) / Double.parseDouble(tall2));
                    break;
                default:
                    break;

            }
        }
        return "index";
    }


}