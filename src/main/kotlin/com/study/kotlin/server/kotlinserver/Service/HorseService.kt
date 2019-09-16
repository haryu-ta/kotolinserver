package com.study.kotlin.server.kotlinserver.Service

import com.study.kotlin.server.kotlinserver.DTO.HorseDTO

interface HorseService {

    fun selectHorse() :List<HorseDTO>

    fun selectFather() : List<HorseDTO>

}