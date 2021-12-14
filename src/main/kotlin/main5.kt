import kotlinx.coroutines.*

fun main(){
    runBlocking {
        launch {
            val contenido = async {
                delay(1000)
                "Hola"
            }
            println("Estoy listo para imprimir pero \"contenido\" aún está vacío por lo que toca esperar")
            println(contenido.await())
            println("Impreso!")
        }
    }
    println("Fuera del runBlocking")
}