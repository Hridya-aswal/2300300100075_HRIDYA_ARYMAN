class Solution {
    public ListNode middleNode(ListNode head) {
        if (head==null && head.next == null){
            return null;
        }
    int length = 0;
    ListNode temp = head;
    while(temp!= null){
        length++;
        temp = temp.next;
    }
    int mid = length/2;
    temp =head;
    for(int i = 0 ;i<mid;i++){
        temp = temp.next;
    }
    return temp;
    
  
    }
    
}
