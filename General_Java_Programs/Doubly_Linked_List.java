
// Doubly Linked List Implementation in Java - Insertion , Deletion , Display

public class Doubly_Linked_List 
{
    Node head = null;

    class Node 
	{
    	int data;
      	Node prev;
      	Node next;

      	Node(int d)
		{
        	data = d;
      	}
    }

    public void Insert_Front(int data)
	{
      	Node newNode = new Node(data);
      	newNode.next = head;
      	newNode.prev = null;
  
      	if (head != null)
		{
        	head.prev = newNode;
		}
      	head = newNode;
    }
  
    public void Insert_After(Node prev_node, int data)
	{
      	if (prev_node == null) 
		{
        	System.out.println("previous node cannot be null");
        	return;
      	}
      	Node new_node = new Node(data);
		new_node.next = prev_node.next;
      	prev_node.next = new_node;
		new_node.prev = prev_node;

  		if (new_node.next != null)
        {
        	new_node.next.prev = new_node;
        }
    }

    void Insert_End(int data) 
	{
      	Node new_node = new Node(data);
  		Node temp = head;
      	new_node.next = null;

      	if (head == null) 
		{
        	new_node.prev = null;
        	head = new_node;
        	return;
      	}
  		while (temp.next != null)
        {
        	temp = temp.next;
        }
      	temp.next = new_node;
  		new_node.prev = temp;
    }

    void Delete_Node(Node del_node) 
	{
      	if (head == null || del_node == null) 
		{
            System.out.println("List empty");
        	return;
      	}
      	if (head == del_node)
		{
        	head = del_node.next;
      	}
      	if (del_node.next != null)
		{
        	del_node.next.prev = del_node.prev;
      	}
      	if (del_node.prev != null)
        {
        	del_node.prev.next = del_node.next;
      	}
    }

    public void Display(Node node) 
	{
      	while (node != null) 
        {
        	System.out.print(node.data + " -> ");
        	node = node.next;
      	}
      	System.out.println();
    }
    public static void main(String[] args) 
	{
      	Doubly_Linked_List dll = new Doubly_Linked_List();

      	dll.Insert_Front(1);
        dll.Insert_End(5);
        dll.Display(dll.head);
      	dll.Insert_Front(6);
        dll.Display(dll.head);
      	dll.Insert_End(9);
        dll.Display(dll.head);
  		dll.Insert_After(dll.head, 11);
        dll.Display(dll.head);
  		dll.Insert_After(dll.head.next, 13);
		dll.Display(dll.head);
  		dll.Delete_Node(dll.head.next.next.next.next.next);
  		dll.Display(dll.head);
    }
}