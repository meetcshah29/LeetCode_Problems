package Linked_List;

import java.util.*;

public class InsertIntoCircularList {

    public static void main (String args[])
    {

    }

    public static Node insert(Node head, int insertVal)
    {
        if(head == null)
        {
            Node extraNode = new Node(insertVal, null);
            extraNode.next = extraNode;
            return extraNode;
        }
        
        Node headPointer = head;
        Node currentPointer = head.next;
        boolean insertion = false;
        
        do
        {
            if (headPointer.val <= insertVal && insertVal <= currentPointer.val)
            {
                insertion = true;
            }
            else if (headPointer.val > currentPointer.val)
            {
                if(insertVal >= headPointer.val || insertVal <= currentPointer.val)
                {
                    insertion = true;
                }  
            }
            
            if(insertion == true)
            {
                headPointer.next = new Node(insertVal, currentPointer);
                return head;
            }
            
            headPointer = currentPointer;
            currentPointer = currentPointer.next;
        }
        while(headPointer != head);
        
        headPointer.next = new Node(insertVal, currentPointer);
        return head;
    }
    
}
