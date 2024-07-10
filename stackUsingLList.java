public class stackUsingLList{

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class Stack{
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }

        int peek(){
            if(head == null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.data;
        }

        void display(Node head){
            if(head == null){
                return;
            }
            
            display(head.next);
            System.out.print(head.data + " ");
        }

        // void display(){
        //     Node temp = head;
        //     while(temp != null){
        //         System.out.print(temp.data + " ");
        //         temp = temp.next;
        //     }
        //     System.out.println();
        // }
    }
    public static void main(String[] args){
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        //st.display();
        st.display(st.head);
    }
}