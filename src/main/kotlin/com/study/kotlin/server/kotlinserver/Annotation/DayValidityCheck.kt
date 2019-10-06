package com.study.kotlin.server.kotlinserver.Annotation

import com.study.kotlin.server.kotlinserver.Annotation.impl.DayValidCheckAnnotaion
import javax.validation.Constraint
import javax.validation.Payload
import javax.validation.ReportAsSingleViolation
import kotlin.reflect.KClass

/**
 *  月毎に日付の有効性をチェックするアノーテーション（相関チェック）
 */
//@Target(AnnotationTarget.FIELD)
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@ReportAsSingleViolation
@Constraint(validatedBy = [DayValidCheckAnnotaion::class])
annotation class DayValidityCheck (
    val message : String = "{validate.error.multiItem.birth}",
    val groups: Array<KClass<out Any>> = [],
    val payload: Array<KClass<out Payload>> = [],
    val propertyMonth : String,
    val propertyDay : String
)