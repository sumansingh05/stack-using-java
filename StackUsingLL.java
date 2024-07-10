public class StackUsingLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack{
        Node head;
        Node tail;
        int size;
        public Stack(){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        void push(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        // int pop(){
        //     Node head;
        //     if(head == null){
        //         System.out.println("Stack is empty!");
        //         return 0;
        //     }else{
        //         head = head.next;
        //     }  
        //     return head;  
        // }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.print("Stack is: ");
        st.display();
        System.out.println("Head of Stack is: " + st.head.data);
        System.out.println("Tail of Stack is: " + st.tail.data);

        //int val = st.pop();
        //System.out.println(val);

        System.out.print("Updated stack is: ");
        st.display();
        System.out.println("New Head is " + st.head.data);
    }
}
