class AP2Questao2 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val supermercado = SuperMercadoWeb()
            val estoque = supermercado.getEstoque()
            val itensPorGenero = HashMap<String, MutableList<ItemProduto>>()

            val itens = estoque.getItens()
            for (item in itens) {
                val genero = item.produto.genero.get()
                if (!itensPorGenero.containsKey(genero)) {
                    itensPorGenero[genero] = mutableListOf()
                }
                itensPorGenero[genero]?.add(item)
            }

            println("codigo, nome, genero, marca, preco, validade, valido?")
            for ((genero, itensGenero) in itensPorGenero) {
                println("== Gênero: $genero ==")
                for (item in itensGenero) {
                    val produto = item.produto
                    val validadeString = item.dataValidade.toString()
                    val valido = if (item.valido()) "Sim" else "Não"

                    println("${produto.codigo}, ${produto.nome}, $genero, ${produto.marca.nome}, ${produto.preco}, $validadeString, $valido")
                }
                println("Total de Itens ($genero): ${itensGenero.size}\n")
            }
        }
    }
}
