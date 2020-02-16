package org.rnilbong.sampletargetserver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/v1/sample/page")
public class SamplePageController {
    @GetMapping("/{name}")
    public String postSampleString(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "page";
    }
}