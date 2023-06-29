package quan_li_ho_so_HS.Student;

public class Student {
    private String id;
    private String fullName;
    private int age;
    private String homeTown;

    public Student(String id, String fullName, int age, String homeTown) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
