import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.random.Random



fun main() {
    funcionErronea()
}

fun funcionErronea() {
    val c = AtomicInteger()

    runBlocking {

        for (i in 1..100)
            launch {
                delay(1000L)
                val sumar = Random.nextInt(0, 9)
                println("Voy a sumar $sumar")
                c.addAndGet(sumar)
            }
    }
    // Valor erroneo, hay valores que no se han terminado de sumar
    println("el resutlado es ${c.get()}")
}

