import java.util.Scanner;
import java.util.Stack;


public class userStack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter number of element in Stack:");
        int n = sc.nextInt();
        System.out.print("Enter element of Stack: ");
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.print("Element of Stack is: " + st);
    }
}
