import java.lang.StringBuilder

class HangmanGraphics {

    val graphics = arrayOf(
        """
                +---+
                |   |
                    |
                    |
                    |
                    |
                =========

        
    """.trimIndent(),
        """
                +---+
                |   |
                O   |
                    |
                    |
                    |
                =========

            
        """.trimIndent(),
        """
            
            +---+
            |   |
            O   |
            |   |
                |
                |
            =========
            
        """.trimIndent(),

        """
                +---+
                |   |
                O   |
               /|   |
                    |
                    |
                =========
            
        """.trimIndent(),
        """
                +---+
                |   |
                O   |
               /|\  |
                    |
                    |
                =========
        """.trimIndent(),
        """
                +---+
                |   |
                O   |
               /|\  |
               /    |
                    |
                =========
        """.trimIndent(),
        """
                +---+
                |   |
                O   |
               /|\  |
               / \  |
                    |
                =========
        """.trimIndent()
    )

    fun hideWordGraphic(word: String): String {
        return buildString { for (i in word.indices) {
            this.append("_")
        } }
    }

    fun revealWordGraphic(char: Char, word: String, hiddenWord: String) : String{

        val hiddenWordCharArray = hiddenWord.toCharArray()
        for(i in hiddenWord.indices){
           if(word[i] == char){
               hiddenWordCharArray[i] = char
           }
        }
        return String(hiddenWordCharArray)
    }
}



