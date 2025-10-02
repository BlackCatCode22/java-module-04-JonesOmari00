//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> empIds = new java.util.HashMap<>();

        empIds.put("Omari", 79832);
        empIds.put("Ryan", 73455);
        empIds.put("Posey", 32564);

        System.out.println(empIds);

        System.out.println(empIds.get("Omari"));

        System.out.println(empIds.containsKey("Ryan"));
        System.out.println(empIds.containsValue("32564"));

        empIds.put("Omari", 63837);
        System.out.println(empIds);

        empIds.putIfAbsent("Billy",  74342);
        System.out.println(empIds);

        empIds.remove("Posey");
        System.out.println(empIds);
    }
}