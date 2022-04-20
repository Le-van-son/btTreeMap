package HashMap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        //HashMap....................
        Map<String,Integer>hashMap1 = new HashMap<>();
        hashMap1.put("Son",29);
        hashMap1.put("Dat",25);
        hashMap1.put("NA",23);
        hashMap1.put("Thien",22);
        System.out.println("Hiển thị ds trong HashMap: ");
        System.out.println(hashMap1 + "\n");
        //TreeMap....................
        Map<String,Integer> treeMap1 = new TreeMap<>(hashMap1);
        System.out.println("Hiển thị ds trong treeMap: ");
        System.out.println(treeMap1+ "\n");
        //LinkedHashMap....................
        Map<String,Integer>linkedHashMap1 = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap1.put("Son",29);
        linkedHashMap1.put("Dat",25);
        linkedHashMap1.put("NA",23);
        linkedHashMap1.put("Thien",22);
        System.out.println("Hiển thị ds trong LinkedHashMap");
        System.out.println(linkedHashMap1);
    }

}
