package com.study.kotlin.server.kotlinserver.form

import java.time.LocalDate


data class SecondForm(
        var name : String?,
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