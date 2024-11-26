package lotto.domain

@JvmInline
value class LottoNumber(val number: Int) {
    init {
        require(number in LOTTO_NUMBER_RANGE) { "로또 번호는 $LOTTO_MIN_NUMBER 부터 $LOTTO_MAX_NUMBER 사이어야 합니다" }
    }

    companion object {
        private const val LOTTO_MIN_NUMBER = 1
        private const val LOTTO_MAX_NUMBER = 45
        private val LOTTO_NUMBER_RANGE = LOTTO_MIN_NUMBER..LOTTO_MAX_NUMBER

        val ALL = LOTTO_NUMBER_RANGE.map { LottoNumber(it) }

        fun create(): LottoNumber {
            return LottoNumber(LOTTO_NUMBER_RANGE.random())
        }
    }
}
