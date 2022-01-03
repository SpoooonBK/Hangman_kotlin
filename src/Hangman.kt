import java.io.File

class Hangman  (private val path : String ){

    private val file = File(path)
    private val wordList: List<String> = file.readLines()

    private fun chooseRandomWord() : String = wordList[(Math.random() * wordList.size).toInt()].lowercase().trim()
    private val looper = Looper(chooseRandomWord())

    fun run(){
        looper.run()

    }

}