import kotlinx.coroutines.*

fun main(){
    runBlocking {
        launch {
            val contenido =
                async(start = CoroutineStart.LAZY) {  // Similar al anterior pero en este caso los 1000 no se empiezan
                    // hasta que hacemos el await.
                    delay(1000)
                    "Hola"
                }
            println("Estoy listo para imprimir pero \"a\" aún está vacia por lo que toca esperar")
            println(contenido.await())
            println("Impreso!")
        }
    }
    println("Fuera del runBlocking")
}