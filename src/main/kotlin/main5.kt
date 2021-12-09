import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){
    GlobalScope.launch {
        val contenido = async {
            delay(1000)
            "Hola"
        }
        println("Estoy listo para imprimir pero \"contenido\" aún está vacío por lo que toca esperar")
        println(contenido.await())
        println("Impreso!")

    }
    Thread.sleep(5000)

}