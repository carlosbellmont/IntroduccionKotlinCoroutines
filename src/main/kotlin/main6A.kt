import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

val mutex = Mutex()

var caja2 = 0

fun main() {
    runBlocking {
        for (i in 1..1000) {
            launch {
                mutex.withLock {
                    caja2 = caja2 + 1
                }
            }
        }
    }
    println("caja2 = $caja2")
}