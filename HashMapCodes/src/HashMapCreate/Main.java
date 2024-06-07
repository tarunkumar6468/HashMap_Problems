package HashMapCreate;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void HashMapMethod(){
        Map<String,Integer> mp  = new HashMap<>();
        mp.put("tarun",3);
        mp.put("rahul",5);
        mp.put("arjun",2);
        mp.put("akash",6);
        mp.put("shivani",8);

        System.out.println(mp.get("tarun"));
        mp.put("rahul",7);
        System.out.println("Before remove = "+mp);
        System.out.println(mp.get("rahul"));
        mp.remove("shivani");
        System.out.println(mp);
        mp.putIfAbsent("kumar",38);
        System.out.println("all values = "+mp.values());
        System.out.println("kry or values = "+mp.entrySet());

        for( Map.Entry<String,Integer> key  : mp.entrySet()){
            System.out.println("Age of = "+key);
        }
        mp.put("tarun",9);
        System.out.println(mp.entrySet());

        System.out.println();
        for(var a : mp.entrySet()){
            System.out.println(a);
        }



       /*  import features of HashMap class
         To access a value one must Know its key.
        HashMap doesn't allow duplicate keys but allows duplicate values.
         That means A single key Can't contain more than 1 value but more
         than 1 key can contain a Single value.
         HashMap allows null key also but only once and multiple null values
         Java HashMap Maintains no order.



         APPLICATION OF HASHMAPS

         1.problems related to frequency of an item
         2.Mapping problems
         3. storages optimization
         4. dictionary
        5. phoneBook;

        */
        System.out.println();
    }
    public static void checkFreq(int []arr){
        HashMap<Integer,Integer>mp = new HashMap<>();

        for(var i : arr){
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        System.out.println(mp);
        int max = 0; int anskey = -1;
        for(var e :mp.entrySet()){
            if(e.getValue()>max) {
                max = e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.println(anskey);
    }
    public static void main(String[] args){
        Main m = new Main();
        m.HashMapMethod();
        int arr[] = {1,2,3,4,1,2,2,2,2,2,2,3,4,3,3,3,4,4,2,2};
        checkFreq(arr);
    }
}
