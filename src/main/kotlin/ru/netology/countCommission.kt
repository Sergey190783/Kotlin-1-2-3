package ru.netology
fun countCommission(amount: Long): Long {
    val commissionAmount = 0.0075
    val finalCommission = (amount * commissionAmount).toLong()
    return if (finalCommission < 3500)
        3500
    else
        finalCommission
}
fun main() {
    val t = countCommission(1000000L)
    println(t)
    println(countCommission(2000000))
    println(countCommission(3000000))
}