package Linked_List;

public class ReverseLinkedList {

    public static void main (String args[])
    {

    }

    public static ListNode reverseLinkedList(ListNode head)
    {
        if (head == null)
        {
            return null;
        }

        ListNode headPointer = head;

        while(head.next != null)
        {
            ListNode swapPointer = head.next;
            head.next = swapPointer.next;
            swapPointer.next = headPointer;
            headPointer = swapPointer;
        }

        return headPointer;
    }
    
}
