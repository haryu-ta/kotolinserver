package com.study.kotlin.server.kotlinserver.Controller


import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class HomeController{

    @GetMapping("/home")
    fun index(model : Model) : String {
        model.addAttribute("message","Hello!!World!!")
        return "home/index"
    }

}