import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

var caja = 0

fun main() {
    runBlocking {
        for (i in 1..1000) {
            launch {
                caja = caja + 1
            }
        }
    }
    println("caja = $caja")
}

