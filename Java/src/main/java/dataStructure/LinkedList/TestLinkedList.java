package dataStructure.LinkedList;

public class TestLinkedList
{
//  public static void main(String[] args)
//  {
//    SinglyLinkedList list = new SinglyLinkedList();
//
//    list.insertAtHead(3);
//    list.insertAtTail(5);
//    list.insertAtPosition(4,1); // insert 4 at index 1
//
//    list.printList(); // 3 -> 4 -> 5 -> null
//
//    list.deleteByValue(4);
//    list.printList(); // 3 -> 5 -> null
//
//    System.out.println("Contains 5? "+ list.contains(5)); //true
//
//public static void main(String[] args)
//{
//      SinglyLinkedList list = new SinglyLinkedList();
//      list.insertAtHead(10);
//      list.insertAtTail(30);
//      list.insertAtPosition(20,1);
//
//      System.out.println("Original List: ");
//      list.printList(); // 10 -> 20 -> 30 -> null
//
//      list.reverseList();
//
//      System.out.println("Reversed List: ");
//      list.printList(); // 30 -> 20 -> 10
//    }
//}


//  public static void main(String[] args)
//  {
//    SinglyLinkedList list = new SinglyLinkedList();
//    list.insertAtTail(1);
//    list.insertAtTail(2);
//    list.insertAtTail(3);
//    list.insertAtTail(4);
//
//    //Create a cycle manually
//    Node head = list.getHead(); //1
//    Node third = head.next.next; //3
//    Node last = head;
//    while (last.next != null){
//      last = last.next;
//    }
//    last.next = third; // cycle: 4 -> 3
//
//    System.out.println("Has cycle? " + list.hasCycle(head)); //true
//  }

  public static void main(String[] args)
  {
    SinglyLinkedList list = new SinglyLinkedList();
    list.insertAtTail(1);
    list.insertAtTail(2);
    list.insertAtTail(3);
    list.insertAtTail(4);
    list.insertAtTail(5);

    Node middle =  list.findMiddle(list.getHead());
    System.out.println("Middle node: "+middle.data); //should print 3
  }
}
