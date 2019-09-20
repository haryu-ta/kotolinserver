package com.study.kotlin.server.kotlinserver.Service.Impl

import com.study.kotlin.server.kotlinserver.DTO.HorseDTO
import com.study.kotlin.server.kotlinserver.Entity.HorseModel
import com.study.kotlin.server.kotlinserver.Mapper.HorseMapper
import com.study.kotlin.server.kotlinserver.Service.HorseService
import org.springframework.stereotype.Service

@Service
class HorseServiceImpl(private val hmapper : HorseMapper):HorseService{

    override fun selectHorse() : List<HorseDTO> {

        val horse : List<HorseModel > = hmapper.findOne();
        val dto : List<HorseDTO> = horse.map { _toHorseDTO(it) }
        return dto

    }

    override fun selectFather(): List<HorseDTO> {
        val horse : List<HorseModel > = hmapper.findByFather("Sunday Silence");
        val dto : List<HorseDTO> = horse.map { _toHorseDTO(it) }
        return dto
    }

    /**
     * EntityからDTOにデータ詰替
     */
    private fun _toHorseDTO(model: HorseModel) : HorseDTO {
        return HorseDTO(
                    name = model.name,
                    gender = model.gender,
                    old = model.old,
                    father = model.father
                )
    }

}