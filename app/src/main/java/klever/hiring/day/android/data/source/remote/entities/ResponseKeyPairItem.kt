package klever.hiring.day.android.data.source.remote.entities

data class ResponseKeyPairItem(
    val quote: String,
    val base: String,
    val closePrice: Double,
    val price: Double,
    val variation: Double
)
