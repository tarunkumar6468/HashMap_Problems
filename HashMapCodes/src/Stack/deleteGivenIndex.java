package Stack;

import java.util.Scanner;
import java.util.Stack;

public class deleteGivenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int storage = sc.nextInt();
            st.push(storage);
        }
        System.out.println("main Stack");
        System.out.println(st);
        int index = 3;
        Stack<Integer>del = new Stack<>();
        while (st.size()>index){
            del.push(st.pop());
            st.pop();
        }
        while (st.size()>0){
            del.push(st.pop());
        }
        System.out.println("after deletion");
        System.out.println(del);

        while(del.size()>0){
            st.push(del.pop());
        }
        System.out.println("main stack me values pauch gai");
        System.out.println(st);

    }

}
