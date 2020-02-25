package com.norm.mmphonevalidate.operator

import com.norm.mmphonevalidate.utils.*

/**
 * Created by KZYT on 25/02/2020.
 */
object DefaultPattern {
    var MPT: Pattern
        private set
    var TELENOR: Pattern
        private set
    var MYTEL: Pattern
        private set
    var OOREDOO: Pattern
        private set
    var MEC: Pattern
        private set

    init {
        MPT =
            MmPattern.createPattern(
                PATTERN_MPT
            )
        TELENOR =
            MmPattern.createPattern(
                PATTERN_TELENOR
            )
        MYTEL =
            MmPattern.createPattern(
                PATTERN_MYTEL
            )
        OOREDOO =
            MmPattern.createPattern(
                PATTERN_OOREDOO
            )
        MEC =
            MmPattern.createPattern(
                PATTERN_MEC
            )
    }
}