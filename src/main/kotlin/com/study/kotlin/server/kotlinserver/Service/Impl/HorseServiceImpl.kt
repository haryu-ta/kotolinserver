package com.study.kotlin.server.kotlinserver.Service.Impl

import com.study.kotlin.server.kotlinserver.Entity.HorseModel
import com.study.kotlin.server.kotlinserver.Mapper.HorseMapper
import com.study.kotlin.server.kotlinserver.Service.HorseService
import org.springframework.stereotype.Service

@Service
class HorseServiceImpl(private val hmapper : HorseMapper):HorseService{

    override fun selectHorse() : String {

        val horse : List<HorseModel > = hmapper.findOne();
        return horse.get(0).name

    }

}