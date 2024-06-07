package Stack;

import java.util.Stack;

public class basicsOfJava {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(0);
        st.push(93);
        st.push(2);
        System.out.println(st);

        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        System.out.println(st.size());
    }
}
