public class Node {
    int data;
    Node next;
}

class Stack{
    Node top;

    Stack(){
        top=null;
    }
    void push(int d){
        Node n = new Node();
        n.data=d;
        n.next=null;
        if (top==null){
            top=n;
        }
        else{
            n.next=top;
            n=top;
        }
        System.out.println(d+"has been added in the stack");
    }
    int pop(){
        int t = top.data;
        if (top==null){
            System.out.println("stack is empty");
        }
        else{
            top=top.next;
        }
        System.out.println(t+"has been popped");
        return t;
    }
    void display(){
        Node t=top;
        while(t!=null){
            System.out.println(t.data+"-->");
            t=t.next;
        }
    }
}

    class Main{
        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(2);
            s.push(4);
            s.push(6);
            s.pop();
            s.display();
        }
    }