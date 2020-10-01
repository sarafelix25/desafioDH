package Desafio.DH.Kotlin

class Principal {
}
//Registrar dois professores titulares e dois professores adjuntos. (Inventar todos os seus valores)

//Registrar dois cursos.

// Nome do curso: Full Stack
//Código do curso: 20001
//Quantidade máxima: 3

//Nome do curso: Android
//Código do curso: 20002
//Quantidade máxima: 2

//Alocar um professor titular e um adjunto para cada curso.

//Matricular dois alunos no curso de Full Stack.

//Matricular três alunos no curso de Android.
fun main(){
    val digitalHouseManager: DigitalHouseManager

    digitalHouseManager.registrarProfessorTitular ("Ana", "Professor Titular", 1, "Web Full Stack", "blabla")
    digitalHouseManager.registrarProfessorTitular ("Belo", "Professor Titular", 2, "Kotlin", "kaka")

    digitalHouseManager.registrarProfessorAdjunto("Carlos","Carvalho", 3)
    digitalHouseManager.registrarProfessorAdjunto("Daniela", "Damasco", 4)


}