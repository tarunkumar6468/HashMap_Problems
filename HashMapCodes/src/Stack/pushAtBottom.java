package Stack;

import java.util.Scanner;
import java.util.Stack;

public class pushAtBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int storage = sc.nextInt();
            st.push(storage);
        }
        pushAtBottomFun(st);
       // reverseRecurs(st);

    }
    public static void pushAtBottomFun(Stack<Integer>st){
        if(st.size()==0){
            st.push(9);
            System.out.println(st.pop());
            return;
        }
        System.out.print(st.pop()+" ");
        pushAtBottomFun(st);
    }
//    public static void reverseRecurs(Stack<Integer>st){
//        if(st.size()<1){
//            System.out.print(st.push(st.pop()));
//            return;
//        }
//        System.out.print(st.pop());
//        reverseRecurs(st);
//    }
}
