package com.norm.mmphonevalidate

import com.norm.mmphonevalidate.operator.*

/**
 * Created by KZYT on 25/02/2020.
 */
object MmPhoneValidate {

    /**
     * Get operator according to phone number.
     *
     * @param number Phone number to check and get operator.
     */
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

    /**
     * Validate whether the number is MPT or not.
     *
     * @param mptNumber Mpt number to validate.
     */
    fun isMpt(mptNumber: String): Boolean {
        return validateNumber(mptNumber, DefaultPattern.MPT)
    }

    /**
     * Validate whether the number is [DefaultOperator.TELENOR] or not.
     *
     * @param telenorNumber Telenor number to validate.
     */
    fun isTelenor(telenorNumber: String): Boolean {
        return validateNumber(telenorNumber, DefaultPattern.TELENOR)
    }

    /**
     * Validate whether the number is [DefaultOperator.MYTEL] or not.
     *
     * @param mytelNumber MyTel number to validate.
     */
    fun isMytel(mytelNumber: String): Boolean {
        return validateNumber(mytelNumber, DefaultPattern.MYTEL)
    }

    /**
     * Validate whether the number is [DefaultOperator.OOREDOO] or not.
     *
     * @param ooredooNumber Ooredoo number to validate.
     */
    fun isOoredoo(ooredooNumber: String): Boolean {
        return validateNumber(ooredooNumber, DefaultPattern.OOREDOO)
    }

    /**
     * Validate whether the number is [DefaultOperator.MEC] or not.
     *
     * @param mecNumber Mec number to validate.
     */
    fun isMec(mecNumber: String): Boolean {
        return validateNumber(mecNumber, DefaultPattern.MEC)
    }

    /**
     * Validate the number according to defined [Pattern].
     *
     * @param number Phone number to validate.
     * @param mmPattern [Pattern] to check phone number.
     */
    fun validateNumber(number: String, mmPattern: Pattern): Boolean {
        val regex = Regex(mmPattern.pattern)
        return regex.matches(number)
    }
}