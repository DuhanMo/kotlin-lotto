package lotto.view

object InputView {
    fun inputPurchaseAmount(): Int {
        println("구입금액을 입력해 주세요.")
        return readlnOrNull()?.toIntOrNull()
            ?: throw IllegalArgumentException("잘못된 입력입니다")
    }

    fun inputWinningLottoNumbers(): Set<Int> {
        println("지난 주 당첨 번호를 입력해 주세요.")
        return readlnOrNull()?.split(",")
            ?.map { it.trim().toIntOrNull() ?: throw IllegalArgumentException("숫자만 입력하여야 합니다. $it") }
            ?.toSet()
            ?: throw IllegalArgumentException("잘못된 입력입니다.")
    }

    fun inputWinningBonusNumber(): Int {
        println("보너스 볼을 입력해 주세요.")
        return readlnOrNull()?.toIntOrNull()
            ?: throw IllegalArgumentException("잘못된 입력입니다")
    }
}