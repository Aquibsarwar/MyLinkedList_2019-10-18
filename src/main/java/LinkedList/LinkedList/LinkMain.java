package LinkedList.LinkedList;

public class LinkMain {

	public static void main(String[] args) {
		LinkListPractice linklist= new LinkListPractice();
		
		linklist.insert(1);
		linklist.insert(2);
		linklist.insert(3);
		linklist.insert(4);
		linklist.insert(1);
		linklist.insert(2);
		linklist.insert(3);
		linklist.insert(4);
		linklist.insert(5);
		
		
		
		
		//linklist.insertAtFirst(11);
		//linklist.insertAtanyindex(2,45);
		//linklist.insertAtanyindex(3,46);
		//linklist.insertAtanyindex(0,0);
		
		linklist.deleteList(8);
		linklist.addlast(99);
		
		
		linklist.show();
		
		
	}
	
	
}
