package com.norm.mmphonevalidate

const val mpt = "884782570"
const val telenor = "753425485"
const val mytel = "663547895"
const val ooredoo = "954257565"
const val mec = "340255657"
const val other = "123457855"

fun main() {
    val isMpt = MmPhoneValidate.isMpt(other)
    val isTelenor = MmPhoneValidate.isTelenor(other)
    val isMytel = MmPhoneValidate.isMytel(other)
    val isOoredoo = MmPhoneValidate.isOoredoo(other)
    val isMec = MmPhoneValidate.isMec(mec)

    val operator = MmPhoneValidate.getOperator(mpt)

    println("Mpt = $isMpt")
    println("Telenor = $isTelenor")
    println("MyTel = $isMytel")
    println("Ooredoo = $isOoredoo")
    println("Mec = $isMec")
    println("Operator = ${operator.shortName}")
}