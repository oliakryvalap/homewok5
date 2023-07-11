import java.util.HashMap;

public class task2 {
  public static <T> void main(String[] args) {
HashMap<String, Integer> phonesAndNames = new HashMap<>();

       phonesAndNames.put("Петров", 212133);
       phonesAndNames.put("Иванов", 162348);
       phonesAndNames.put("Петров" ,8082771);
       phonesAndNames.put("Ивагов", 2358975);
       phonesAndNames.put("Петров", 8012771);
        phonesAndNames.put("Иванов", 162228);
       phonesAndNames.put("Сидоров", 80223771);

class phonesAndNames {
     
    private Integer id;
    private String name;
     
    phonesAndNames (Integer id, String name) {
        this.id = id;
        this.name = name;
    }
     
    public String toString() {
        return "[id="+id + ", name=" + name + "]";
    }
    sortedMapDesc = map.entrySet()
                  .stream()
                  .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                  .collect(Collectors
                   .toMap(Map.Entry::getKey,
                          Map.Entry::getValue,
                          (e1, e2) -> e1,
                           LinkedHashMap::new));
     
}
 System.out.println(phonesAndNames);
for (var item : phonesAndNames.entrySet()){
    System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
}
}
}