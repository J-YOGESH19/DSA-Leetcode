/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0); //y zero mean we can put any value just as a dummy value 
        ListNode tail  = dummy ;


        while (list1 != null & list2 != null){
            //Merge two sorted list 

            if(list1.val <= list2.val){
                tail.next = list1;   //attach list 1 node to the dummy 
                list1 = list1.next;  //increment the poiter
            }

            else{
                tail.next = list2;  //attach list 2 node to the dummy 
                list2 = list2.next; //increment the pointer 
            }

            tail = tail.next ;}

            //Attach the remaining 
            if(list1 != null){
                tail.next = list1 ;
            }
            else{
                tail.next =list2;
            }





        return dummy.next ;
        
    }
}