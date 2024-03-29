package com.study.kotlin.server.kotlinserver.Controller


import com.study.kotlin.server.kotlinserver.Service.HorseService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController(private val service : HorseService){

    @GetMapping("/home")
    fun index(model : Model) : String {

        model.addAttribute("Horses",service.selectHorse())
        return "home/index"
    }

    @GetMapping("/stable")
    fun show(model:Model) : String {
        model.addAttribute("Horses",service.selectFather())
        return "home/index"
    }

}