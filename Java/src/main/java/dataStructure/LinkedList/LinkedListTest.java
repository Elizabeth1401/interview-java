package dataStructure.LinkedList;

public class LinkedListTest
{
  public static void main(String[] args)
  {
    //Shared part of the list (intersection)
    ListNode shared = new ListNode(8);
    shared.next = new ListNode(10);

    //List A: 1-> 2-> [8->10]
    ListNode headA =  new ListNode(1);
    headA.next = new ListNode(2);
    headA.next.next = shared;

    //List B: 3-> 4-> [8->10]
    ListNode headB = new ListNode(3);
    headB.next = new ListNode(4);
    headB.next.next = shared;

    //Call the function
    ListNode intersection = LinkedListIntersection.getIntersectionNode(headA,headB);

    if (intersection != null){
      System.out.println("Intersection at node with value: "+intersection.val); //should be 8
    }else {
      System.out.println("No intersection.");
    }
  }
}
