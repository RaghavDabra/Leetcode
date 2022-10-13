class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode curr=head;
        while(curr.next!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        arr.add(curr.val);
        curr=head;
        int size=0;
        if((right-left)%2!=0){
            size=(right-left)/2;
            size+=1;
        }
        else{
            size=(right-left)/2;
        }
        for(int i=left-1;i<left+size-1;i++){
            Collections.swap(arr,i,right-1);
            right--;
        }
        int i=0;
        while(curr.next!=null){
            curr.val=arr.get(i);
            i++;
            curr=curr.next;
        }
        curr.val=arr.get(i);
        return head;
    }
}