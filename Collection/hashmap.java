import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class hashmap {
    
    public static void main(String[] args) {
        
        Map<String,String>mapping = new HashMap<>();

        mapping.put("In", "India");
        // mapping.put("In", "India2");
        mapping.put("Us", "United States");
        mapping.put("Uk", "United Kingdom");


  System.out.println(mapping);


  Map<String,String>table = new HashMap<>();
table.put("Br","Brazil");

System.out.println("Before:"  + table);

table.putAll(mapping);

System.out.println("After:"  + table);

table.remove("Uk");
System.out.println("After removing Uk:"  + table);

System.out.println(table.get("In"));


System.out.println(table.getOrDefault("usa", "none"));

System.out.println(table.containsKey("In"));

System.out.println(table.containsValue("Brazil"));

table.replace("In","Indonesia");

System.out.println(table);


Set<String>keyset=table.keySet();

System.out.println(keyset);

Collection<String>valuset = table.values();

System.out.println(valuset);


// get all entry

Set<Map.Entry<String,String>>entryset = table.entrySet();

System.out.println(entryset);

// table.putIfAbsent("Is","India3");

// System.out.println(table);


// System.out.println(table.size());
// table.clear();
// System.out.println(table.size());



    }
}
