package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput(@RequestParam(name = "previous", required = false) String previous, Model model)  {
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("previous", previous);
        return "input";
    }
    @GetMapping("/input?previous={previous}")
    public String getIfunless(@PathVariable String previous, Model model) {
        // パスパラメータで受け取った値をModelに登録
        model.addAttribute("previous", previous);
        // input.htmlに画面遷移
        return "input";
    }

}