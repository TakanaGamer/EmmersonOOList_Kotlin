class Produto(val codigo: String, val nome: String, val preco: Double, val marca: Marca, val genero: Genero) {
    fun obterMarca(): Marca {
        return marca
    }
}
