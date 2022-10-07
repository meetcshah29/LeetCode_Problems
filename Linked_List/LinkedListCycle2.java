package Linked_List;

public class LinkedListCycle2 {

    public static void main (String args[])
    {

    }

    public static ListNode findEntryCycle(ListNode linkedList)
    {
        ListNode slowPointer = linkedList; 
        ListNode fastPointer = linkedList;
        while(fastPointer != null && fastPointer.next != null) 
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer) 
            {
                break;
            }
        }

        if(fastPointer == null || fastPointer.next == null)
        { 
            return null;
        }

        while(linkedList != slowPointer) 
        {
            linkedList = linkedList.next;
            slowPointer = slowPointer.next;
        }
        
        return linkedList;
    }
    
}
