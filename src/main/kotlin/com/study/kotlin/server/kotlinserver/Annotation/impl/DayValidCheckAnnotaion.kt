package com.study.kotlin.server.kotlinserver.Annotation.impl

import com.study.kotlin.server.kotlinserver.Annotation.DayValidityCheck
import org.springframework.beans.BeanWrapperImpl
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

/**
 * アノーテーションの実装
 */
class DayValidCheckAnnotaion : ConstraintValidator<DayValidityCheck,Any>{

    // 月のプロパティ名
    lateinit var propertyMonth : String
    lateinit var propertyDay : String
    lateinit var message : String


    override fun initialize(constraintAnnotation: DayValidityCheck) {
        propertyMonth = constraintAnnotation.propertyMonth
        propertyDay = constraintAnnotation.propertyDay
        message = constraintAnnotation.message
    }

    override fun isValid(value: Any?, context: ConstraintValidatorContext?): Boolean {

        if( value == null || context == null )return true


        // 画面の入力値を取得する
        val beanWrapper = BeanWrapperImpl(value)

        if(beanWrapper.getPropertyValue(propertyMonth) == null || beanWrapper.getPropertyValue(propertyDay) == null ) return true

        var month : Long?  = beanWrapper.getPropertyValue(propertyMonth) as Long
        var day : Long?  = beanWrapper.getPropertyValue(propertyDay) as Long

        if( day == null || month == null ) return true

        var monthI : Int = month.toInt()
        var flg : Boolean = when(monthI){
            1,3,5,7,8,10,12 -> judgeLastDay(day,31L)
            2 -> judgeLastDay(day,28L)
            else -> judgeLastDay(day,30L)
        }

        if(!flg) {
            context.disableDefaultConstraintViolation()
            context.buildConstraintViolationWithTemplate(message)
                    .addPropertyNode(propertyDay).addConstraintViolation()
        }
        return flg
    }


    fun judgeLastDay(day:Long,lday:Long) : Boolean {
        return if ( 1L <= day && day <= lday )  true else false
    }
}