package Stack;

import java.net.Inet4Address;
import java.util.Scanner;
import java.util.Stack;

public class insertElementAnyIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            st.push(c);
        }
        System.out.println("first stack");
        System.out.println(st);
        int idx = 2;
        int x = 7;

        Stack<Integer> temp = new Stack<>();
        while (st.size() > idx) {
            temp.push(st.pop());
        }
        System.out.println("temp stack : "+temp);
        st.push(x);
        while (temp.size() > 0) {
            st.push(temp.pop());
        }
        System.out.println("second time st");
        System.out.println(st);

    }
}
