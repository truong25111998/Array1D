package Student;

public class Student {
    private String name;
    private int age;
    private float point;

    public Student(String name, int age, float point) {
        this.name = name;
        this.age = age;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public void inTT(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("point: " + point);
    }
}
