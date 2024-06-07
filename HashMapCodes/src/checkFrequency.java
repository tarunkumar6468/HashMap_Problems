import java.util.HashMap;
import java.util.Scanner;

public class checkFrequency {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int newFrequency = 0;
        HashMap<Character, Integer>  mp = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(mp.containsKey(ch)){
                int oldFrequency = mp.get(ch);
                 newFrequency = oldFrequency+1;
                mp.put(ch,newFrequency);
            }
            else{
                mp.put(ch,i);
            }
        }
        char mfc = str.charAt(0);
        for(Character key : mp.keySet()){
            if(mp.get(key)>mp.get(mfc)){
                mfc = key;
            }
        }
        System.out.print(mfc+" "+newFrequency);

    }
}
