package com.study.kotlin.server.kotlinserver.form

import java.time.LocalDate
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size


data class SecondForm(

        @field:NotBlank(message="必須入力項目")
        @field:Size(min=2, max=10,message="{validate.error.size}")
        var name : String?,
        @field:NotBlank(message="必須入力項目")
        var prefuct : String?,
        var sex : String?,
        var birth : LocalDate?,
        var age : Int = 0,
        var jobChangeFlg : Boolean = false,
        var universityFlg : Boolean = false,
        var overseaFlg : Boolean = false,
        var content1 : Boolean = false,
        var content2 : Boolean = false,
        var content3 : Boolean = false,
        var email : String?

)