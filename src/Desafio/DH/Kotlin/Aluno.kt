package Desafio.DH.Kotlin

class Aluno(val nome: String , val sobrenome:String , val codAluno: Int) {

    override fun equals(other: Any?): Boolean{

        other as Aluno

        return  other.codAluno == this.codAluno

    }
}