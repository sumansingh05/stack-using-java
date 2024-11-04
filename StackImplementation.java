
class Stack{
    int maxSize;
    int[] stackArray;
    int top;

    //constructor
    public Stack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    //method to push an element onto the stack
    public void push(int value){
        if(top < maxSize - 1){
            stackArray[++top] = value;
        }else{
            System.out.println("Stack is full");
            return;
        }
    }

    //method to pop an element from the stack
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top--];
    }

    //method to peek the top element of the stack
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    //method to check if stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }

    //method to check if stack is full
    public boolean isFull(){
        return (top == maxSize-1);
    }

}
public class StackImplementation {
    public static void main(String[] args) {
        Stack st = new Stack(5);

        //pushing element onto the stack
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element of Stack is " + st.peek());

        //popping element from stack
        System.out.println("Popped element from Stack is " + st.pop());

        
    }
}
