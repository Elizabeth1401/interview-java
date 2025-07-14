package dataStructure.LinkedList;

// Singly Linked List class
public class SinglyLinkedList
{
  private Node head;

  public Node getHead()
  {
    return head;
  }

  // Insert at the beginning
  public void insertAtHead(int data)
  {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode; //add new node at the beginning
  }

  // Insert at the end
  public void insertAtTail(int data)
  {
    Node newNode = new Node(data);
    if (head == null)
    {
      head = newNode;
      return;
    }
    // Traverses to the end and appends
    Node current = head;
    while (current.next != null)
    {
      current = current.next;
    }
    current.next = newNode;
  }

  //Insert at a specific position (0-based index)
  public void insertAtPosition(int data, int position)
  {
    if (position < 0)
    {
      throw new IndexOutOfBoundsException("Invalid position");
    }

    if (position == 0)
    {
      insertAtHead(data);
      return;
    }

    Node newNode = new Node(data);
    Node current = head;

    for (int i = 0; i < position - 1 && current != null; i++)
    {
      current = current.next;
    }

    if (current == null)
    {
      throw new IndexOutOfBoundsException("Position out of bounds");
    }

    newNode.next = current.next;
    current.next = newNode;
  }

  //Delete occurrence of a value
  public void deleteByValue(int data)
  {
    if (head == null)
    {
      return;
    }

    if (head.data == data)
    {
      head = head.next;
      return;
    }

    Node current = head;
    while (current.next != null && current.next.data != data)
    {
      current = current.next;
    }

    if (current.next != null)
    {
      current.next = current.next.next;
    }
  }

  //Search for a value
  public boolean contains(int data)
  {
    Node current = head;
    while (current != null)
    {
      if (current.data == data)
        return true;
      current = current.next;
    }
    return false;
  }

  //Print the List
  public void printList()
  {
    Node current = head;
    while (current != null)
    {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }

  public void reverseList()
  {
    Node prev = null;
    Node current = head;

    while (current != null)
    {
      Node nextNode = current.next; // temporarily hold the next node to not lose reference
      current.next = prev;
      prev = current;
      current = nextNode;
    }

    head = prev; // new head
  }

  public boolean hasCycle(Node head)
  {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null)
    {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast)
      {
        return true; //cycle found
      }
    }
    return false; // no cycle
  }

  public Node findMiddle(Node head)
  {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null)
    {
      slow = slow.next; // slow moves one step at a time
      fast = fast.next.next; // fast moves two steps
    } // when fast reaches the end, slow is at the middle
    return slow;
  }
}
