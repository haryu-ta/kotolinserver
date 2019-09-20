package com.study.kotlin.server.kotlinserver.Controller


import com.study.kotlin.server.kotlinserver.form.SecondForm
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class SecondController(){

    /**
     * 初期表示
     */
    @GetMapping("/second")
    fun showForm(secondForm: SecondForm ,model : Model):String{
        initParam(secondForm)
        // 都道府県リスト設定
        model.addAttribute("prefList",setPrefList())
        return "home/second"
    }

    /**
     * 登録処理
     */
    @PostMapping("/regist")
    fun regist(@ModelAttribute secondForm : SecondForm, result: BindingResult,model : Model):String{
        println(secondForm.name)
        println(secondForm.prefuct)
        return "redirect:/second"
    }

    /**
     * 初期値設定
     */
    private fun initParam(initForm: SecondForm){
        initForm.name = "板村亮平"
    }

    private fun setPrefList() : MutableList<String> {
        // 変更可能リスト
        val prefList = mutableListOf<String>()
        prefList.add("北海道")
        prefList.add("青森")
        prefList.add("岩手")
        prefList.add("秋田")
        prefList.add("福島")
        prefList.add("山形")
        prefList.add("茨城")
        prefList.add("栃木")
        prefList.add("群馬")
        prefList.add("千葉")
        prefList.add("埼玉")
        prefList.add("東京")
        prefList.add("神奈川")
        prefList.add("山梨")
        prefList.add("富山")
        prefList.add("石川")
        prefList.add("福井")
        prefList.add("新潟")
        prefList.add("静岡")
        prefList.add("長野")
        prefList.add("岐阜")
        prefList.add("愛知")
        return prefList
    }

}