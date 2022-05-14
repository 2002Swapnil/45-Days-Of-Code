class Solution {
    public int getDecimalValue(ListNode head) {
       // ArrayList<Integer> al = new ArrayList<>();
        int sum =0;
        int p=1;
        ListNode temp=head;
        while(temp!=null){
            sum*=2;
            sum+=temp.val;
            temp=temp.next;
            
        }
        return sum;
    }
}