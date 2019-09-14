package com.study.kotlin.server.kotlinserver.Service

import com.study.kotlin.server.kotlinserver.Entity.HorseModel
import com.study.kotlin.server.kotlinserver.Mapper.HorseMapper
import org.springframework.stereotype.Service

@Service
class HorseService(private val hmapper : HorseMapper){

    fun selectHorse() : String {

        val horse : List<HorseModel > = hmapper.findOne();
        return horse.get(0).name

    }

}