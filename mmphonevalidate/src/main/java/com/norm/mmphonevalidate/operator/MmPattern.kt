package com.norm.mmphonevalidate.operator

import com.norm.mmphonevalidate.utils.*

/**
 * Created by KZYT on 25/02/2020.
 */
object MmPattern {
    fun createPattern(pattern: String): Pattern {
        return Pattern(pattern)
    }
}

data class Pattern(
    val pattern: String
)