import java.util.Stack;

public class stk{

    public static void main(String[] args){
        
            Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
            System.out.println(st);
               // while(st.size() > 0){
            //rt.push(st.pop());
        //}  
        
        int idx = 2;
        int x = 7;
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}    