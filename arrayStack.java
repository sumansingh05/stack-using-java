public class arrayStack {

    public static class Stack{
        int[] arr = new int[5];
        int idx = 0; 

        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full.");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek(){
            if(idx == 0){
                System.out.print("Stack is Empty!");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx == 0){
                System.out.print("Stack is Empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0){
                return true;
            }
            else{
                return false;
            }
        }

        boolean isFull(){
            if(idx == arr.length){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        System.out.println(st.peek());
        //System.out.println(st.pop());
        
        System.out.println("Size of Stack is " + st.size());
        System.out.println(st.pop());
        st.display();
        System.out.println("Size of Stack is " + st.size());
        st.push(7);
        st.push(9);
        st.push(12);
        //st.push(4);
        st.display();
        st.push(45);
        st.display();
    }
}
