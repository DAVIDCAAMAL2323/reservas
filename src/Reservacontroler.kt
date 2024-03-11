class Reservacontroler{
    private val reservas = mutableListOf<Reserva>()

    fun hacerReserva(reserva: Reserva) {
        reservas.add(reserva)
    }

    fun cancelarReserva(reserva: Reserva) {
        reservas.remove(reserva)
    }

    fun obtenerReservasCliente(cliente: Cliente): List<Reserva> {
        return reservas.filter { it.cliente == cliente }
    }

    fun obtenerReservasHabitacion(numeroHabitacion: Int): List<Reserva> {
        return reservas.filter { it.habitacion.numero == numeroHabitacion }
    }
}