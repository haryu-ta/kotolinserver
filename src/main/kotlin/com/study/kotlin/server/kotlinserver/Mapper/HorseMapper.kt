package com.study.kotlin.server.kotlinserver.Mapper

import com.study.kotlin.server.kotlinserver.Entity.HorseModel
import org.apache.ibatis.annotations.Mapper

/**
 * Repository相当
 */
@Mapper
interface HorseMapper {

    fun findOne() : List<HorseModel>

}