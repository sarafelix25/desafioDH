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

    fun registrarCurso(nome: String, codCurso: Int, maxAlunos: Int) {
        cursos.add(Curso(nome, codCurso, maxAlunos))
    }

    fun excluirCurso(codCurso: Int) {
        cursos.remove(cursos.find { it.codCurso == codCurso })
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, tempoCasa: Int, codProfessor: Int, horasMonitoria: Int) {
        professores.add(ProfessorAdjunto(nome, sobrenome, tempoCasa, codProfessor, horasMonitoria))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, tempoCasa: Int, codProfessor: Int, especialidade: String) {
        professores.add(ProfessorTitular(nome, sobrenome, tempoCasa, codProfessor, especialidade))
    }

    fun excluirProfessor(codProfessor: Int) {
        professores.remove(professores.find { it.codProfessor == codProfessor })
    }

    fun registrarAluno(nome: String, sobrenome: String, codAluno: Int) {
        alunos.add(Aluno(nome, sobrenome, codAluno))
    }

    fun matricularAluno(aluno: Aluno, curso: Curso) {

        if (curso.adicionarUmAluno(aluno)) {
            matriculas.add(Matricula(aluno, curso))
            println("Ok")
        } else {
            println("Matricula não realizada")
        }
    }

    fun alocarProfessores(codCurso: Int, codProfessorTitular: Int, codProfessorAdjunto: Int) {

        val professorTitular = professores.find { it.codProfessor == codProfessorTitular }
        val professorAdjunto = professores.find { it.codProfessor == codProfessorAdjunto }
        val curso = cursos.find { it.codCurso == codCurso }

        if (curso == null) {
            println("O curso não existe!")
            return
        }

        if (professorAdjunto == null) {
            println("O professor Adjunto não existe!")
            return
        }

        if (professorTitular == null) {
            println("O professor Titular não existe!")
            return
        }

        curso.ProfessorAdjunto = professorAdjunto as ProfessorAdjunto
        curso.ProfessorTitular = professorTitular as ProfessorTitular
    }

    fun consultaCurso(codAluno: Int) {

    }
}