import java.util.Stack;

public class Insertion {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        int idx = 2;
        int x=7;

        Stack<Integer> p=new Stack<>();
        while(s.size()>idx){
            p.push(s.pop());
        }
        s.push(x);

        while(p.size()>0){
            s.push(p.pop());
        }

        System.out.println(s);
    }
}
