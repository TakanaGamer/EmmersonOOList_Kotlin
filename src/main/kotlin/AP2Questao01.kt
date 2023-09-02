class AP2Questao1 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val supermercado = SuperMercadoWeb()
            val estoque = supermercado.getEstoque()
            val itens = estoque.getItens()

            println("codigo, Nome, Genero, Marca, Preco, Validade, Valido?")
            for (item in itens) {
                val produto = item.produto
                val validadeString = item.dataValidade.toString()
                val valido = if (item.valido()) "Sim" else "Não"

                println("${produto.codigo}, ${produto.nome}, ${produto.genero.get()}, ${produto.marca.nome}, ${produto.preco}, $validadeString, $valido")
            }

            val totalItens = estoque.qtdItens()
            println("\nTotal de Itens: $totalItens")
        }
    }
}
