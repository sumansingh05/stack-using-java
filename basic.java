import java.util.Stack;
public class basic {

    public static void recursiveStack(Stack<Integer> rst){
        if(rst.size() == 0){
            return;
        }
        int top = rst.pop();
        System.out.print(top + " ");
        recursiveStack(rst);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(10);
        System.out.print("Stack is ");
        System.out.println(st);
        System.out.print("Recursive stack is ");
        recursiveStack(st);
        
        
    }
}
