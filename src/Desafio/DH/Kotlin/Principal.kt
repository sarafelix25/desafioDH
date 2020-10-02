package Desafio.DH.Kotlin

fun main() {
    val digitalHouseManager: DigitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarProfessorTitular("Ana", "Professor Titular", 1, 222, "Web Full Stack")
    digitalHouseManager.registrarProfessorTitular("Belo", "Professor Titular", 2, 223, "Kotlin")

    digitalHouseManager.registrarProfessorAdjunto("Carlos", "Carvalho", 3, 232, 4)
    digitalHouseManager.registrarProfessorAdjunto("Daniela", "Damasco", 4, 233, 5)

    digitalHouseManager.registrarCurso(" Full Stack ", 20001, 3)
    digitalHouseManager.registrarCurso(" Android ", 20002, 2)

    digitalHouseManager.alocarProfessores(20001, 222, 232)
    digitalHouseManager.alocarProfessores(20002, 223, 233)

    digitalHouseManager.registrarAluno(" aluno ", " um ", 1)
    digitalHouseManager.registrarAluno(" aluno ", " dois ", 2)
    digitalHouseManager.registrarAluno(" aluno ", " três ", 3)

    digitalHouseManager.matricularAluno(1, 20001)
    digitalHouseManager.matricularAluno(2, 20001)
    digitalHouseManager.matricularAluno(1, 20002)
    digitalHouseManager.matricularAluno(2, 20002)
    digitalHouseManager.matricularAluno(3, 20002)

    print(digitalHouseManager)
}


