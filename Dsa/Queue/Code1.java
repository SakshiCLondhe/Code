class Queue{
	int data;
	int arr[];
	int front;
	int rear;
	int size;

	Queue(int size){
		this.size=size;
		this.arr=new int[size];
		this.front=-1;
		this.rear=-1;


	}
	// add elements in array using queue
	void enqueue(int data){
		if(rear==size-1){
			System.out.println("queue is full");
			
		}
		else{
			rear++;
                        if(front==-1){
			front++;
			}
			arr[rear]=data;
			System.out.println(data+" enqueued");

		}
	}

	
	//delete elements in array using queue
	int  dequeue(){
		if(front>rear){
			System.out.println("queue is empty");
			return -1;

		}
		else{
		       int dequeued = arr[front];
		       front++;
		       System.out.println(dequeued + " dequeued");
		       return dequeued;
		}
	}
	//queue is empty
	int Front(){
	 if(front==-1){
		 System.out.println(" queue is empty");
		 return -1;
	   }
	        return arr[front];
	 }

	
	 int Rear(){
		 if(rear==-1){
			 System.out.println(" queue is empty");
			 return -1;
		 }
		 return arr[rear];
	 }
	
	//print elements in queue
	void printqueue(){
		if (front > rear) {
		    System.out.println("Queue is empty");
	             return;
		}
		System.out.println("Queue is...");
		System.out.print("[");
		for(int i=front;i<=rear;i++){
			System.out.print(arr[i]+" ");
	   }
	   
	   System.out.print("]");
	   System.out.println();
	}


	public static void main(String []ar){
		Queue obj=new Queue(7);
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.printqueue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.printqueue();
		obj.Rear();
		obj.Front();
		obj.enqueue(50);
		obj.enqueue(60);
		obj.printqueue();

	}

}
