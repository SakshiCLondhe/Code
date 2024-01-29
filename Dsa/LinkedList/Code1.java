class Node{
	int data;
	Node next=null;	
	Node( int data){
	  this.data=data;
	  this.next=next;
          
	}
}
class LinkedList{
	Node head=null;
	//addFirst
	void addFirst(int data){
        	Node newNode = new Node(data);
		if(head==null){
                          head=newNode;
		}
		else{
		newNode.next=head;
		head=newNode;
		}
	}
	//addLast
	void addLast(int data){
		Node newNode=new Node(data);
		if(head==null){
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
			}
	
	}
	//countNode
	int CountNode(){
		int count=0;
		Node temp=head;
		while(temp!=null){
			count++;
			temp=temp.next;
                }
		return count;
	}
	//addAtPos
	 void addAtPos(int pos, int data){
		 if(pos<=0 || pos==CountNode()+2){
                      System.out.println(" Wroung input");

		 }
		 if(pos==1){
			 addFirst(data);

		 }
		 else if(pos==CountNode()+1){
			 addLast(data);

		 }
		 else{
			 Node newNode=new Node(data);
			 Node temp=head;
			 while(pos-2!=0){
				 temp=temp.next;
				 pos--;
                          }
			 newNode.next=temp.next;
			 temp.next=newNode;
		 }
	    }
	      //delFirst
	      void delFirst(){
		      if(head==null){
			      System.out.println("Empty linked list");
			      return;
		      }
		      if(CountNode()==1){
			      head=null;
		      }else{
			      head=head.next;
		      }

	      }
	      //delLast
	      void delLast(){
		      if(head==null){
			      System.out.println("empty linked list");
		      }
		      if(CountNode()==1){
		      }
		      else{
			       Node temp = head;
			        while(temp.next.next!=null){
					temp=temp.next;
				}
				temp.next=null;

		      }
	      }
	      //deleteAtPos
	      void deleteAtPos(int pos,int  data){
		    if(pos<=0 ||pos>=CountNode()+1){

			    System.out.println("wrong input");
			    return;
		    }
		    if(pos==1){
			    delFirst();

		    }
		    else if(pos==CountNode()){
			    delLast();
		    }
		    else{
			    Node temp=head;
			    while(pos-2!=0){
				    temp=temp.next;
				    pos--;
			    }
			    temp.next=temp.next.next;
		    }
	    }



   
	void PrintSll(){
		if(head==null){
			System.out.println(" Empty Code");
		}
		  
		else{
		   Node temp=head;
            
		while( temp.next!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(temp.data);
             }
           }

}
class Client
{
	public static void main(String args []){

	LinkedList ll=new LinkedList();
	ll.addFirst(30);
	ll.addFirst(20);
	ll.PrintSll();
        ll.addLast(40);
	ll.PrintSll();

	System.out.println(ll.CountNode());
	ll.addAtPos(1,10);
	ll.PrintSll();
        ll.delFirst();
	ll.PrintSll();
	ll.delLast();
	ll.PrintSll();


	}
}

