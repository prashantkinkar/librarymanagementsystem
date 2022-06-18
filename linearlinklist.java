public class linearlinklist {
	
	Node head ;
	Node tail ; 
	
	class Node {
		
		Node next;
		int data ;
		
        Node (  int data) {
	            this.next = null;
				this.data = data;
             }		
	}
	
	linearlinklist (){
		
		this.head = null;
		this.tail = null;
		
	}
	
	public static void main (String args []){
      linearlinklist l1 = new linearlinklist();
	  //Node node1 = new Node(10);
	  //Node node2 = new Node(20);
	  //Node node3 = new Node(30);
	  //Node node4 = new Node(40);
	  //Node node5 = new Node(50);
       
	  //head = node1;
	  //node1.next=node2;
		l1.addfirst(10);
		l1.addfirst(20);
		l1.addfirst(30);
		l1.addfirst(40);
		l1.addfirst(50);
		l1.addfirst(60);
		
		
		l1.print();
	}
	
	public void addfirst(int data){
		Node new_node = new Node(data);
		//Node node2 = new Node(20);
		//Node node3 = new Node(30);
		
		//head = node1;
		
		if(head == null){
			head = new_node;
		}else{
			new_node.next = head;
			head = new_node;

		}
		
	}
	public void print (){
		Node trans = head;
		while (trans != null){
		
			System.out.println(trans.data);
			trans=trans.next;
		}
	}
	
}