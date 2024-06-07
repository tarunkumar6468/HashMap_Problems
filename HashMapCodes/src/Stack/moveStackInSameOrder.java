package Stack;

import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        System.out.println("enter your element");
        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        //REVERSE ORDER
         Stack<Integer> re = new Stack<>();
         while(st.size()>0){
             int x = st.peek();
             re.push(x);
             st.pop();
         }
        System.out.println("your reverse stack");
        System.out.println(re);

        Stack<Integer> st1 = new Stack<>();
        while(re.size()>0){
            st1.push(re.pop());
        }
        System.out.println("your fir se same  stack");
        System.out.println(st1);

        while(st1.size()>0){
            st.push(st1.pop());
        }
        System.out.println("ab values pahle st me reverse me pauch gai ");
        System.out.println(st);

        while(st.size()>0){
            st1.push(st.pop());
        }
        System.out.println("yha fir se value st1 me gai ");
        System.out.println(st1);

    }
}
