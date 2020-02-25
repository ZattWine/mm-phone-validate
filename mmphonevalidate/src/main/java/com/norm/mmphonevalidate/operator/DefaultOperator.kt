package com.norm.mmphonevalidate.operator

import org.omg.CORBA.UNKNOWN

/**
 * Created by KZYT on 25/02/2020.
 */
object DefaultOperator {
    var MPT: Operator
        private set
    var TELENOR: Operator
        private set
    var MYTEL: Operator
        private set
    var OOREDOO: Operator
        private set
    var MEC: Operator
        private set
    var UNKNOWN: Operator
        private set

    init {
        MPT = MmOperator.createOperator("Myanma Posts and Telecommunications", "Mpt")
        TELENOR = MmOperator.createOperator("Telenor Myanmar Limited", "Telenor")
        MYTEL = MmOperator.createOperator("Telecom International Myanmar Co., Ltd", "MyTel")
        OOREDOO = MmOperator.createOperator("Ooredoo Myanmar Limited", "Ooredoo")
        MEC = MmOperator.createOperator("MecTel", "Mec")
        UNKNOWN = MmOperator.createOperator("Unknown Operator", "Unknown")
    }

    fun getDefaultOperators(): List<Operator> {
        val lists = mutableListOf<Operator>()
        lists.add(MPT)
        lists.add(TELENOR)
        lists.add(MYTEL)
        lists.add(OOREDOO)
        lists.add(MEC)
        return lists
    }

    fun getDefaultOperatorNames(): List<String> {
        val lists = mutableListOf<String>()
        lists.add(MPT.shortName)
        lists.add(TELENOR.shortName)
        lists.add(MYTEL.shortName)
        lists.add(OOREDOO.shortName)
        lists.add(MEC.shortName)
        return lists
    }
}