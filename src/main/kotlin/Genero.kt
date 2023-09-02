abstract class Genero(val nome: String) {
    abstract fun get(): String
    abstract fun set(novoValor: String)
}

class Leite(nome: String) : Genero(nome) {
    private var generoNome: String = nome

    override fun get(): String {
        return generoNome
    }

    override fun set(novoValor: String) {
        generoNome = novoValor
    }
}

class Presunto(nome: String) : Genero(nome) {
    private var generoNome: String = nome

    override fun get(): String {
        return generoNome
    }

    override fun set(novoValor: String) {
        generoNome = novoValor
    }
}

class Achocolatado(nome: String) : Genero(nome) {
    private var generoNome: String = nome

    override fun get(): String {
        return generoNome
    }

    override fun set(novoValor: String) {
        generoNome = novoValor
    }
}
