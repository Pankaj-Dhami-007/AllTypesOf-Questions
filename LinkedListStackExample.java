class Node{
    int data;
    Node next;
    public Node(int data){

        this.data = data;
        this.next = null;
    }
}

class LinkedListStack{

    private Node top;
    public LinkedListStack(){
        top = null;
    }

    public void push(int data){

        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
    }

    public int pop(){

        if (top == null) {
            System.out.println("Stack is Empty..");
        }

    

            int data = top.data;
            top = top.next;
            
        
        return data;

    }

    public int peek(){

        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
}

public class LinkedListStackExample {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("Top Element: "+stack.peek());
        System.out.println("popped: "+stack.pop());
        

    }
}
