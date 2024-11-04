import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        
        //displaying the stack
        System.out.println("Stack : " + st);

        //popping an element from the stack
        int removedElement = st.pop();
        System.out.println("Popped element : " + removedElement);

        System.out.println("New Stack is " + st);

        //peeking the top element in stack
        int topElement = st.peek();
        System.out.println("Top element: " + topElement);

        //checking if stack is empty
        boolean isEmpty = st.isEmpty();
        System.out.println("Is Stack empty: " + isEmpty);

    }
}
