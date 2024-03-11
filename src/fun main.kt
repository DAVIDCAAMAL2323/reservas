[7:56 a. m., 22/2/2024] *-*: fun main() {
    val hotel = Hotel()
    val scanner = Scanner(System.in)

    while (true) {
        println("1. Gestionar habitaciones")
        println("2. Gestionar reservas")
        println("3. Gestionar clientes")
        println("4. Salir")
        println("Seleccione una opción: ")
        val opcion = scanner.nextInt()

        when (opcion) {
            1 -> gestionarHabitaciones(hotel, scanner)
            2 -> gestionarReservas(hotel, scanner)
            3 -> gestionarClientes(hotel, scanner)
            4 -> break
            else -> println("Opción no válida")
        }
    }
}

fun gestionarHabitaciones(hotel: Hotel, scanner: Scanner) {
    // Implementar lógica para gestionar habitaciones
}

fun gestionarReservas(hotel: Hotel, scanner: Scanner) {
    // Implementar lógica para gestionar reservas
}

fun gestionarClientes(hotel: Hotel, scanner: Scanner) {
    // Implementar lógica para gestionar clientes
}
class Hotel {
    val habitaciones = mutableListOf<Habitacion>()
    val reservas = mutableListOf<Reserva>()
    val clientes = mutableListOf<Cliente>()

    // Métodos para gestionar habitaciones, reservas y clientes
}