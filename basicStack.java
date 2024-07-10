import java.util.Stack;

public class basicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println("Size of Stack is: " + st.size());
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println("Size of New Stack is: " + st.size());
    }
}
