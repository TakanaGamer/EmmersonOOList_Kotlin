class AP2Questao4 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {//sem Array<String> esta classe nao pose ser rodada
            //Criacao de uma instacia da classe SuperMercadoWeb chamada
            val supermercado = SuperMercadoWeb()
            //a intancia da classe realiza o metodo getEstoque e o valor resultante
            //é passado para a variavel estoque
            val estoque = supermercado.getEstoque()

            //com o valor obtido em estoque, chamaremos a funcao ContarItensValidos,
            // que basicamente retorna o valor de itens nao vencidos
            val itensValidos = estoque.contarItensValidos()
            // com o valor obtido em estoque, chamaremos o metodo contarItensVencidos
            // da classe Estoque e com isso teremos a quantidade de itens vencidos
            val itensVencidos = estoque.contarItensVencidos()


            //por fim obteremos o tatal de intens chamando a funcao qtdItens e a variavel totaldeitens recebe o resultado
            val totalItens = estoque.qtdItens()
            //a soma entre vencidos e nao vencidos é feita e o resultado é passado para a variavel somatotal
            val somaItensValidosEVencidos = itensValidos + itensVencidos

            //print dos resultados
            println("Quantidade de itens válidos: $itensValidos")
            println("Quantidade de itens vencidos: $itensVencidos")
            println("Total de itens: $totalItens")
            println("Soma de itens válidos e vencidos: $somaItensValidosEVencidos")

            if (somaItensValidosEVencidos == totalItens) {//condicional para verificar se o tatal obtido corresponde ao total eem estoque
                println("A soma de itens válidos e vencidos é igual ao total de itens no estoque.")
            } else {
                println("A soma de itens válidos e vencidos não é igual ao total de itens no estoque.")
            }
        }
    }
}
