class HabitacionController {
    private val habitaciones = mutableListOf<Habitacion>()

    fun agregarHabitacion(habitacion: Habitacion) {
        habitaciones.add(habitacion)
    }

    fun eliminarHabitacion(numero: Int) {
        habitaciones.removeIf { it.numero == numero }
    }

    fun actualizarHabitacion(numero: Int, nuevaInformacion: Map<String, Any>) {
        habitaciones.find { it.numero == numero }?.apply {
            nuevaInformacion["tipo"]?.let { tipo = it as String }
            nuevaInformacion["capacidad"]?.let { capacidad = it as Int }
            nuevaInformacion["precio"]?.let { precio = it as Double }
        }
    }

    fun obtenerHabitacion(numero: Int): Habitacion? {
        return habitaciones.find { it.numero == numero }
    }
}
