class ClienteController {
    private val clientes = mutableListOf<Cliente>()

    fun registrarCliente(cliente: Cliente) {
        clientes.add(cliente)
    }

    fun eliminarCliente(nombre: String) {
        clientes.removeIf { it.nombre == nombre }
    }

    fun actualizarCliente(nombre: String, nuevaInformacion: Map<String, Any>) {
        clientes.find { it.nombre == nombre }?.apply {
            nuevaInformacion["direccion"]?.let { direccion = it as String }
            nuevaInformacion["telefono"]?.let { telefono = it as String }
        }
    }

    fun obtenerCliente(nombre: String): Cliente? {
        return clientes.find { it.nombre == nombre }
    }
}
