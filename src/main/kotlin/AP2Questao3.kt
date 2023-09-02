class AP2Questao3 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val supermercado = SuperMercadoWeb()
            val estoque = supermercado.getEstoque()
            val itensValidos = mutableListOf<ItemProduto>()

            val itens = estoque.getItens()
            for (item in itens) {
                if (item.valido()) {
                    itensValidos.add(item)
                }
            }

            val itensPorGeneroEMarca = HashMap<Pair<String, String>, MutableList<ItemProduto>>()
            for (item in itensValidos) {
                val genero = item.produto.genero.get()
                val marca = item.produto.marca.nome
                val chave = Pair(genero, marca)

                if (!itensPorGeneroEMarca.containsKey(chave)) {
                    itensPorGeneroEMarca[chave] = mutableListOf()
                }
                itensPorGeneroEMarca[chave]?.add(item)
            }

            println("codigo, nome, genero, marca, preco, validade, valido?")
            for ((chave, itensGrupo) in itensPorGeneroEMarca) {
                val (genero, marca) = chave
                println("== Gênero: $genero, Marca: $marca ==")
                for (item in itensGrupo) {
                    val produto = item.produto
                    val validadeString = item.dataValidade.toString()
                    val valido = if (item.valido()) "Sim" else "Não"

                    println("${produto.codigo}, ${produto.nome}, $genero, $marca, ${produto.preco}, $validadeString, $valido")
                }
                println("Total de Itens ($genero - $marca): ${itensGrupo.size}\n")
            }

            val totalItensMostrados = itensValidos.size
            println("Total de Itens Mostrados: $totalItensMostrados")
        }
    }
}
