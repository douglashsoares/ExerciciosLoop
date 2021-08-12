import java.lang.System.`in`
import java.util.*

class Exercicios {

    fun ex1 (){

        var soma : Int = 0

        println("Coloque até que numero você quer que some: ")
         var num = readLine()!!.toInt()

        for (i in 1..num){

            soma += i
            println(soma)

        }

//        val texto = "salguodLindao"
//
//        var novoTexto = ""
//
//        val caracter = 'o'
//
//        for (i in 0 until texto.length){
//            if(texto.get(i) != caracter ){
//                novoTexto += texto[i]
//            }
//        }
//        println(novoTexto)
 }


    fun ex2() {

        /*
        a = 1
        e = 2
        i = 3
        o = 4
        u = 5
        */


        var texto = "Antonio lindo"
        var textoCodificado = ""

        for(i in 0..texto.length-1){

            if(texto[i] == 'a' || texto[i] ==  'A' ){

                textoCodificado += '1'

            }else if (texto[i] == 'e'){

                textoCodificado += '2'

            }else if (texto[i] == 'i'){

                textoCodificado += '3'

            }else if (texto[i] == 'o'){

                textoCodificado += '4'

            }else if (texto[i] == 'u'){

                textoCodificado += '5'

            }else{

                textoCodificado += texto[i]
            }

        }
         println(textoCodificado)

    }

    fun ex3(){

        var texto = "Antonio"
        var textoInvertido = ""
        for(i in texto.length-1 downTo 0){

            textoInvertido += texto[i]

        }
        println(textoInvertido)

    }

    fun ex4 (){

        var texto = "osso"
        var textoInvertido = ""

        for(i in texto.length-1 downTo 0){

            textoInvertido += texto[i]

        }

        if (texto == textoInvertido){

            println("Essa Palavra é um PALINDROMO")
        }else{

            println("Essa Palavra NãO é um PALINDROMO ")
        }


    }

    fun ex5(){

        var palavra : String = "Devagar"
        var contadorDeVogal : Int = 0
        var contadorDeConsoantes : Int = 0

        for(i in 0..palavra.length-1){

            if(palavra[i] == 'a' || palavra[i] == 'e' || palavra[i] == 'i' || palavra[i] == 'o' ||
                palavra[i] == 'u'){

                contadorDeVogal ++

            } else if(palavra[i] == 'A' || palavra[i] == 'E' || palavra[i] == 'I' || palavra[i] == 'O' ||
                palavra[i] == 'U'){

                contadorDeVogal ++

            }else {

                contadorDeConsoantes ++

            }

        }

        println("Essa palavra tem $contadorDeVogal Vogais e $contadorDeConsoantes Consoantes")

    }


    fun ex6() {

        var contador = 50

        var atual = 0
        var proximo = 1
        var soma = atual



        for (i in 1..contador){
            println(atual)

            soma = atual + proximo

            atual = proximo

            proximo = soma

        }


        



    }



}