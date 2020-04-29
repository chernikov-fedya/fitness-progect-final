class Man{
    var height : Double = 190.0
    var weight : Double = 85.0
    var imb : Double = weight / (height /100 * height /100)
    var rating : Double = 1000.0
}

val MAX_RATING = 2000
val MIN_RATING = 1000
val MIN_IMB = 10
val MAX_IMB = 64
val IMB_RATING_K = (MAX_RATING - MIN_RATING) / (MAX_IMB - MIN_IMB)

class Exer{
    var repeat : Int = 15
    var approach : Int = 3

    var weight: Double? = null
    var recommendWeight = 80.0
    var musclMult = 1
    fun getRating(imb : Double, rating : Double) : Double{
        var q = rating / imb / IMB_RATING_K
        println("Q = ${IMB_RATING_K}, q =$q")
        weight = recommendWeight
        println("W = $weight")

        var rating = weight!! * repeat * musclMult
        println("R = $rating")
        var ratingAllApproach = 0.0
        var step = 0.2
        for (i in 0 until approach) {
            ratingAllApproach += (1.0 + step) * rating
        }
        ratingAllApproach /= approach
        return ratingAllApproach
    }
}