class Solution {
    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        var count = 0
        val numSet = mutableSetOf<Int>()

        for (num in nums) {
            if ((num - diff) in numSet && (num - 2 * diff) in numSet) {
                count++
            }
            numSet.add(num)
        }

        return count
    }
}

fun main() {
    val solution = Solution()

    val nums1 = intArrayOf(0, 1, 4, 6, 7, 10)
    val diff1 = 3
    val output1 = solution.arithmeticTriplets(nums1, diff1)
    println("Input: nums = ${nums1.joinToString(", ")}, diff = $diff1")
    println("Output: $output1")

    val nums2 = intArrayOf(4, 5, 6, 7, 8, 9)
    val diff2 = 2
    val output2 = solution.arithmeticTriplets(nums2, diff2)
    println("Input: nums = ${nums2.joinToString(", ")}, diff = $diff2")
    println("Output: $output2") 
}
