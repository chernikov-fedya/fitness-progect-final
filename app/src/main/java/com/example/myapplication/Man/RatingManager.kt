package com.example.myapplication.Man

import java.lang.Math.pow

open class RatingManager {
    open var MyRating:Double = 0.0
    //var counterRating : NewRank = NewRankGliko1()
//    fun set1 ( RDold :Double,ratingEnemy : Float, MyRating: Double, resulf: Int, RDenemy: Float): Double {
//       // this.MyRating = counterRating.setNMR(RDold, ratingEnemy, MyRating.toInt(), resulf, RDenemy )
//        //return MyRating
//    }

}

    abstract class NewRank{
        var K:Int = 0
        abstract fun setNMR(ratingEnemy : Double,r: Double, resulf : Double):Double
    }
    class NewRankElo:NewRank(){

        override fun setNMR(ratingEnemy : Double,r: Double, resulf : Double):Double{
            var WaitingResult = 1/(1 +  pow( 10.0 , ((ratingEnemy - r)/400)))
            if (WaitingResult > 0.92)
                WaitingResult = 0.92
            if (WaitingResult < 0.08)
                WaitingResult = 0.08
            AccountK(r)
            return r + K *(resulf - WaitingResult)
        }
        fun AccountK(r:Double) {
            if (r > 2400.0)
                K = 10
            else K = 40
        }

    }