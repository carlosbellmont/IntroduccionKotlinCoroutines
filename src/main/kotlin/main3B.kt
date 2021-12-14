import kotlinx.coroutines.*


fun main() {
    runBlocking { // this: CoroutineScope
        launch {
            delay(200L)
            println("Tarea del runBlocking")
        }

        coroutineScope { // Definimos un Scope, de aquí no salimos hasta que todas las corrutinas interiores hayan acabado.
            launch {
                delay(500L)
                println("Tarea del launch del coroutine scope")
            }

            delay(100L)
            println("Tarea del coroutine scope")
        }

        println("CoroutineScope superado")
    }
    println("runBlocking superado")

}

