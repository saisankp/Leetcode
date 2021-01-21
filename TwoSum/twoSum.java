import java.util.HashMap;
import java.util.Map;

class twoSum {
	
//One-pass Hash Table
public int[] twoSum(int[] nums, int target) {
	
	//create a hashmap to contain all contain all the elements in the array.
    Map<Integer, Integer> map = new HashMap<>();
    
    //iterate through the array, and either put stuff into the hash-map, or return two sum's!
    for (int i = 0; i < nums.length; i++) {
    	
    	//we let the complement equal to the [target] minus the [element at index i in nums]
        int complement = target - nums[i];
        
        //if the hash-map contains our complement, then we found a two sum.
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i }; //return both the index of the complement (since .get will get the value associated with a key (such as nums[i] in map.put(nums[i], i), and i.
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution"); //if there is no two sum, we print this out.
}
}
