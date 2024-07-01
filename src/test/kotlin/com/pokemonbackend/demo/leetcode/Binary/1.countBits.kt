class Solution {

    fun countBits(n: Int): IntArray {
        val intArray = IntArray(n + 1)

        for (i in 0..n) {
            intArray[i] = hammingWeight(i)
        }

        return intArray
    }

    private fun hammingWeight(number: Int): Int {
        var count = 0
        var num = number // Use a different variable name to avoid shadowing

        while (num != 0) {
            count += num and 1 // Count the least significant bit that is set to 1
            num = num ushr 1 // Right shift to check the next bit
        }

        return count
    }
}

//Hint:
//1. Do the hamming weight  and get the count's of 1's
//2. Hamming weight is do and with "1" and know the no of 1's. Shift right is done to and the next number