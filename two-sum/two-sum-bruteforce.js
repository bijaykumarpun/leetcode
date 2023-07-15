/**
 * @param {number[]} nums
 * @param {number} target
 * @return {numner[]}
 */
/**
 * Bruteforce method
 * Time Complexity : O(n^2)
 */

var twoSum = function(nums, target){
    for(let i = 0; i < nums.length-1; i++){ // we need not go all the way to the end, since the inner loop covers it
        for(let j = i+1 ; j < nums.length; j++){
            //We begin the second loop next to first loop since same element can't be used twice
            if(nums[i] + nums[j] == target) return [i,j]
        }
    }
}
console.log(twoSum([2,4,2], 4))
// Output [0.2]