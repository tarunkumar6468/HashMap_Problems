package Stack;

import java.util.Scanner;
import java.util.Stack;

public class displayValues {
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

        Stack<Integer> nst = new Stack<>();
        while(st.size()>0){
            nst.push(st.pop());
        }
        System.out.println("reverse stack");
        System.out.println(nst);

        while (nst.size()>0){
            int x = nst.pop();
            System.out.print(x+" "); // yhi original print value aa ja rhi h but array

            st.push(x);
        }
        System.out.println();
        System.out.println("copy stack");
        System.out.println(st);

    }
}
