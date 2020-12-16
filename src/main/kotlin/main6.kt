import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay

import kotlinx.coroutines.launch

fun main() {

    for (i in 1..10){
        GlobalScope.launch {
            escribirSinMutex(i)
        }
    }
    Thread.sleep(10000)
}

suspend fun escribirSinMutex(i : Int) {
    println("Empiezo a escribir $i")
    delay(1000)
    println("Termino de escribir $i")
}
