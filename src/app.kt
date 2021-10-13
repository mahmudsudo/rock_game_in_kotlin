fun main(){
    val gameArray: Array<String> = arrayOf("rock","paper","scissors")
   val gameChoice= getGameChoice(gameArray)
    val userChoice = getUserChoice(gameArray)
    println(printResult(userChoice, gameChoice))
}

fun getGameChoice(param: Array<String>): String = param[(Math.random() * param.size).toInt()]
fun getUserChoice(param: Array<String>): String {
    var isValidChoice = false
     var userChoice = ""
    print("please enter one of the following :")
    for (option in param){
        print("$option  ")
    }
    val userInput = readLine()
  while (!isValidChoice){
      if (userInput!=null && userInput in param){
          isValidChoice=true
          userChoice=userInput
      }
      if (!isValidChoice){
          println("you must enter a valid option")
      }

  }
    return userChoice
}
fun printResult(userChoice: String, gameChoice: String): String {
    return if ((userChoice == "rock" && gameChoice == "scissors") ||
        (userChoice == "paper" && gameChoice == "rock") ||
        (userChoice == "scissors" && gameChoice == "paper")
    ) {
        "you won!!!! the game option was $gameChoice"
    } else if (userChoice == gameChoice) {
        "a tie the game option was $gameChoice"
    } else {
        "you lose!!!!!! the game option was $gameChoice"
    }
}

