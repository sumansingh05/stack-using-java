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

}
public class StackImplementation {
    public static void main(String[] args) {
        
    }
}
