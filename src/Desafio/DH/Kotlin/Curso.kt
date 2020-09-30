package Desafio.DH.Kotlin

 class Curso(val nome: String = "", val codCurso: Int = 0, val maxAlunos: Int = 0) {

    init var ProfessorTitular: ProfessorTitular
    init var ProfessorAdjunto: ProfessorAdjunto

    val alunosMatriculados: mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean {
        return (other).codCurso == this.codCurso
  }

   fun adicionarUmAluno(Aluno: Aluno): Boolean{
       return
       alunosMatriculados.add(Aluno)
   }

   fun excluirAluno(Aluno: Aluno){
       alunosMatriculados.remove(Aluno)
   }
}