package com.norm.mmphonevalidate

import com.norm.mmphonevalidate.operator.*

/**
 * Created by KZYT on 25/02/2020.
 */
object MmPhoneValidate {

    fun getOperator(number: String): Operator {
        return when {
            isMpt(number) -> DefaultOperator.MPT
            isTelenor(number) -> DefaultOperator.TELENOR
            isMytel(number) -> DefaultOperator.MYTEL
            isOoredoo(number) -> DefaultOperator.OOREDOO
            isMec(number) -> DefaultOperator.MEC
            else -> DefaultOperator.UNKNOWN
        }
    }

    fun isMpt(mptNumber: String): Boolean {
        return validateNumber(mptNumber, DefaultPattern.MPT)
    }

    fun isTelenor(telenorNumber: String): Boolean {
        return validateNumber(telenorNumber, DefaultPattern.TELENOR)
    }

    fun isMytel(mytelNumber: String): Boolean {
        return validateNumber(mytelNumber, DefaultPattern.MYTEL)
    }

    fun isOoredoo(ooredooNumber: String): Boolean {
        return validateNumber(ooredooNumber, DefaultPattern.OOREDOO)
    }

    fun isMec(mecNumber: String): Boolean {
        return validateNumber(mecNumber, DefaultPattern.MEC)
    }

    fun validateNumber(number: String, mmPattern: Pattern): Boolean {
        val regex = Regex(mmPattern.pattern)
        return regex.matches(number)
    }
}