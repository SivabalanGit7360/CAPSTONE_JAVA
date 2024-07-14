package com.colorcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import com.colorcatalog.service.ColorService;

@Controller
public class ColorController {

    @Autowired
    private ColorService colorService;

    @PostMapping("/select-colors")
    public String selectColors(@RequestParam String username, @RequestParam List<String> colors, Model model) {
        if (colors.isEmpty()) {
           // model.addAttribute("error", "Please select at least one color.");
            return "welcome";
        }

        colorService.saveColors(username, colors);
        model.addAttribute("colors", colors);
        return "display_colors";
    }

}
