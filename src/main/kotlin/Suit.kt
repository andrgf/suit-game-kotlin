class Controller(private val callResult: CallResult){

    open fun compare(data1 : String, data2 : String) {
        when(data1 + data2) {
            "gunting" + "kertas",
            "kertas" + "batu",
            "batu" + "gunting"-> {
                callResult.result("Pemain 1 menang")
            }
            "batu" + "kertas",
            "kertas" + "gunting",
            "gunting" + "batu"-> {
                callResult.result("Pemain 2 menang")
            } else -> {
                callResult.result("Draw")
            }
        }
    }
}