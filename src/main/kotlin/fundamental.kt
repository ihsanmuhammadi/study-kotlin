// single line comment

/*
multi-line
comment
*/

//fun main() {
    // 1 : main & print function :
        // print explisit message & expression/variable
//    val name = "Ihsan"
//    print("Hello my name is ")
//    println(name)

    // 2 : type data & variable :
//    var nama: String = "Ihsan"
//    nama = "Ihsan Muhammad Iqbal"
//    var namaJuga ="Sabila"

//    val bulan: String = "Maret"
//    val bulanJuga = "Januari"

//    println(nama + " " + namaJuga)
//    println(bulan + " " + bulanJuga)

    // 3 : char
//    var character = 'A'
//    println(character++)
//    println(character++)
//    println(character++)
//    println(character--)
//    println(character--)

    // 4 : String
//    val textString = "Ihsan"
//    val firstWord = textString[0]
//    println(firstWord)
//
//    for (char in textString) {
//        println("$char ")
//    }

//    val escaped = "Ihsan sangat \"cool!\"\nini baris baru\ttab baru hehe\nini unicode: \u00A9"
//    println(escaped)

//    var raw = """
//        Ini adalah raw "String"
//        Bebas line nya yaa
//        multiline & arbitrary
//    """.trimIndent()
//    println(raw)

    // 5 : Functions
//    val user = functionWithReturn("Ihsan", 19)
//    println(user)
//    val users = functionReturn("Sabila")
//    println(users)

//    functionWithoutReturn("Ihsan")
//    functionNoReturn("Sabila")
//}

//fun functionWithReturn(name: String, age: Int): String {
//    return "Ini struktur lengkapnya $name $age"
//}

//fun functionReturn(name: String) = "jika expressionnya 1 (expression body) $name"

//fun functionWithoutReturn(name: String): Unit {
//    println("Ini struktur lengkapnya $name")
//}

//fun functionNoReturn(name: String) {
//    println("Ini struktur singkat $name")
//}

fun main(){
    // 6 : If expressions
//    val jamBuka = 7
//    val jamSekarang = 7
//    val toko: String
//    toko = if (jamSekarang > jamBuka) {
//        "Toko sudah buka!"
//    } else if (jamSekarang == jamBuka) {
//        "Bentar lagi buka!"
//    } else {
//        "Toko tutup"
//    }
//    println(toko)

    // 7 : Boolean data type
//    val jamBuka = 7
//    val jamTutup = 16
//    val jamSekarang = 20
//    val bukaNgga = jamSekarang < jamTutup
//
//    val isOpen = if (jamSekarang >= jamBuka && jamSekarang <= jamTutup) {
//        true
//    } else {
//        false
//    }
//    println("office is open: $isOpen")
//
//    val bentukSederhana = jamSekarang >= jamBuka && jamSekarang <= jamTutup
//    println("office is open: $bentukSederhana")
//
//    val isClosed = jamSekarang > jamTutup || jamSekarang < jamBuka
//    println("office is closed : $isClosed")
//
//    if (!bukaNgga) {
//        println("Toko tutup")
//    } else {
//        println("Toko buka")
//    }

    // 8 : Numbers type data
//    val maxInt = Int.MAX_VALUE
//    val minInt = Int.MIN_VALUE
//    println(maxInt)
//    println(minInt)
//
//    val numberOne: Int = 100000
//    val numberTwo = 200000
//    println(numberOne + numberTwo)
//
//    println(5 * (9+1))
//
//    val byteNumber: Byte = 10
//    val intNumber: Int = byteNumber.toInt()
//    println(intNumber)
//
//    val stringNumber = "27"
//    val intLagi = 3
//    println(intLagi + stringNumber.toInt())
//
//    val readableNumber = 1_000
//    println(readableNumber)

    // 9 : Arrays
//    val arrayTest = arrayOf("satu", 2, "tiga", 4, 5, true)
//    val intArray = intArrayOf(1, 2, 3)
//    intArray[2] = 4
//    println(intArray[2])

    // 10 : Nullable types
//    val text: String? = null
//    if (text != null) {
//        val textLength = text.length
//    }

    // 11 : Safe calls operator
//    val text: String? = null
//    text?.length

    // 12 : Elvis operator
//    val text: String? = null
//    val textLength = text?.length?: 7
//
//    val textLength = if (text != null) text.length else 7

    // 13 : String template
//    val name = "Ihsan"
//    val age = 19
//    println("My name is $name, i am $age years old")
//
//    val hour = 7
//    println("office ${if (hour > 7) "already closed" else "is open"}")
} 