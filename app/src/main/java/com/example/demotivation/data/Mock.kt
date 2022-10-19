package com.example.demotivation.data

import com.example.demotivation.infra.MotivationConstants
import kotlin.random.Random


data class Phrase(val descripton: String, val categoryId: Int) {}

class Mock {

    private val sunny = MotivationConstants.FILTER.SUNNY
    private val happy = MotivationConstants.FILTER.HAPPY
    private val all = MotivationConstants.FILTER.ALL

    private val mListPhrase = listOf<Phrase>(
        /* Phrase("Me rastejando por voce ? ", happy),
         Phrase("Esse sentimento corre em você tambem ? ", sunny),
         Phrase("Será que eu quero saber ? ", happy),
         Phrase("Você quer que eu me arraste de volta para você? ", sunny),
         Phrase("Toque no meu pescoço, e eu tocarei no seu ", happy),
         Phrase("Eu adoro o Barney Stinson ", sunny),
         Phrase("Bem vindos ao Hotel na California ", happy),
         Phrase("Então eu usarei minha voz, serei rude pra caralho ", sunny),
         Phrase("Porque está muito frio ", happy),
         Phrase("Alguns dançam para lembrar ", sunny),
         Phrase("Alguns dançam para esquecer ", happy),
         Phrase("Sexta é rock na minha guitarra ela quica ela sarra meu pinto é o slash ", sunny),
         */


        Phrase("Você é realmente um fracassado ", sunny),
        Phrase("Ela te deixou porque você é um lixo ", happy),
        Phrase("Ta no inferno?" +
                "abraça o capeta ", sunny),
        Phrase("A vida é muita curta e logo você vai morrer ", sunny),
        Phrase("Nenhum obstáculo é grande para quem desiste ", happy),
        Phrase("Lute como nunca" +
                "Perca como sempre ", sunny),
        Phrase("Não deixe uma frase motivacional melhorar o seu dia ", happy),
        Phrase("Você não é importante, DESISTA ", sunny),
        Phrase("Não há mal que derrube quem nasceu pra ficar no chão ", happy),
        Phrase("Pare de achar que ninguém gosta de você, comece a ter certeza ", sunny),
        Phrase("Você é mais" +
                "3., fraco do que parece ", happy),
        Phrase("Uma grande jornada termina com uma bela derrota ", sunny),
    )

    fun getPhrase(value: Int): String {
        val filtered = mListPhrase.filter { it.categoryId == value || value == all }
        return filtered[Random.nextInt(filtered.size)].descripton
    }

}