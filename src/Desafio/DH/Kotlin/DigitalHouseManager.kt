package Desafio.DH.Kotlin

class DigitalHouseManager() {
    val alunos = mutableListOf<Aluno>()
    val professores = mutableListOf<Professor>()
    val cursos = mutableListOf<Curso>()
    var matriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codCurso: Int, maxAlunos: Int) {
        cursos.add(Curso(nome, codCurso, maxAlunos))
    }

    fun excluirCurso(codCurso: Int) {
        cursos.remove(cursos.find{it.codCurso == codCurso})
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, tempoCasa: Int, codProfessor: Int, horasMonitoria: Int) {
        professores.add(ProfessorAdjunto(nome, sobrenome, tempoCasa, codProfessor, horasMonitoria))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, tempoCasa: Int, codProfessor: Int, especialidade: String) {
        professores.add(ProfessorTitular(nome, sobrenome, tempoCasa, codProfessor, especialidade))
    }

    fun excluirProfessor(codProfessor: Int) {
        professores.remove(professores.find{it.codProfessor == codProfessor})
    }

    fun registrarAluno(nome: String, sobrenome: String, codAluno: Int) {
        alunos.add(Aluno(nome, sobrenome, codAluno))
    }

    fun matricularAluno(codAluno: Int, codCurso: Int) {
        val aluno = alunos.find {it.codAluno == codAluno}
        val curso = cursos.find {it.codCurso == codCurso}

        if (aluno == null){
            println("O aluno não existe!")
            return
        }
        if (curso == null){
            println("O curso não existe!")
            return
        }
        if (curso.adicionarUmAluno(aluno)) {
            matriculas.add(Matricula(aluno, curso))
            println("Ok")
        } else {
            println("Máximo de alunos atingido para o curso ${curso}")
        }
        matriculas.add(Matricula(aluno, curso))
    }

    fun alocarProfessores(codCurso: Int, codProfessorTitular: Int, codProfessorAdjunto: Int) {
        val professorTitular = professores.find{it.codProfessor == codProfessorTitular}
        val professorAdjunto = professores.find{it.codProfessor == codProfessorAdjunto}
        val curso = cursos.find{it.codCurso == codCurso}

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
        val matriculas = matriculas.find{it.aluno.codAluno == codAluno}

        if (matriculas == null){
            println("Matrícula de aluno não cadastrada")
        } else {
            println("O aluno está matriculado no curso ${matriculas.curso.nome}")
        }
    }

    override fun toString(): String {
        return "Alunos: ${alunos}\nProfessores: ${professores}\nCursos: ${cursos}\nMatrículas: $matriculas\n"
    }
}