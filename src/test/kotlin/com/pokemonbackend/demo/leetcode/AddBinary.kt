package com.pokemonbackend.demo.leetcode

class AddBinary {

    fun addTheBinaries(a : String, b :String):String{
        var stringBuilder = StringBuilder()
        var i = a.length-1
        var j = b.length-1
        var carry = 0

        while(i>= 0 || j >=0){
            var sum = carry
            sum += a[i--] - '0'
            sum += b[j--] - '0'
            stringBuilder.append(sum%2)
            carry = sum/2

        }
        if(carry != 0) stringBuilder.append(carry)

        return stringBuilder.reverse().toString()
    }



}

fun main(){
    val addBinary = AddBinary()
    var a = "11"
    var b = "1"
    println(addBinary.addTheBinaries(a,b))

}

