class LinkedList2{
	
	class node{
		int data;
		node next;
		
		node(int data){
		this.data=data;
		this.next=null;
		}node head;
	}
	
	node head=null;
	node tail=null;
	
	void insert(int data){
		node newNode=new node(data);
		
		if(head==null){
			
			head=newNode;
			tail=newNode;
		}
		else{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	node rev(node head){
		if(head==null)
			return null;
		node current=head;
		node next=null;
		node prev=null;
		
		
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		
		while(next!=null){
			head.next=rev(next);
		}
		return prev;
	}

	void display(){
		node temp=head;
		
		
		while(temp!=null){
			
		System.out.print(temp.data+" ");
		temp=temp.next;
		}
		
		System.out.println("");
	}
	
	public static void main(String[] args){
		LinkedList2 obj=new LinkedList2();
		
		obj.insert(2);
		obj.insert(4);
		obj.insert(3);
		obj.insert(4);
		obj.insert(2);
		obj.insert(5);
		
		obj.display();
		
		obj.head=obj.rev(obj.head);
		
		obj.display();
		
	
		
	}
	
} 