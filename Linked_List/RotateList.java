package Linked_List;

import java.util.*;

public class RotateList {

    public static void main (String args[])
    {

    }

    public static ListNode rotateList(ListNode head, int k)
    {
        
        if(head == null)
        {
            return null;
        }

        if(head.next == null)
        {
            return head;
        }

        ListNode tail_pointer_old = head;
        int n;

        for(n = 1; tail_pointer_old.next != null; n++)
        {
            tail_pointer_old = tail_pointer_old.next;
        }

        tail_pointer_old.next = head;

        ListNode tail_pointer_new = head;

        for (int i = 0; i < n - k % n - 1; i++)
        {
            tail_pointer_new = tail_pointer_new.next;
        }
        
        ListNode head_pointer_new = tail_pointer_new.next;

        tail_pointer_new.next = null;

        return head_pointer_new;

    }
    
}
