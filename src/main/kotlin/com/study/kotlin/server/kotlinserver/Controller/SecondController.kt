package com.study.kotlin.server.kotlinserver.Controller


import com.study.kotlin.server.kotlinserver.Constant.DisplayConstants
import com.study.kotlin.server.kotlinserver.Constant.setPrefList
import com.study.kotlin.server.kotlinserver.Service.HorseService
import com.study.kotlin.server.kotlinserver.form.SecondForm
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

@Controller
class SecondController(private val service : HorseService){

    /**
     * 初期表示s
     */
    @GetMapping("/second")
    fun showForm(secondForm: SecondForm ,model : Model):String{
        initParam(secondForm)
        // 都道府県リスト設定
        setScreeen(model)
        return "home/second"
    }

    /**
     * 登録処理
     */
    @PostMapping("/regist")
    fun regist(@ModelAttribute @Validated secondForm : SecondForm, result: BindingResult, model : Model):String{

        if(result.hasErrors()){
            model.addAttribute("validateError","入力えらー")
            return showForm(secondForm,model)
        }
        println(secondForm.toString())
        return "redirect:/second"
    }

    private fun setScreeen(model: Model) {
        model.addAttribute("prefList", setPrefList())
        model.addAttribute("contentMap", DisplayConstants.setContentMap(service.selectHorse()))
    }

    /**
     * 初期値設定
     */
    private fun initParam(initForm: SecondForm){
        initForm.name = "板村亮平"
        initForm.sex="男"
        initForm.prefuct="愛知"
        initForm.birth = LocalDate.parse("1982-09-17")
        initForm.email = "itamura@mail.com"
    }

}