package Desafio.DH.Kotlin

 class Curso(val nome: String , val codCurso: Int , val maxAlunos: Int) {
     lateinit var ProfessorTitular: ProfessorTitular
     lateinit var ProfessorAdjunto: ProfessorAdjunto

     val alunosMatriculados: MutableList<Aluno> = mutableListOf<Aluno>()

     override fun equals(other: Any?): Boolean {
         other as Curso

         return other.codCurso == this.codCurso
  }

    fun adicionarUmAluno(Aluno: Aluno): Boolean{
        if (alunosMatriculados.size >= maxAlunos){

            return false
        }
        alunosMatriculados.add(Aluno)

        return true
    }

    fun excluirAluno(Aluno: Aluno){
       alunosMatriculados.remove(Aluno)
    }
 }
