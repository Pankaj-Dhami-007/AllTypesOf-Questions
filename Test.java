/**
 * p
 */
public class Test {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
            } else {

                tail.next = newNode;
            }
            tail = newNode;
        }

        void disp() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }

        void size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            System.out.println(count);
        }
        void deleteNode(int val){
            Node temp = head;
            if (temp == null) { 
                System.out.println("List is empty. Nothing to delete.");
                return;
            }
            

        }
        void find_nTh(int idx){
          Node temp = head;
           for(int i =0; i<=idx -1;i++){
             temp = temp.next;
           }
           System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.disp();
        System.out.println();
        list.find_nTh(2);
        //System.out.println(list.head);
        //System.out.println(list.tail);
        // System.out.println(p.a);
    }
}