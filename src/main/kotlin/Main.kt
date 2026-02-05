//fun main() {
//
//    val produtos = mutableMapOf(
//        "pc" to "computador",
//        "cl" to "celular"
//    )
//
//    println(produtos)
//    println(produtos["nt"])
//    produtos["pc"] = "desktop"
//    produtos["nt"] = "notebook"
//    produtos.remove(key = "cl")
//    println(produtos)
//    }

//fun main() {
//
//    var i = 0
//
//    while ( 1 < 2 ) {
//        println(i)
//
//        i++
//    }
//}


//fun main(){
//    val carros = listOf("corsa", "celta", "fusca")
//
//    for ((indice, carro) in carros.withIndex()) {
//        println("O modelo $carro esta no indice $indice")
//    }
//




//fun main(){
//    val carros = listOf("celta", "corsa", "fusca", "500", "kwid")
//
//    for ( (indice, carro) in carros.withIndex() ) {
//        println("O modelo do $carro esta na posição $indice")
//    }
//}

//fun main(){
//    fun mandaSalve(nome: String, saudacao: String) {
//        println("Salve $nome! $saudacao")
//    }
//    mandaSalve(nome = "Joao", saudacao = "Tamo junto!")
//    mandaSalve(saudacao = "Tudo bom ?", nome = "Paulo")
//}


//fun main(){
//    val soma: (a: Int, b: Int) -> Double = { x, y -> (x + y).toDouble()  }
//
//    val result = soma(3, 4)
//
//    println(result)
//}



//fun main(){

//    fun questao1(a : Int) {
//        val x = 2
//
//        if (a % x == 0){
//            println("par")
//        }else
//            println("impar")
//    }
//    println(questao1(6))


//    fun questao2(a: Int){
//        val numero = a
//        if (numero >= 1){
//            println("numero $numero e positivo")
//    }else if (numero <= -1){
//       println("numero $numero e negativo")
//    }else{
//        println("numero $numero")
//        }
//    }
//    println(questao2(5))


//    fun questao3(a: Int){
//        val idade = a
//        if(idade <= 12){
//            println("Criança")
//        }else if(idade <= 17){
//            println("Adolescente")
//        }else if(idade <= 59){
//            println("Adulto")
//        }else if (idade >= 60){
//            println("Idoso")
//        }
//    }
//    println(questao3(20))



//    fun questao4(a: Int) {
//        val numero = 1..10
//
//        println("Tabuada do Senas, multiplicando por $a:")
//
//        for (i in numero) {
//            val resultado = a * i
//            println("$a x $i = $resultado")
//        }
//    }
//    println(questao4(5))



//    fun questao5(a: Int, b: Int, c: Int, d: Int, e: Int){
//        val array = arrayOf(a,b,c,d,e)
//
//        var soma = (array.sum())
//        println("O valor da soma é $soma")
//
//
//    }
//    questao5(5,5,5,5,10)



//    fun questao6(a: Int, b: Int, c: Int, d: Int, e: Int){
//        val array = arrayOf(a,b,c,d,e)
//
//        var maiorNumero = array[0]
//        for (numero in array) {
//            if (numero > maiorNumero) {
//                maiorNumero = numero
//            }
//        }
//        println("O maior numero é $maiorNumero")
//    }
//println(questao6(-7,-1,-9,-5,-6))




//    fun questao7() {
//        val numeros = 15 downTo 0
//
//        for (i in numeros) {
//            print("$i ")
//        }
//    }
//    println(questao7())
//}



//    fun questao8(a: Int, b: Int, c: Int, d: Int, e: Int) {
//        val array = arrayOf(a, b, c, d, e)
//        var somaPares = 0
//
//        for (numero in array) {
//            if (numero % 2 == 0) {
//                somaPares += numero
//            }
//        }
//
//        println("A soma dos números pares é: $somaPares")
//    }
//    println(questao8(1,4,6,8,9))



//    fun questao9 (a: Int){
//        val soma = a * 2
//
//        println(soma)
//    }
//    println(questao9(5))



//    fun questao10(a: Int, b: Int, c: Int){
//
//        val media = ((a + b + c)/3)
//
//        println(media)
//    }
//    println(questao10(9, 5,7))



//    fun questao11(c: Double){
//        val f =(c * 1.8 + 32)
//        println(f)
//    }
//    println(questao11(8.0))




//}

fun main(){

//    val numeros = (1 .. 20).toList()
//
//    val pares = numeros.filter { numero -> numero % 2 == 0 }
//
//    println(pares)

//    val numeros = listOf(1, 2, 3, 4, 54)
//
//    val result = numeros.reduce { maiorValor, numero ->
//        if (numero > maiorValor)
//            numero
//        else
//            maiorValor
//    }
//
//    println(result)

    val numeros = listOf((1, 2, 3, 4, 5))

    val somaDobropares = numeros
        .filter { numero -> numero % 2 == 0 }
        .map { numeroPar -> numeroPar * 2 }
        .reduce { somaDobroPares, numeroParDobrado ->
            somaDobroPares + numeroParDobrado
        }

    println(somaDobropares)
}