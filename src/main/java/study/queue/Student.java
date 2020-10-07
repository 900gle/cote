package study.queue;

public class Student implements Comparable<Student>{

    String name;
    int age;

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름 : " + name + ", 점수 : " + age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age <= o.age ? 1 : -1;
    }
}
