import kotlin.random.Random

class AP2Questao6 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val supermercado = SuperMercadoWeb()
            val estoque = supermercado.getEstoque()
            val carrinho = supermercado.carrinho

            val itensNoEstoque = ArrayList(estoque.getItens())
            val quantidadeItensNoEstoque = itensNoEstoque.size

            val random = Random.Default
            val quantidadeItensAleatoria = random.nextInt(1, quantidadeItensNoEstoque + 1)

            for (i in 1..quantidadeItensAleatoria) {
                val itemAleatorio = itensNoEstoque[random.nextInt(quantidadeItensNoEstoque)]
                carrinho.adicionaItem(itemAleatorio, estoque)
                itensNoEstoque.remove(itemAleatorio)
            }

            println("Itens no carrinho:")
            carrinho.mostraItensNoCarrinho()
            println("Quantidade total de itens no carrinho: ${carrinho.qtdItens()}\n")

            println("Itens restantes no estoque:")
            estoque.mostraItens(itensNoEstoque)
            val totalItensEstoque = estoque.qtdItens()
            println("Total de Itens no Estoque: $totalItensEstoque")
        }
    }
}
