import java.util.Stack;
public class assignment1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(24);
        st.push(89);
        st.push(56);
        st.push(5);
        System.out.println(st);
        System.out.println("Size of Stack is " + st.size());

        Stack<Integer> newStack = new Stack<>();
        while(st.size() > 0){
            newStack.push(st.pop());
        }
        System.out.println(newStack);
        newStack.push(100);
        System.out.println("New Stack after adding new 100 is " + newStack);

        while(newStack.size() > 0){
            st.push(newStack.pop());
        }
        System.out.println("Updated Stack is " + st);
    }
}
