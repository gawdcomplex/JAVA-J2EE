package DAY6;

public class HashMap4 {
    private String name;
    private String rollNo;

    public HashMap4(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    @Override
    public String toString() {
        return "HashMap4 [name=" + name + ", rollNo=" + rollNo + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public static void main(String[] args) {
        HashMap4 student = new HashMap4("Sparsh", "5678");

        System.out.println(student);
    }
}
