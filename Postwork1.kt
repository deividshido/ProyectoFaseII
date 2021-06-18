fun main(){

    var nombre: String
    var edad: Int
    var ciudad: String
    var habilidad: String
    var instrumento: String
    var disponibilidadTiempo: String
    var notaMusical: String
    var notaMusical2: String

    println("¿Cuál es tu nombre?")

    nombre = readLine()?.toString().toString()

    println("Bienvenido $nombre")

    println("¿Qué edad tienes?")

    edad = readLine()?.toInt() as Int

    println("¿De qué ciudad eres?")

    ciudad = readLine()?.toString().toString()

    println("¿Haz tocado algún instrumento músical (Si/No)?")

    habilidad = readLine()?.toString().toString()

    if (habilidad == "Si"){
        println("¿Qué instrumento haz tocado?")
        instrumento= readLine()?.toString().toString()
    } else {
        println("¿Qué instrumento te gustaría aprender a tocar?")
        instrumento= readLine()?.toString().toString()
    }

    println("¿En qué días cuentas con mayor disponibilidad de tiempo?")
    disponibilidadTiempo= readLine().toString().toString()

    println("¿Reconoces el nombre de la siguiente nota musical?")
    println("**Comienza reproducción de nota músical**")

    notaMusical= readLine()?.toString().toString()

    if (notaMusical == "Sol"){
        println("Muy bien?")
        println("Veamos si puedes reconocer la siguiente")
        println("**Comienza reproducción de nota músical**")
        notaMusical2= readLine()?.toString().toString()

        println("Estamos procesando tu registro")
        println("Un momento por favor...")

        println("Registro exitoso")

        println("Nombre: $nombre")
        println("Edad: $edad")
        println("Ciudad de residencia: $ciudad")
        println("Lecciones recomendadas para $instrumento")
        println("Horario recomendado para lecciones: $disponibilidadTiempo")

        println("Estimado usuario, es un gusto para nosotros poder ser parte del primer paso este nuevo viaje")
        println("En cuanto contemos con un maestro adecuado a tus habilidades y disponibilidad nos comunicaremos contigo")

    } else {
        println("Estamos procesando tu registro")
        println("Un momento por favor...")

        println("Registro exitoso")

        println("Nombre: $nombre")
        println("Edad: $edad")
        println("Ciudad de residencia: $ciudad")
        println("Lecciones recomendadas para $instrumento")
        println("Horario recomendado para lecciones: $disponibilidadTiempo")

        println("Estimado usuario, es un gusto para nosotros poder ser parte del primer paso este nuevo viaje")
        println("En cuanto contemos con un maestro adecuado a tus habilidades y disponibilidad nos comunicaremos contigo")


    }

}


