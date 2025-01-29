const val HERO_NAME="Madrigal" //Compile time constant; assigned during compilation. Use SNAKE_CASE for naming such variables

fun main() {

    //Player introduction/definition
    println("The hero announces her presence to the world")
    println(HERO_NAME)
    //In Java notice these would be instance variables
    var playerLevel=4 // Notice that you use the var key word, then the name of the variable, semicolon then type
    val hasBefriendedBarbarians=true //Notice this is a boolean variable and it uses type inference.
    val hasAngeredBarbarians=false
    val playerClass= "paladin"
    println(playerLevel)

    val quest= if (playerLevel==1){
        "Meet Mr.Bubbles in the land of soft things"
    }else if (playerLevel<=5){
        //Logical operators used to declare variables
        //It makes code much cleaner when you use conditions later
        val canTalkToBarbarians= !hasAngeredBarbarians && (hasBefriendedBarbarians || playerClass=="Barbarians")

        if (canTalkToBarbarians){
            "Convince the Barbarians to call off their invasion"
        } else {
            "Save the town from the Barbarian Invasion"
        }
    }
    else if (playerLevel==6)
    {
        "Locate the enchanted sword"
    }
    else if (playerLevel==7){
        "Recover the longest-lost artifact of creation"
    }
    else if (playerLevel==8){
        "defeat Nogartse, bringer of death and eater of worlds"
    }
    else {
        "There are no quests right now"
    }

    //Notice that lots of println functions have been reduced to just 1.
    //Makes the code cleaner and much easier to read.
    println("The hero approaches the bounty-board. It reads:")
    println(quest)

    //Task execution
    println("Time passes...")
    println("The hero embarks from her quest")

    //Next Level
    playerLevel++ //Variables can be reassigned as long as you respect the static type System, but incrementing is better and more flexible
    println(playerLevel)
}