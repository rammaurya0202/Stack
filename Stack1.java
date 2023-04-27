import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        Stack<Integer> p=new Stack<>();
            while(s.size()>0){
                p.push(s.pop());
            }

        System.out.println(p);

            Stack<Integer> q=new Stack<>();

            while(p.size()>0){
                q.push(p.pop());
            }
        System.out.println(q);





    }
}
