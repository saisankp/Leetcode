//Complexity Analysis

//Time complexity : O(\max(m, n)). Assume that m and n represents the length of l1 and l2 respectively, the algorithm above iterates at most max(m, n) times.

//Space complexity : O(\max(m, n)). The length of the new list is at most max(m,n) + 1.
class AddTwoNumbers {
	
	public class ListNode {
	  int val;
	  ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	  
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //Initialize the returning list.
    ListNode dummyHead = new ListNode(0);
        
    //Initialize p and q to head of l1 and l2 respectively. 
    //Also, initialize current node to dummy head of the returning list.                             
    ListNode p = l1, q = l2, curr = dummyHead;
        
    //Initialize carry to 0.
    int carry = 0;
        
    //Loop through lists l1 and l2 until you reach both ends.
    while (p != null || q != null) {
        //Set x to node p's value. If p has reached the end of l1, set to 0.
        int x = (p != null) ? p.val : 0;
        
        //Set y to node q's value. If q has reached the end of l2, set to 0.
        int y = (q != null) ? q.val : 0;
        
        //set sum = x + y + carry.
        int sum = carry + x + y;
        
        //update carry = sum/10
        //the carry will always be 0 unless sum is equal to 10 or more (since carry is an integer variable)
        carry = sum / 10;
        
        //Create a new node with the digit value of (sum mod 10) and set it to current node's next
       
        // the % 10 part will do nothing if sum is less than 10, if sum is greater than 10 then it will get the rightmost digit and put it into the listnode (i.e. 14 would put 4 in the node)
        curr.next = new ListNode(sum % 10);
        //then advance current node to next
        curr = curr.next;
        
        //advance both p and q.
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    
    //if carry = 1, 
    if (carry > 0) {
        //append a new node with digit 1 to the returning list.
        curr.next = new ListNode(carry);
    }
        
    //return the dummy head's next node.
    return dummyHead.next;
   }
}