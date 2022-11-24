package Linked_List;

import java.util.*;

public class RemoveDuplicates 
{
    public static void main(String args[])
    {

    }

    public static ListNode removeDuplicates(ListNode head)
    {
        ListNode pointer = head;

        while(pointer != null && pointer.next != null)
        {
            if(pointer.next.val == pointer.val)
            {
                pointer.next = pointer.next.next;
            }
            else
            {
                pointer = pointer.next;
            }
        }

        return head;
    }
}
