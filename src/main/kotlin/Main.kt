import java.util.*

fun main() {
    println(95000 - 95000 * 0.01)
    println("Введите количество товара: ")
    val itemPrice = 100.0//цена товара
    val itemCount = Scanner(System.`in`).nextInt()//количество
    val discount = 100.0//скидка 100 рублей от 1_001 - 10_000
    val discountPercent = 0.05//скидка -5% от суммы 10_001 и выше, 5% это 5/100= 0,05
    val discontVipPerson = 0.01//1% это 1/100=0,01

    val totalPrice = itemPrice * itemCount //Общая цена

    println("Для уточнения о дополнительной скидки, введите Id клиента:")
    val regularСlients: List<Int> = listOf(1, 2, 3, 4, 5)//клиенты у которых есть доп скидка 1%
    val id = Scanner(System.`in`).nextInt()

    if (regularСlients.contains(id)) {
        if (totalPrice >= 10_001) {
            val end = totalPrice - totalPrice * discountPercent
            val end2 = end - end * discontVipPerson
            println("Итоговая сумма покупки для постоянных клиентов $end2 рублей (скидка 5%,1%)")
        } else if (totalPrice >= 1_001 && totalPrice <= 10_000) {
            val end = totalPrice - discount
            val end2 = end - end * discontVipPerson
            println("Итоговая сумма покупки для постоянных клиентов $end2 рублей (скидка 100 рублей,1%)")
        } else {
            val end = totalPrice - totalPrice * discontVipPerson
            println("Итоговая сумма покупки для постоянных клиентов $end рублей (скидка 1%)")
        }
    } else {
        if (totalPrice >= 10_001) {
            val end = totalPrice - totalPrice * discountPercent
            println("Итоговая сумма покупки $end рублей (скидка 5%)")
        } else if (totalPrice >= 1_001 && totalPrice <= 10_000) {
            val end = totalPrice - discount
            println("Итоговая сумма покупки $end рублей (скидка 100 рублей)")
        } else {
            val end = totalPrice
            println("Итоговая сумма покупки без скидки $end рублей")
        }
    }
}




