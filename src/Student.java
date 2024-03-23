public class Student implements Comparable<Student>{

    private String name;

    private int mark;

    public Student(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.mark - o.mark;
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }
}
