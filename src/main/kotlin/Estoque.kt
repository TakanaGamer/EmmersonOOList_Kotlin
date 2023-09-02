class Estoque {
    private val itens: MutableList<ItemProduto> = mutableListOf()

    fun entraItem(item: ItemProduto) {
        itens.add(item)
    }

    fun saiItem(item: ItemProduto): Boolean {
        return itens.remove(item)
    }

    fun getItens(marca: Marca? = null, produto: Produto? = null, genero: Genero? = null): List<ItemProduto> {
        return itens.filter {
            (marca == null || it.produto.marca == marca) &&
                    (produto == null || it.produto == produto) &&
                    (genero == null || it.produto.genero == genero)
        }
    }

    fun qtdItens(): Int {
        return itens.size//retorna o tamanho total da lista
    }

    fun contarItensValidos(): Int {
        return itens.count {it.valido() }
    }

    fun contarItensVencidos(): Int {
        return itens.count { !it.valido() }
    }

    fun mostraItens(itensNoEstoque: List<ItemProduto>) {
        for (item in itensNoEstoque) {
            val produto = item.produto
            println("${produto.codigo}, ${produto.nome}, Quantidade: 1, Preço: ${produto.preco}")
        }
    }
}
