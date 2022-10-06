package Linked_List;

class ListNode 
{
    int val;
    ListNode next;
    ListNode(int x) 
    {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {

    public static void main(String args[])
    {

    }
    
    public static boolean hasCycle(ListNode head)
    {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) 
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }
}
