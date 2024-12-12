public class LinkedListEx {

    class Node{
        int data;
        Node next;
        public Node(int data){

            this.data = data;
            this.next= null;
        }

    }

    Node head = null;
        Node tail = null;

        void insertAtFirst(int data){
             Node newNode = new Node(data);
             if(head == null){
                  head = newNode;
             }
             else{
                newNode.next = head;
                head = newNode;
             }
        }

        void insertAtEnd(int data){

            Node temp = head;
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;

            }
            else{
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        void insertAtMid(int data, int index){
            Node temp = head;
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;

            }
            else{
                for (int i = 0; i < index-1; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
        void display(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;

            }
            System.out.println();
        }


        Node nthNode(int index){
            int size= 0;
            Node temp = head;
            while (temp != null) {
                size++;
                temp = temp.next;
            }

            int fromStart = (size-index) +1;
            // nth node from the start
            temp = head;
for (int i = 1; i <= fromStart-1; i++) {
           temp = temp.next;   
    
}
return temp;

}

Node nthNodeAnotherWay(int index){
     
    Node slow = head;
    Node fast = head;
    for (int i = 1; i <= index; i++) {
        fast = fast.next;
    }

    while (fast!= null) {
        slow = slow.next;
        fast = fast.next;
    }
    return slow;

}
// in even nodes ----- left middle and right middle
Node getLeftMiddlNode(){
    

    Node slow = head;
    Node fast = head;
    while (fast.next.next != null) {
        slow= slow.next;
        fast = fast.next.next;
    }
    return slow;

}

Node getRightMiddle(){

    Node slow = head;
    Node fast = head;
    while (fast.next.next != null) {
        slow= slow.next;
        fast = fast.next.next;
    }
    return slow;

}

Node getMiddNode(){/// for odd nodes

    Node slow = head;
    Node fast = head;
    while (fast.next != null) {
        slow= slow.next;
        fast = fast.next.next;
    }
    return slow;
}



Node reversList(){

    Node prev = null;
    Node nextNode = null;
    Node curr = head;

    while (curr != null) {
        nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;
    }
    return prev;
}

boolean isPalindrome(){

    Node slow = head;
    Node fast = head;

    while (fast.next.next!=null && fast.next != null) {

        slow = slow.next;
        fast = fast.next.next;   
    }
    Node temp = reversList();
    slow.next = temp;
    Node p1 = head;
    Node p2 = slow.next;
    while (p2!= null) {
        if(p1.data != p2.data){

            return false;
        }
        else{
            p1 = p1.next;
            p2 = p2.next;
        }
    }
    return true;

}
    public static void main(String[] args) {
        LinkedListEx myList = new LinkedListEx();
        myList.insertAtFirst(3);
        myList.insertAtFirst(1);
        myList.display();

        myList.insertAtEnd(11);
        myList.insertAtEnd(22);
        myList.display();

        myList.insertAtMid(99, 2);
       myList.insertAtMid(88, 3);
        myList.display();

        Node result = myList.nthNode(5);
        System.out.println(result.data);


        Node result2 = myList.nthNodeAnotherWay(4);
        System.out.println(result2.data);


        Node result3 = myList.getLeftMiddlNode();
        System.out.println(result3.data);

        Node result4 = myList.getRightMiddle();
        System.out.println(result4.next.data);

         Node result5 = myList.reversList();
         System.out.println(result5.data);
         Node temp = result5;
         while(temp.next != null){
 
            System.out.print(temp.data+"->");
            temp = temp.next;
         }
         //System.out.print(temp.next);


    }
}
