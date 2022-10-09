package Linked_List;

import java.util.*;

public class RemoveNthNodeFromEnd {

    public static void main (String args[])
    {

    }

    public static ListNode findNthNode(ListNode head, int n)
    {
        ListNode dummy = new ListNode(0);
        
        dummy.next = head;
        
        ListNode fastPointer = dummy;
        ListNode slowPointer = dummy;
        
        for(int i = 1; i <= n + 1; i++)
        {
            fastPointer = fastPointer.next;
        }
        
        while(fastPointer != null)
        {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        
        slowPointer.next = slowPointer.next.next;
        
        return dummy.next;
    }
    
}
