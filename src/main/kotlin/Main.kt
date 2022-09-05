fun main() {

    do {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")


        print("1. Masukkan pemain 1 : ")
        val input1 = getInputUser()
        print("2. Masukkan pemain 2 : ")
        val input2 = getInputUser()

        val controller = Suit(object : CallResult {
            override fun result(hasil: String) {
                println(hasil)
            }
        })

        controller.compare(input1.toString(), input2.toString())

        print("Lanjut Game ? (ya / tidak) ")
        var input : String?
        val posibleInput = listOf("ya", "tidak")
        do {
            input = readLine()!!.trim().lowercase()
            if (!posibleInput.contains(input)) {
                print("Lanjut Game ? (ya / tidak) ")
            }
        } while (!posibleInput.contains(input))


    } while (input == "ya")

}

fun getInputUser() : String? {
    var input : String?
    val posibleInput = listOf("kertas", "gunting", "batu")
    do {
        input = readLine()!!.trim().lowercase()
        if (!posibleInput.contains(input)) {
            println("Masukkan dengan benar")
        }
    } while (!posibleInput.contains(input))
    return input
}

fun getNextOrNo() : String? {
    var input : String?
    val posibleInput = listOf("ya", "tidak")
    do {
        input = readLine()!!.trim().lowercase()
        if (!posibleInput.contains(input)) {
            print("Lanjut Game ? (ya / tidak) ")
        }
    } while (!posibleInput.contains(input))
    return input
}