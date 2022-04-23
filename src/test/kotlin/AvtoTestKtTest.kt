import org.junit.Test

import org.junit.Assert.*


class MainKtTest {

    @Test

    fun calculationCommission_forMastercardNule() {

        val typeCard = TypeCard.MASTERCARD
        val transferAmount = 60000
        val previousTransaction = 10000
        val result = calculationCommission(
            typeCard = typeCard,
            previousTransaction = previousTransaction,
            transferAmount = transferAmount
        )
        assertEquals(result, 0)
    }

    @Test

    fun calculationCommission_forMastercard() {

        val typeCard = TypeCard.MASTERCARD
        val transferAmount = 65000
        val previousTransaction = 20000
        val result = calculationCommission(
            typeCard = typeCard,
            previousTransaction = previousTransaction,
            transferAmount = transferAmount
        )
        assertEquals(result, 80)
    }

    @Test

    fun calculationCommission_forMaestroNule() {

        val typeCard = TypeCard.MAESTRO
        val transferAmount = 60000
        val previousTransaction = 10000
        val result = calculationCommission(
            typeCard = typeCard,
            previousTransaction = previousTransaction,
            transferAmount = transferAmount
        )
        assertEquals(result, 0)
    }

    @Test

    fun calculationCommission_forMaestro() {

        val typeCard = TypeCard.MAESTRO
        val transferAmount = 65000
        val previousTransaction = 20000
        val result = calculationCommission(
            typeCard = typeCard,
            previousTransaction = previousTransaction,
            transferAmount = transferAmount
        )
        assertEquals(result, 80)
    }


    @Test

    fun calculationCommission_forVisaMin() {

        val typeCard = TypeCard.VISA
        val transferAmount = 2000
        val previousTransaction = 10000
        val result = calculationCommission(
            typeCard = typeCard,
            previousTransaction = previousTransaction,
            transferAmount = transferAmount
        )
        assertEquals(result, 35)
    }

    @Test

    fun calculationCommission_forVisa() {

        val typeCard = TypeCard.VISA
        val transferAmount = 6000
        val previousTransaction = 10000
        val result = calculationCommission(
            typeCard = typeCard,
            previousTransaction = previousTransaction,
            transferAmount = transferAmount
        )
        assertEquals(result, 45)
    }

    @Test

    fun calculationCommission_forMirMin() {

        val typeCard = TypeCard.MIR
        val transferAmount = 2000
        val previousTransaction = 10000
        val result = calculationCommission(
            typeCard = typeCard,
            previousTransaction = previousTransaction,
            transferAmount = transferAmount
        )
        assertEquals(result, 35)
    }

    @Test

    fun calculationCommission_forMir() {

        val typeCard = TypeCard.MIR
        val transferAmount = 6000
        val previousTransaction = 10000
        val result = calculationCommission(
            typeCard = typeCard,
            previousTransaction = previousTransaction,
            transferAmount = transferAmount
        )
        assertEquals(result, 45)
    }


    @Test

    fun calculationCommission_forVkPay() {

        val typeCard = TypeCard.VKPAY
        val transferAmount = 2000
        val previousTransaction = 10000
        val result = calculationCommission(
            typeCard = typeCard,
            previousTransaction = previousTransaction,
            transferAmount = transferAmount
        )
        assertEquals(result, 0)
    }
}