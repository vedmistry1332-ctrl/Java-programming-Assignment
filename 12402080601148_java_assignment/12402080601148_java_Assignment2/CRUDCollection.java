import java.util.*;

public class CRUDCollection {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("ved");
        students.add("vidhang");
        students.add("vedant");

        System.out.println("ArrayList (Student Names): " + students);

        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(1148, "ved");
        studentMap.put(1149, "vidhang");
        studentMap.put(1146, "vedant");

        System.out.println("HashMap (Student Records): " + studentMap);

        System.out.println("Student with ID 1149: " + studentMap.get(1149));

        studentMap.put(1149, "vidhang Mundra");
        System.out.println("Updated Record: " + studentMap);

        studentMap.remove(1148);
        System.out.println("After Deletion: " + studentMap);

        TreeMap<Integer, String> sortedMap = new TreeMap<>(studentMap);

        System.out.println("TreeMap (Sorted Records): " + sortedMap);
    }
}