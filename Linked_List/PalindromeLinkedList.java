package Linked_List;

import java.util.*;

public class PalindromeLinkedList {

    public static void main (String args[])
    {

    }

    public static boolean palindromeList(ListNode head)
    {
        ListNode slowPointer = head;
        ListNode fastPointer = head; 
        ListNode previousPointer;
        ListNode swapPointer;

        while (fastPointer != null && fastPointer.next != null) 
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        previousPointer = slowPointer;
        slowPointer = slowPointer.next;
        previousPointer.next = null;

        while (slowPointer != null) 
        {
            swapPointer = slowPointer.next;
            slowPointer.next = previousPointer;
            previousPointer = slowPointer;
            slowPointer = swapPointer;
        }

        fastPointer = head;
        slowPointer = previousPointer;

        while (slowPointer != null) 
        {
            if (fastPointer.val != slowPointer.val) 
            {
                return false;
            }

            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        return true;
    }
}
