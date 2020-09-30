package Desafio.DH.Kotlin

class Aluno(val nome: String = "", val sobrenome:String = "", var codAluno: Int = 0) {

    override fun equals(other: Any?): Boolean{

        return  (Aluno) .codAluno == this.codAluno
        //falta mais alguma coisa, mas não sei o que kkkkkk
    }
}