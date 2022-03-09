package ru.netology
const val LIKE_SYMBOL = '\u1F44'
fun getStatistics(numbersUsers: Int): String {
    return if (numbersUsers % 10 == 1 && numbersUsers != 11)
        "Понравилось $LIKE_SYMBOL $numbersUsers человеку Вконтакте!"
    else if (numbersUsers <= 0)
        "Будьте первым кто оценил эту запись"
    else
        "Понравилось $LIKE_SYMBOL $numbersUsers людям Вконтакте!"
}
fun main() {
    println(getStatistics(1000))
    println(getStatistics(21))
    println(getStatistics(11))
    println(getStatistics(1))
}