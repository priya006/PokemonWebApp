package com.pokemonbackend.demo.leetcode.extra

//https://leetcode.com/problems/count-primes/description/
//https://stackoverflow.com/questions/34966824/count-the-number-of-prime-numbers-less-than-a-non-negative-number-n-in-python

class CountPrimes {
    fun countPrimes(n: Int): Int {
        if (n <= 1) return 0
        if (n == 2) return 1 // Special case for n = 2, as 2 is a prime number
        val isPrime = BooleanArray(n) { true }
        isPrime[0] = false
        isPrime[1] = false

        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (isPrime[i]) {
                for (j in i * i until n step i) {
                    isPrime[j] = false
                }
            }
        }

        return isPrime.count { it == true }
    }
}

//Hint: Sieve of Eratosthenes. Think of the big matrix. So the for loop has Math.sqrt+1
//Make the prime numbers as false, make the edge case as false.
//Now count the remaining ones from booleanArray