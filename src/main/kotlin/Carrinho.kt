class Carrinho {
    private val itens: MutableList<ItemProduto> = mutableListOf()

    fun adicionaItem(item: ItemProduto, estoque: Estoque) {
        if (estoque.saiItem(item)) {
            itens.add(item)
        }
    }

    fun mostraItens() {
        for (item in itens) {
            val produto = item.produto
            println("${produto.codigo}, ${produto.nome}, Quantidade: 1, Preço: ${produto.preco}")
        }
    }

    fun totalAPagar(): Double {
        var total = 0.0
        for (item in itens) {
            total += item.produto.preco
        }
        return total
    }

    fun mostraItensNoCarrinho() {
        for (item in itens) {
            val produto = item.produto
            println("${produto.codigo}, ${produto.nome}, Quantidade: 1, Preço: ${produto.preco}")
        }
    }
    fun mostraItens(itensNoEstoque: List<ItemProduto>) {
        for (item in itensNoEstoque) {
            val produto = item.produto
            println("${produto.codigo}, ${produto.nome}, Quantidade: 1, Preço: ${produto.preco}")
        }
    }

    fun qtdItens(): Int {
        return itens.size
    }

}

