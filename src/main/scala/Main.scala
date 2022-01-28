import java.util.Scanner

object Main {

  def main(args: Array[String]): Unit = {
    var scanner = new Scanner(System.in)
    //TODO Implement time thing var time = "8:00AM"
    mainMenu(scanner)
    identifyAnimal(scanner)
  }

  def mainMenu(scanner: Scanner): Unit = {

    println("==============================")
    println("Welcome to a walk in the zoo")
    println("Where would you like to go?")
    println("1. The reptile exhibit")
    println("2. The mammal exhibit")
    println("3. Sea lion show")
    println("4. Go home")
    println("==============================")
    var menuChoice = scanner.nextInt
    scanner.nextLine()

    var endProgram = false

    while (!endProgram) {
      menuChoice match {
        case 1 =>
          reptiles()
          mainMenu(scanner)
        case 2 =>
          reptiles()
          mainMenu(scanner)
        case 3 =>
          reptiles()
          mainMenu(scanner)
        case 4 =>
          endProgram = true
        case _ =>
          println("Invalid Choice")
          println("Please choose between 1-4")
          mainMenu(scanner)
      }
    }
  }

  def reptiles(): Unit = {
    println("Welcome to the reptile exhibit")
  }

  def identifyAnimal(scanner: Scanner): Unit = {
    println("how many animals did you see at the zoo today")
    var count = scanner.nextInt
    scanner.nextLine
    println("==============================")
    println("What animals did you see at the zoo today?")

    // try {

    //     if (classification != "reptiles"|| "mammals" || "sea lions") {

    //         badData = true
    //         throw new BadAnimalException

    //     } catch {
    //         case bde: BadDataEntryException => println("You did not type the correct input")
    //         case e: Exception => println("Exception was thrown, trying again..")
    //     }
    // }

    var animalArray = new Array[Any](count)
    for (i <- 0 to count - 1) {
      println("What's the name of the animal?")
      var name = scanner.nextLine
      println("What's the age of the animal?")
      var age = scanner.nextInt
      scanner.nextLine
      println("What's it's color?")
      var color = scanner.nextLine
      println("What's it's classification?")
      var classification = scanner.nextLine
      var animal = new Animal(name, age, color, classification)
      animalArray(i) = animal

    }
    animalArray.foreach(println)

    println("==============================")
  }
}
