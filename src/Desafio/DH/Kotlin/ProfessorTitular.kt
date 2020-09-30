package Desafio.DH.Kotlin

class ProfessorTitular(val nome: String = "", val sobrenome: String = "", var tempoCasa: Int = 0, var codProfessor: Int = 0, val especialidade: String = ""):
    Professor(nome, sobrenome, tempoCasa, codProfessor) {
}