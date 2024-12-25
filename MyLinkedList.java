public class MyLinkedList {

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        Node head = null;
        Node tail = null;

        void insertAtFirst(int data){

            Node newNode = new Node(data);
            if (head == null){ head = newNode;}
            else {

                newNode.next = head;
                head = newNode;
            }            
        }

        void insertAtEnd(int data){
            Node newNode = new Node(data);
            Node temp = head;
            if(head == null){head = newNode;}
            else{
                while(temp.next != null){
                    temp= temp.next;
                }
                temp.next = newNode;
            }
        }

        void insertAtMid(int data, int index){

            Node newNode = new Node(data);
            Node temp = head;
            for(int i =1; i< index-1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
        void showLL(){

            Node temp= head;
            System.out.print("[ ");
            while(temp != null){
                System.out.print(temp.data+"-->");
                temp = temp.next;
            }
            System.out.print("null ]");
        }

        int findSize(){
  
            int count = 0;
            Node temp = head;
            while(temp != null){

                count++;
                temp = temp.next;
            }
            return count;
        }
    
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.insertAtFirst(10);
        myList.insertAtFirst(9);
        myList.insertAtFirst(8);
        myList.insertAtFirst(7);
        myList.showLL();
        System.out.println();
        System.out.println(myList.head.data);
        System.out.println("LL Size is: "+myList.findSize());

        myList.insertAtEnd(100);
        myList.insertAtEnd(200);
        myList.insertAtEnd(300);
        myList.insertAtEnd(400);
        myList.insertAtEnd(500);
        myList.insertAtEnd(600);
        myList.showLL();
        System.out.println();
        System.out.println(myList.head.data);
        System.out.println("LL Size is: "+myList.findSize());

        myList.insertAtMid(1000, 5);
        myList.insertAtMid(2000, 6);
        myList.showLL();
        System.out.println();
        System.out.println("head is: "+myList.head.data);
        System.out.println("LL Size is: "+myList.findSize());
    }
}
