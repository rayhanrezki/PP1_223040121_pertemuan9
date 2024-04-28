package pertemuan9;

public class StrukturQueue {

	
	    private Node FRONT;
	    private Node REAR;

	    public StrukturQueue() {
	        FRONT = null;
	        REAR = null;
	    }
	    
	  //mengecek apakah queue kosong atau tidak
	    public boolean isEmpty() {
	        return FRONT == null;
	    }
	    
	  //menambahkan elemen kedalam queue
	    public void enqueue(int data) {
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            FRONT = newNode;
	            REAR = newNode;
	        } else {
	            REAR.setNext(newNode);
	            REAR = newNode;
	        }
	    }
	    
	  //menghapus dan mengembalikan elemen pertama dari queue
	    public int dequeue(){
	        Node temp;
	        int dequeueItem = Integer.MIN_VALUE;
	        if(FRONT != null){
	            if(FRONT == REAR){
	                dequeueItem = FRONT.getData(); //mengambil data nilai dari elemen pertama
	                FRONT = null; //mengosongkan FRONT
	                REAR = null; //mengosongkan REAR
	            }else{
	                temp = FRONT; //elemen pertama disimpan sementara
	                dequeueItem = temp.getData();
	                FRONT = FRONT.next; //menggeser FRONT ke elemen selanjutnya
	                temp = null; //menghapus elemen pertama yang disimpan
	            }
	        }
	        return dequeueItem;
	    }

	    
	  //menghitung total elemen didalam queue
	    public int size() {
	        int size = 0;
	        Node curNode = FRONT;
	        while (curNode != null) {
	            size++;
	            curNode = curNode.getNext();
	        }
	        return size;
	    }
	    
	  //untuk mendapatkan nilai dari elemen pertama dalam queue
	    public int FRONT(){
	        return (int) (FRONT != null ? FRONT.getData() : -1);
	    }

		public void displayElement() {
			// TODO Auto-generated method stub
			
		}
	    
	  
	
}
