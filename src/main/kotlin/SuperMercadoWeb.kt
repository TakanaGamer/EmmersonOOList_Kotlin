class SuperMercadoWeb {
    private val estoque: Estoque = Estoque()
    val carrinho: Carrinho = Carrinho()// era private mas tava comflito com a q5
    private val generos: MutableList<Genero> = mutableListOf()
    private val produtos: MutableList<Produto> = mutableListOf()
    private val marcas: MutableList<Marca> = mutableListOf()

    init {
        iniciaSupermercado()
    }

    private fun iniciaSupermercado() {
        // Inicializar marcas, produtos, generos e itens no estoque conforme necessário
        val marca1 = Marca("Marca1")
        val marca2 = Marca("Marca2")
        val marca3 = Marca("Marca3")

        val generoLeite = Leite("Leite")
        val generoPresunto = Presunto("Presunto")
        val generoAchocolatado = Achocolatado("Achocolatado")

        for (i in 1..10) {
            val produtoLeite = Produto("L${i}", "Leite Produto $i", 2.5 * i, marca1, generoLeite)
            val produtoPresunto = Produto("P${i}", "Presunto Produto $i", 3.0 * i, marca2, generoPresunto)
            val produtoAchocolatado = Produto("A${i}", "Achocolatado Produto $i", 1.8 * i, marca3, generoAchocolatado)

            produtos.add(produtoLeite)
            produtos.add(produtoPresunto)
            produtos.add(produtoAchocolatado)

            val itemLeite = ItemProduto("L${i}_123", Data.dataHoje(), produtoLeite)
            val itemPresunto = ItemProduto("P${i}_123", Data.dataHoje(), produtoPresunto)
            val itemAchocolatado = ItemProduto("A${i}_123", Data.dataHoje(), produtoAchocolatado)

            estoque.entraItem(itemLeite)
            estoque.entraItem(itemPresunto)
            estoque.entraItem(itemAchocolatado)
        }
    }

    fun getEstoque(): Estoque {
        return estoque
    }

    // Métodos adicionais e interações do supermercado podem ser adicionados aqui
}
