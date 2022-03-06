package ru.netology
fun getDiscount(itemPrice: Int, goodsQuantity: Int, musicLover: Boolean): String { //цена товара, количество товара, меломан или нет
    var discount:Double = 0.0 // скидка
    var purchaseAmount: Double = (itemPrice * goodsQuantity).toDouble() // сумма покупок
    if(purchaseAmount <= 1000)
        discount = 0.0
    else if (purchaseAmount >= 1001 && purchaseAmount <= 10000)
        discount = 100.0
    else if (purchaseAmount > 10001)
        discount = (0.05 * purchaseAmount)
    if (musicLover)
        purchaseAmount = ((purchaseAmount - discount) * 0.99)
    val d: String = "${purchaseAmount.toInt()} руб. + ${((purchaseAmount - purchaseAmount.toInt()) * 100).toInt()} копеек"
    return d
}
fun main() {
    println(getDiscount(10011, 10, true))
}