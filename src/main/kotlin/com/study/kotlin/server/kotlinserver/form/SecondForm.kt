package com.study.kotlin.server.kotlinserver.form

import com.study.kotlin.server.kotlinserver.Annotation.DayValidityCheck
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.validation.constraints.*

@DayValidityCheck(propertyDay = "tday",propertyMonth = "tmonth")
data class SecondForm @JvmOverloads constructor(

        @field:NotBlank(message="必須入力項目")
        @field:Size(min=2, max=10,message="{validate.error.size}")
        var name : String?,

        @field:NotBlank(message="必須入力項目")
        var prefuct : String?,

        var sex : String?,

//        @field:NotNull(message="{validate.error.birth}")
//        var birth : LocalDate?,

        @field:NotNull(message = "{validate.error.birth}")
        @field:Max(value = 2100,message = "{validate.error.birth}")
        @field:Min(value = 1901,message = "{validate.error.birth}")
        var tyear : Long?,

        @field:NotNull(message = "{validate.error.birth}")
        @field:Max(value = 12,message = "{validate.error.birth}")
        @field:Min(value = 1,message = "{validate.error.birth}")
        var tmonth : Long?,

        @field:NotNull(message = "{validate.error.birth}")
        var tday : Long?,

        var age : Int = 0,
        var jobChangeFlg : Boolean = false,
        var universityFlg : Boolean = false,
        var overseaFlg : Boolean = false,
        var content1 : Boolean = false,
        var content2 : Boolean = false,
        var content3 : Boolean = false,

        @field:Email(message="{validate.error.email}")
        var email : String?

)