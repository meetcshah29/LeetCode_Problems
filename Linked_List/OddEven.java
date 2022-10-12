package Linked_List;

import java.util.*;

public class OddEven {

    public static void main (String args[])
    {

    }

    public static ListNode oddEvenLinkedList(ListNode head)
    {
        if(head == null)
        {
            return null;
        }

        ListNode oddPointer = head;
        ListNode evenList = head.next;
        ListNode evenPointer = evenList;

        while(evenList != null && evenList.next != null)
        {
            oddPointer.next = evenList.next;
            oddPointer = oddPointer.next;
            evenList.next = oddPointer.next;
            evenList = evenList.next;
        }
        oddPointer.next = evenPointer;
        
        return head;
    }
    
}
