package com.study.kotlin.server.kotlinserver.Constant

import com.study.kotlin.server.kotlinserver.DTO.HorseDTO
import com.study.kotlin.server.kotlinserver.Service.HorseService

/**
 * staticメソッド
 */
fun setPrefList(): MutableList<String> {
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

class DisplayConstants{
    companion object {
        fun setContentMap( list : List<HorseDTO>) : MutableMap<String,String> {
            val contentMap = mutableMapOf<String,String>()
            var cnt :Int = 0
            for( li in list ){
                cnt++
                contentMap.put(li.name, "content" + cnt)
            }
            return contentMap
        }
    }
}