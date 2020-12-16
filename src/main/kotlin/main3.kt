import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    println("Empiezo main2")
    runBlocking {
        println("Entro en el blocking")
        delay(3000)
        println("Salgo del blocking")
    }

    println("Main no ha seguido a lo suyo")

    println("Termina")
}
