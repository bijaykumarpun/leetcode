class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
      
        val indexValueMap:HashMap<Int,Int> = hashMapOf();
     	val count: Int = nums.size;
        for(i in 0..nums.size -1  step 1){
            indexValueMap.put(nums[i], i)

        }
        print(indexValueMap.entries)
        for(j in 0..nums.size step 1){
            val complement = target - nums[j]

            if(indexValueMap.containsKey(complement)){
                indexValueMap.get(complement)?.let{

                    if(indexValueMap.get(complement) != j){
                    return intArrayOf(j, it);
                    }
                }

            
            }

        }
        return intArrayOf()
        
    }
}