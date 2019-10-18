package LinkedList.LinkedList;

public class LinkListPractice 
{
	Node head;
	
	public void insert(int data) 
	{
		Node node = new Node(); //objectを作る 
		node.data=data; 
	
		if (head == null) {
			head = node;
		}
		else
		{
			Node nextNode = head;
			while(nextNode.next!=null) {
				nextNode=nextNode.next;
			}
			nextNode.next = node;
			
		}
	 	
	}
	
	public void show() 
	{
		Node node=head;
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
			}
		System.out.println(node.data);
	}


	public void insertAtFirst(int data) 
	{
		
		Node node = new Node();
		node.data=data;
		node.next=head;
		head = node;

	}

	public void insertAtanyindex(int index, int data) 
	{
	
		Node node = new Node();
		node.data = data;
		
		Node n = head;
		if(index ==0) {
			insertAtFirst(data);
		}
		else
		{
			for(int firstElement = 0; firstElement<index-1; firstElement++) {
				n = n.next;
			}
		
		node.next=n.next;
		n.next=node;
		}
	}

	
	public void deleteList(int index) 
	{
		Node node = new Node();
		Node n=head;
		
		if(index ==0) {
			head=n.next;
		}
		else 
		{
			for(int i = 0; i<index-1;i++) 
			{
				n=n.next;
			}
		
			Node n2 = n.next;
			node = n;
			node.next = n2.next;
			n2=null;
		}
	}
	
	public void addlast(int data) {
		
		Node node = new Node();
		Node n = head;
		
		while(n.next!=null) {
			n = n.next;
			//System.out.print("here!");
			if(n.next==null) {
				break;
			}
		}
		node = n;
		node.data = data;	
		
	}

}





