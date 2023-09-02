class AP2Questao5 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val supermercado = SuperMercadoWeb()
            val estoque = supermercado.getEstoque()

            val itensNoEstoque = ArrayList(estoque.getItens())
            val carrinho = supermercado.carrinho

            for (item in itensNoEstoque.toList()) {
                val codigoNumerico = item.codigo.replace("[^0-9]".toRegex(), "").toInt()
                if (codigoNumerico % 2 != 0) {
                    carrinho.adicionaItem(item, estoque)
                    itensNoEstoque.remove(item)
                }
            }

            println("Itens no carrinho:")
            carrinho.mostraItensNoCarrinho()

            val precoTotalCarrinho = carrinho.totalAPagar()
            println("Preço total do carrinho: R$$precoTotalCarrinho\n")

            println("Itens restantes no estoque:")
            estoque.mostraItens(itensNoEstoque)
            val totalItensEstoque = estoque.qtdItens()
            println("Total de Itens no Estoque: $totalItensEstoque")
        }
    }
}
