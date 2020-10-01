package Desafio.DH.Kotlin

open class Professor(val nome: String = "", val sobrenome: String = "", var tempoCasa: Int = 0, var codProfessor: Int = 0) {


    override fun equals(other: Any?): Boolean {

        other as Professor

        return other.codProfessor == this.codProfessor

    }
}
//professor(nome: String, sobrenome: String, tempoCasa: Int, codProfessor: Int ){
//tem uma especialidade
// val titular: String = "especialidade"

//quantidade de horas de monitoria
// val adjunto: Int = 0