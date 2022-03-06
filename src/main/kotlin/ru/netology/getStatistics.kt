package ru.netology

fun getStatistics(numbersUsers: Int): String {
    val like = '\u1F44'
    var likesUsers = ""
    if (numbersUsers % 10 == 1 && numbersUsers != 11)
        likesUsers = "Понравилось $like $numbersUsers человеку Вконтакте!"
    else if (numbersUsers <= 0)
        likesUsers = "Будьте первым кто оценил эту запись"
    else
        likesUsers = "Понравилось $like $numbersUsers людям Вконтакте!"
    return likesUsers
}
fun main() {
    println(getStatistics(1000))
    println(getStatistics(21))
    println(getStatistics(11))
    println(getStatistics(0))
}