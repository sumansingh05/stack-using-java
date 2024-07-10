import java.util.Stack;
public class displayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Stack is: " + st);

        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        st.push(9);
        
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println("New Stack: " + st);
    }
}
