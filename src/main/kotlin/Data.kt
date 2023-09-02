class Data(private var dia: Int, private var mes: Int, private var ano: Int) {
    override fun toString(): String {
        return String.format("%02d/%02d/%04d", dia, mes, ano)
    }

    fun setData(novoDia: Int, novoMes: Int, novoAno: Int) {
        dia = novoDia
        mes = novoMes
        ano = novoAno
    }

    fun antes(outraData: Data): Boolean {
        return (ano < outraData.ano) || (ano == outraData.ano && mes < outraData.mes) || (ano == outraData.ano && mes == outraData.mes && dia < outraData.dia)
    }

    fun depois(outraData: Data): Boolean {
        return (ano > outraData.ano) || (ano == outraData.ano && mes > outraData.mes) || (ano == outraData.ano && mes == outraData.mes && dia > outraData.dia)
    }

    fun igual(outraData: Data): Boolean {
        return dia == outraData.dia && mes == outraData.mes && ano == outraData.ano
    }

    companion object {
        fun dataHoje(): Data {
            val currentDate = java.util.Calendar.getInstance()
            return Data(currentDate.get(java.util.Calendar.DAY_OF_MONTH), currentDate.get(java.util.Calendar.MONTH) + 1, currentDate.get(java.util.Calendar.YEAR))
        }
    }
}
