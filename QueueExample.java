class SimpleQueue{

    int[] queue;
    int front;
    int rear;
    int size;
    int capacity;
    public SimpleQueue(int capacity){

        this.capacity= capacity;
        this.queue = new int[capacity];
        this.front =0;
        this.rear = -1;
        this.size =0;
    }


    // Enqueue----> add an element at the rear
    // Dequeue -----> remove an element from the front
    // peek/front --> getting the front element without removing it 

    public void enqueue(int data){

        if (size == capacity) {
   
            System.out.println("Queue is Full..");
            return;
        }

        rear = rear+1;
        queue[rear] = data;
        size++;
    }

    public int Dequeue(){

        if (front > rear) {
            System.out.println("Queue is Empty...");
            return -1;
        }
        
        int data= queue[front++];
        System.out.println(data+" dequeue from the queue.");
        size--;
        return data;
    }

    public int peek(){

        if (front > rear) {
            System.out.println("Queue is Empty...");
            return -1;
        }

        return queue[front];

    }
    public void showQueue(){

        if (size == 0) {
            System.out.println("Queue is Empty...");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        
        SimpleQueue myQueue = new SimpleQueue(5);
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);
        //myQueue.enqueue(60);
 
        System.out.println(myQueue.size);

        myQueue.showQueue();

        myQueue.Dequeue();
        myQueue.showQueue();


    }
}
