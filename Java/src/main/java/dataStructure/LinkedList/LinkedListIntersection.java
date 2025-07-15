package dataStructure.LinkedList;

import java.util.HashSet;

public class LinkedListIntersection
{
  public static ListNode getIntersectionNode (ListNode headA, ListNode headB){
    HashSet<ListNode> visited = new HashSet<>();

    //Store all nodes of list A in a set
    while (headA != null){
      visited.add(headA);
      headA = headA.next;
    }

    //Traverse list B and check for intersection
    while (headB != null){
      if (visited.contains(headB)){
        return headB; // intersection node found
      }
      headB = headB.next;
    }
    return null; // no intersection
  }
}
