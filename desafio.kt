// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario ( val nome: String,val emal: String,val telefone: String,val cpf: String )

data class ConteudoEducacional(var nome: String,val descricao : String,val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", "Este conteúdo é uma introdução à linguagem de programação Kotlin.", "Programação", 120, Nivel.BASICO)
        val conteudo2 = ConteudoEducacional("Estruturas de dados em Kotlin", "Este conteúdo aborda as estruturas de dados mais comuns usadas na programação.", "Programação", 180, Nivel.INTERMEDIARIO)
        val conteudo3 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin", "Este conteúdo cobre conceitos de programação orientada a objetos em Kotlin.", "Programação", 240, Nivel.DIFICIL)

        val formacao = Formacao("Desenvolvimento em Kotlin", listOf(conteudo1, conteudo2, conteudo3))


        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
