package ru.netology

/**
 * Базовая скидка на сумму покупок от 1000 до 10000 рублей
 */
const val BASE_DISCOUNT: Int = 100
/**
 * Дисконт 5% при покупке от 10001 рублей и выше
 */
const val DISCOUNT05: Double = 0.05
/**
 * Дисконт 1% при посещении магазина не менее 1 раза в месяц
 */
const val DISCOUNT01: Double = 0.01
fun getDiscount(itemPrice: Double, goodsQuantity: Int, musicLover: Boolean): String {
    var purchaseAmount = (itemPrice * goodsQuantity)
    if (purchaseAmount >= 1001)
        purchaseAmount -= BASE_DISCOUNT
    if (purchaseAmount >= 10001)
        purchaseAmount -= purchaseAmount * DISCOUNT05
    if (musicLover)
        purchaseAmount *= (1 - DISCOUNT01)
    return "Общая сумма покупки после применения скидки = ${purchaseAmount.toInt()} руб. ${((purchaseAmount - purchaseAmount.toInt()) * 100).toInt()} копеек"
}
fun main() {
    println(getDiscount(100.0, 200, true))
}
