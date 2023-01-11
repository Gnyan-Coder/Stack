import java.util.Stack;

public class ReverseStack {
    public static Stack<Integer> reverse(Stack<Integer> s){
        Stack<Integer> s1=new Stack<>();
        while(!s.isEmpty()){
            int top=s.peek();
            s.pop();
            s1.push(top); 
        }
        return s1;

    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        Stack<Integer> s1=reverse(s);
        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();

        }
    }
}
