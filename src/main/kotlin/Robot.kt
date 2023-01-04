import java.util.Calendar

class Robot(val robo:String, val me:String) {
    fun ringAlarm(time:String) = println("Hello, $me please wake up!! it's $time already!!")

    fun makeCoffee(typeOfCoffee: Coffee) = if (typeOfCoffee.black){
        println("$me, Your black coffee with ${typeOfCoffee.sugar} spoons of sugar is ready :)")
    }else{
        println("Your coffee with ${typeOfCoffee.sugar} spoons of sugar is ready :)")
    }

    fun heatWater(temp:Double) = println("Water with $temp is ready for bathing, take a bath now :)")

    fun packBag(day:Int){
        val sub = arrayOf("Networking","DBMS","Data Mining","Organisation Structure","Java","Data Structures")
        val message = "Hurry $me !! Books kept for today are : "
        when(day){
            Calendar.MONDAY -> println("$message${sub[5]}, ${sub[4]} & ${sub[5]}")
            Calendar.TUESDAY -> println("$message${sub[1]}, ${sub[5]} & ${sub[2]}")
            Calendar.WEDNESDAY -> println("$message${sub[4]}, ${sub[0]} & ${sub[3]}")
            Calendar.THURSDAY -> println("$message${sub[2]}, ${sub[4]} & ${sub[1]}")
            Calendar.FRIDAY -> println("$message${sub[4]}, ${sub[0]} & ${sub[5]}")
            else -> println("$me, its holiday today.Enjoy the day!!")
        }
    }

    fun cookFood(){
        val breakFast = arrayListOf<String>("Puri","Maggi","Pasta","Samosa")
        val lunch = arrayListOf<String>("Fish","Egg","chicken","Soybeans","Some vegetables")
        if(breakFast.random() == "Pasta"){
            println("Hey $me! today I cooked your favourite Pasta. :)")
        }else{
            println("Hey $me! Take your breakfast with ${breakFast.random()}.")
        }
        println("$me! lunch is ready to serve. Menu for lunch today is Rice & ${lunch.random()}.")
    }

    fun ironClothes(){
        val shirt = mutableListOf("Blue", "Green", "Orange", "Red", "Yellow", "Black")
        val pant = mutableListOf("Brown", "Black", "Gray")
        if (shirt.random() == "Blue"){
            println("Your favourite dresses are ready!! Blue shirt & ${pant.random()}")
        }else{
            println("Your Clothes are ready!! ${shirt.random()} shirt & ${pant.random()}")
        }

    }
}