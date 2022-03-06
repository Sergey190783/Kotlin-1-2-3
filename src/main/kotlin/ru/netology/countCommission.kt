package ru.netology

fun countCommission(amount: Long): Long {
    val commissionAmount: Double = 0.0075
    var finalCommission: Long = (amount * commissionAmount).toLong()
    if (finalCommission < 3500)
        finalCommission = 3500
    return finalCommission
}

fun main() {

    val t = countCommission(1000000L)
    println(t)
    println(countCommission(2000000))
    println(countCommission(3000000))
}