import java.util.Stack;
public class recSt {

    public static void recursiveStack(Stack<Integer> rt){
        if(rt.size() == 0){
            return;
        }
        int top = rt.pop();
        System.out.print(top + " ");
        recursiveStack(rt);        
    }

    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.print("Recursive stack is: ");
        recursiveStack(st);
    }
}
