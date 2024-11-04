public class userdefinestack {

    public static class Stack{
        int arr[] = new int[5];
        int idx = 0;

        void push(int data){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = data;
            idx++;
        }
        int peek(){
            if(idx == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        void display(){
            for(int i = 0; i < idx; i++){
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
            }else{
                return false;
            }
        }
        boolean isFull(){
            if(idx == arr.length){
                return true;
            }else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(19);
        st.push(24);
        st.push(34);
        st.push(14);
        st.push(44);        
        System.out.print("Stack is ");
        st.display();
    }
}
