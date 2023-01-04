fun main(){
    val bidhu = Robot("Bidhushekhar","Soudeep")
    println("Hey, ${bidhu.me}!! My name is ${bidhu.robo} and I am your friend from now!!")
    bidhu.ringAlarm("6:30 am")
    bidhu.makeCoffee(Coffee(true,3))
    bidhu.heatWater(38.5)
    bidhu.packBag(3)
    bidhu.cookFood()
    bidhu.ironClothes()
}