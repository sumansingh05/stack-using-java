import java.util.Stack;
public class assignment3 {

    public static void recursiveStack(Stack<Integer> recSt){
        if(recSt.size() == 0){
            return;
        }
        int top = recSt.pop();        
        System.out.print(top + ", ");
        recursiveStack(recSt);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(78);
        st.push(99);
        st.push(121);
        System.out.print("Stack is ");
        System.out.println(st);
        System.out.print("Recursive Stack is [");
        recursiveStack(st);
        System.out.print("]");
    }
}
