package Linked_List;

import java.util.*;

public class MergeSortedLists {

    public static void main (String args[])
    {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        if(list1 == null)
        {
            return list2;
        }
        if(list2 == null)
        {
            return list1;
        }

        ListNode dummyList = new ListNode(0);

        ListNode currentPointer = dummyList;

        while(list1 != null && list2 != null)
        {
            if(list1.val <= list2.val)
            {
                currentPointer.next = list1;
                list1 = list1.next;
            }
            else
            {
                currentPointer.next = list2;
                list2 = list2.next;
            }
            currentPointer = currentPointer.next;
        }

        if(list1 == null)
        {
            currentPointer.next = list2;
        }
        else
        {
            currentPointer.next = list1;
        }

        return dummyList.next;
    }
    
}
