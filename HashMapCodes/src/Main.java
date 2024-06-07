import java.util.Collections;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("agra",4038);
        mp.put("shringar",480);
        mp.put("afsa",24);
        mp.put("shrisdangar",480);
        mp.put("agraasd",40444438);
        mp.put("sdar",4803245);
        mp.put("dsafqwea",4234038);
        mp.put("shriefasgawaer",532);
        System.out.println(mp);
        System.out.println(mp.size());
        System.out.println(mp.clone());
        System.out.println(mp);
        System.out.println(mp.get("sdar"));
        System.out.println(mp.getOrDefault("agraasd", 3)+1);

    }
}