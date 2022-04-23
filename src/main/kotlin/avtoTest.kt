fun main() {
    val typeCard = TypeCard.VISA
    val transferAmount = 90000
    val previousTransaction = 100000

    val commission = calculationCommission(
        typeCard = typeCard,
        previousTransaction = previousTransaction,
        transferAmount = transferAmount
    )
    println("При переводе: $transferAmount копеек с карты: $typeCard, комиссия составит: $commission копеек")
}

enum class TypeCard {
    MASTERCARD,
    MAESTRO,
    VISA,
    MIR,
    VKPAY
}

fun calculationCommission(typeCard: TypeCard = TypeCard.VKPAY, previousTransaction: Int = 0, transferAmount: Int): Int =
    when (typeCard) {
        TypeCard.MASTERCARD, TypeCard.MAESTRO -> {
            val prefLimitForMastercardAndMaestro = 75000
            val overrunLimit = prefLimitForMastercardAndMaestro - previousTransaction - transferAmount
            val minCommissionForMastercardAndMaestro = 20
            val commissionForMastercardAndMaestro = 0.06 / 100
            if (overrunLimit >= 0) 0 else (kotlin.math.abs(overrunLimit) * commissionForMastercardAndMaestro + minCommissionForMastercardAndMaestro).toInt()
        }
        TypeCard.VISA, TypeCard.MIR -> {
            val minCommissionForVisaAndMir = 35
            val commissionForVisaAndMir = 0.75 / 100
            val totalCommissionForVisaAndMir = transferAmount * commissionForVisaAndMir
            if (totalCommissionForVisaAndMir <= minCommissionForVisaAndMir) minCommissionForVisaAndMir else totalCommissionForVisaAndMir.toInt()
        }
        TypeCard.VKPAY -> 0
    }