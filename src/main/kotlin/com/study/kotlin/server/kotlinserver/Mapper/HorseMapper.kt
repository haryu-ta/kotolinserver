package com.study.kotlin.server.kotlinserver.Mapper

import com.study.kotlin.server.kotlinserver.Entity.HorseModel

/**
 * Repository相当
 */

interface HorseMapper {

    fun findOne() : List<HorseModel>

}