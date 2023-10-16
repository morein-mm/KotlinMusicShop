fun main() {
    val discountPercent = 5
    val discountValue = 100
    val discountPercentForRegularClient = 1

    val minPurchaseForDiscountPercent = 10_001
    val minPurchaseForDiscountValue = 1_001

    val isRegularClient = true

    val purchase = 10_200 //сумма покупки до применения скидок

    var amount = purchase // итого (сумма покупки с учетом скидок)
    if (amount >= minPurchaseForDiscountValue && amount < minPurchaseForDiscountPercent) {
        amount -= discountValue
    }
    if (amount >= minPurchaseForDiscountPercent) {
        amount -= (amount * discountPercent / 100)
    }
    if (isRegularClient) amount -= (amount * discountPercentForRegularClient / 100)

}