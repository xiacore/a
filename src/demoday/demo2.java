package demoday;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo2 {
    public static void main(String[] args) {


//        System.out.println("Aa".hashCode()); // 2112
//        System.out.println("BB".hashCode()); // 2112

        HashMap<String,String> map = new HashMap<>();
        map.put("Aa","www");
        map.put("BB","www");
        //rgre

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println(entrySet);
        System.out.println(entrySet.size());

    }
}
