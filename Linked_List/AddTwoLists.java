package Linked_List;

import java.util.*;

public class AddTwoLists {

    public static void main (String args[])
    {

    }

    public static ListNode addTwoLists(ListNode l1, ListNode l2)
    {
        ListNode reversedAddedList = new ListNode(0);
        ListNode pointer = reversedAddedList;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) 
        {
            int value1 = (l1 != null) ? l1.val : 0;
            int value2 = (l2 != null) ? l2.val : 0;
            int sum = carry + value1 + value2;
            carry = sum / 10;
            pointer.next = new ListNode(sum % 10);
            pointer = pointer.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return reversedAddedList.next;
    }
    
}
