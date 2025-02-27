package DAY6;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<String, Student1> map = new HashMap<>();
        map.put("s1", new Student1("PQR", "1234"));
        map.put("s2", new Student1("Xyz", "1434"));
        map.put("s3", new Student1("Abc", "5234"));

        for (Map.Entry<String, Student1> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

class Student1 {
    private String name;
    private String id;

    public Student1(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

