class AP2Questao7 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val supermercado = SuperMercadoWeb()
            val estoque = supermercado.getEstoque()

            println("Digite o nome da marca:")
            val nomeMarca = readLine()

            if (nomeMarca != null) {
                val marca = Marca(nomeMarca)

                val itensMarca = estoque.getItens(marca = marca)
                val itensValidosMarca = itensMarca.filter { it.valido() }

                println("Itens válidos da marca $nomeMarca:")
                for (item in itensValidosMarca) {
                    val produto = item.produto
                    println("${produto.codigo}, ${produto.nome}, Preço: ${produto.preco}")
                }

                val totalItensMarca = itensValidosMarca.size
                println("Total de Itens da marca $nomeMarca: $totalItensMarca")
            } else {
                println("Nome da marca não fornecido.")
            }
        }
    }
}
