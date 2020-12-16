import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay

import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

val mutex = Mutex()

fun main() {
    for (i in 1..10){
        GlobalScope.launch {
            escribirConMutex(i)
        }
    }
    Thread.sleep(12000)
}

suspend fun escribirConMutex(i : Int) {
    mutex.withLock {
        println("Empiezo a escribir $i")
        delay(1000)
        println("Termino de escribir $i")
    }
}
