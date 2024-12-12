public class LL_1 {
    public static class Node{
         int data;
         Node next;
          Node(int data){
        this.data = data;
        this.next = null;
       }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        System.out.println(a.next);
    }
}
