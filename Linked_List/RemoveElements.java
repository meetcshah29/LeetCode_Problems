package Linked_List;

import java.util.*;

public class RemoveElements {

    public static void main (String args[])
    {

    }

    public static ListNode removeElementsFromList(ListNode head, int val)
    {
        while(head != null && head.val == val)
        {
            head = head.next;
        }

        ListNode headPointer = head;

        while(headPointer != null && headPointer.next != null)
        {
            if(headPointer.next.val == val)
            {
                headPointer.next = headPointer.next.next;
            }
            else
            {
                headPointer = headPointer.next;
            }
        }

        return head;
    }
    
}
