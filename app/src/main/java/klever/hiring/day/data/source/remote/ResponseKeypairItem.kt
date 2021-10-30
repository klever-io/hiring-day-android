package klever.hiring.day.data.source.remote

import klever.hiring.day.data.source.remote.entities.ResponseKeyPairItem
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

class FakeKleverApiSource {
    fun getKeyPairs() = flow {
        while (true) {
            val randomPriceDvkKlv = Random(0).nextDouble(0.32, 0.72)
            val randomPriceEthTrx = Random(0).nextDouble(0.00002, 0.00003)
            val randomPriceKlvUsdt = Random(0).nextDouble(0.032, 0.072)

            val subClosePrice = 0.05

            val mockKeyPairList = listOf(
                ResponseKeyPairItem(
                    quote = "DVK",
                    base = "KLV",
                    price = randomPriceDvkKlv,
                    closePrice = (randomPriceDvkKlv - subClosePrice),
                    variation = Random(0).nextDouble(-2.5, 7.8),
                ),
                ResponseKeyPairItem(
                    quote = "ETH",
                    base = "TRX",
                    price = randomPriceEthTrx,
                    closePrice = (randomPriceEthTrx - subClosePrice),
                    variation = Random(0).nextDouble(-2.5, 7.8),
                ),
                ResponseKeyPairItem(
                    quote = "KLV",
                    base = "USDT",
                    price = randomPriceKlvUsdt,
                    closePrice = (randomPriceKlvUsdt - subClosePrice),
                    variation = Random(0).nextDouble(-2.5, 7.8),
                )
            )

            emit(mockKeyPairList)
            delay(1500)
        }
    }
}

