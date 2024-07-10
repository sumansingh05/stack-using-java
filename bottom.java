import java.util.Stack;
public class bottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while(st.size()>1){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println(st);
    }
}
