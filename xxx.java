public class xxx {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtFirst(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
            }
            else{
              newNode.next = head;
              head = newNode;
            }
        }
        void insertAtEnd(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            tail = newNode;
        }

        void disp() {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+ " -> ");
                temp = temp.next;
            }
        }

        int size(){
            Node t = head;
            int count =0;
            while(t != null){
                count++;
                t = t.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(7);
        list.insertAtEnd(9);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        System.out.println("Size of an LinkedList is "+list.size());
         list.disp();
         System.out.println();
         list.insertAtFirst(111);
         list.disp();
         System.out.println();
         System.out.println(list.head.data);
         System.out.println(list.tail.data);
         
    }
}
