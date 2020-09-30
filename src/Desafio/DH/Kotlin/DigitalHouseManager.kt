package Desafio.DH.Kotlin

class DigitalHouseManager {
    //aluno, professor, curso, matricula - MutableList<Elementos>
    //fun registrarCurso(nome: String, codigoCurso: Integer, quantidadeMaximaDeAlunos: Integer )
    //fun excluirCurso(codigoCurso: Integer)
    //fun registrarProfessorAdjunto(nome: String , sobrenome: String , codigoProfessor: Integer, quantidadeDeHoras: Integer)
    //fun registrarProfessorTitular(nome: String , sobrenome: String, codigoProfessor: Integer, especialidade: String)
    //fun excluirProfessor(codigoProfessor: Integer)
    //matricularAluno(nome: String, sobrenome: String, codigoAluno: Integer)
    //matricularAluno(codigoAluno: Integer, codigoCurso: Integer)
    //fun alocarProfessores(codigoCurso: Integer,codigoProfessorTitular: Integer, codigoProfessorAdjunto: Integer)

    val alunos = mutableListOf<Aluno>()
    val professores = mutableListOf<Professor>()
    val cursos = mutableListOf<Curso>()
    val matriculas = mutableListOf<Matricula>()

    fun registrarCurso(val nome: String = "", val codCurso: Int = 0, val maxAlunos: Int = 0){
        cursos.find { .. }
        cursos.add(Curso(val nome: String = "", val codCurso: Int = 0, val maxAlunos: Int = 0))
    }

    fun excluirCurso(val codCurso: Int = 0){
        cursos.removeAll(codCurso == codCurso)

    }

    fun registrarProfessorAdjunto(val nome: String = "", val sobrenome: String = "", var tempoCasa: Int = 0, var codProfessor: Int = 0, var horasMonitoria: Int = 0){
        professores.find {  }
        professores.add(val nome: String = "", val sobrenome: String = "", var tempoCasa: Int = 0, var codProfessor: Int = 0, var horasMonitoria: Int = 0)
    }
    fun registrarProfessorTitular(val nome: String = "", val sobrenome: String = "", var tempoCasa: Int = 0, var codProfessor: Int = 0, val especialidade: String = ""){
        professores.find {  }
        professores.add(val nome: String = "", val sobrenome: String = "", var tempoCasa: Int = 0, var codProfessor: Int = 0, val especialidade: String = "")
    }

    fun excluirProfessor(val codProfessor: Int){
        professores.removeAll(codProfessor == codProfessor)
    }

    fun registrarAluno(val nome: String = "", val sobrenome:String = "", var codAluno: Int = 0){

        alunos.find {  }
        alunos.add(Aluno(val nome: String = "", val sobrenome:String = "", var codAluno: Int = 0))
    }

    fun matricularAluno(val aluno: Aluno, val curso: Curso){

        val curso = cursos.find {  }

        val aluno = alunos.find {  }

        if (curso.adicionarUmAluno(aluno)){
            matriculas.add(Matricula(aluno,curso))
            println("Ok")
        } else{
            println("Matricula não realizada")
        }
    }

    fun alocarProfessores(codCurso: Int,codProfessorTitular: Int, codProfessorAdjunto: Int){

        val professorTitular = professores.find {  }
        val professorAdjunto = professores.find {  }
    }

    fun consultaCurso(codAluno: Int){

        val matricula = matriculas.find {  }
    }

}