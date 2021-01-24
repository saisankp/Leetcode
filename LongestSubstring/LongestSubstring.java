import java.util.HashSet;

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        //we use a sliding window technique to solve this problem.
        
        //this pointer is going to stay stationary until we find a repeating character.
        int pointerA = 0;
        
        //thus pointer is going to increment through the string's characters to find a repeated character which will get to the end of the string. This pointer will expand our "window"
        int pointerB = 0;
        
        int maxLength = 0;
        
        //we will use a hashset because hashsets keep track of unique things well.
        HashSet <Character> hash_set = new HashSet();
        
        while(pointerB < s.length()){
            if(!hash_set.contains(s.charAt(pointerB))){ //if we have not seen this character in our current substring we are iterating through,
                hash_set.add(s.charAt(pointerB)); //add this character to our hashset
                pointerB++; //increment the pointer to expand our window.
                maxLength = Math.max(hash_set.size(), maxLength); //keep track of the max length of the substrings.
            } else{ //if we have seen this character already in our substring we are iterating through,
                hash_set.remove(s.charAt(pointerA)); //remove our pointer which is on the leftside of pointerB, and remove it.
                pointerA++; //now increment this pointer to start again.
            }
        }
        return maxLength;
    }
}