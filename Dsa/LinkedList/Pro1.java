class LL{
	Node head;
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
			this.next=null;
	}
	}


	//add First element in linked list
	public  void addFirst(String data){
		Node newNode = new Node(data);
		if(head== null){
			head= newNode;
			return;
        }
                newNode.next=head;
                head=newNode;
	}

	//add Last Element in linked list 
	public void addLast(String data){
		Node newNode = new Node(data);
			if(head==null){
				head=newNode;
				return;
			}
			Node CurrNode=head;
			while(CurrNode.next!=null){
				CurrNode=CurrNode.next;
			}
			CurrNode.next=newNode;
			
	}
	
      //print 
      public void printList(){
	      if(head==null){
		      System.out.println("list is empty");
		      return;
	      }
	      Node CurrNode=head;
	      while(CurrNode!=null){
		      System.out.print(CurrNode.data+"-->");
		      CurrNode=CurrNode.next;
	      }
	      System.out.println("Null");
      }

	
        public static void main(String args []){
	LL obj = new LL();
	obj.addFirst("sakshi");
	obj.addFirst( "londhe");
	obj.printList();
	obj.addLast("Chandrkant");
	obj.printList();
	}
	}

