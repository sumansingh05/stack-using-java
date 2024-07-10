import java.util.Stack;
public class addelement{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println("Size of Stack is "+ st.size());


        Stack<Integer> nst = new Stack<>();
        while(st.size()>0){
            nst.push(st.pop());
        }
        System.out.println(nst);

        while(nst.size()>0){
            int x = nst.pop();
           // System.out.print(x + " ");
            st.push(x);
        }
        //System.out.println();
        System.out.println(st);
    }
}