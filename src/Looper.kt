class Looper(val word: String){

    private var playing = true

    fun run(): Boolean{


        println("Let's play Hangman")

        var graphicIndex = 0
        var hiddenWord = HangmanGraphics().hideWordGraphic(word)

        while(playing){

            println(HangmanGraphics().graphics[graphicIndex])
            println(hiddenWord)

            println("Enter a letter: ")

            val input = readln()
            var char = '?'
            if(input.length == 1){
                char = input[0]

            }
            if(word.contains(char, true)){
                hiddenWord = HangmanGraphics().revealWordGraphic(char, word, hiddenWord)
                if(hiddenWord == word){
                    println(word)
                    println("You Win!")
                    return false
                }
            }else graphicIndex++
            if(graphicIndex == HangmanGraphics().graphics.size-1){
                println(HangmanGraphics().graphics[graphicIndex])
                println(word)
                println("You Lose!")
                return false
            }

        }
        return false
    }

}