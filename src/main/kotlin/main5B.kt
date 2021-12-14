import kotlinx.coroutines.*
import kotlin.random.Random


fun main() {
    runBlocking {
        //funcionSinDeferred()
        coroutineScope {  }
        funcionConDeferred()
    }
}

suspend fun funcionSinDeferred() = coroutineScope {
    println("Entro")

    launch {
        println("Entro1")
        val list = mutableListOf<Int>()

        runBlocking {
            for (i in 1..100) {
                launch {
                    delay(100)
                    list.add(Random.nextInt(0, 9))
                }
            }
        }
        println("El resultado sin Deferred es una lista de ${list.size} elementos con \n$list ")
    }

}


suspend fun funcionConDeferred() = coroutineScope {
    val listOfDeferred = mutableListOf<Deferred<Int>>()

    launch {
        for (i in 1..100) {
            val a = async {
                delay(Random.nextInt(8000).toLong())
                Random.nextInt(0, 9)
            }
            println("Inserto elemento a esperar")
            listOfDeferred.add(a)
        }
        println("Esperando...")
    }
    delay(100)
    println("El resultado Deferred es una lista de ${listOfDeferred.awaitAll().size} elementos con \n${listOfDeferred.awaitAll()} ")
}




