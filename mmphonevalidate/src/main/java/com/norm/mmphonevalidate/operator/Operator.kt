package com.norm.mmphonevalidate.operator

/**
 * Created by KZYT on 25/02/2020.
 */
object MmOperator {
    fun createOperator(name: String, shortName: String): Operator {
        return Operator(name, shortName)
    }
}

data class Operator(
    val name: String,
    val shortName: String
)