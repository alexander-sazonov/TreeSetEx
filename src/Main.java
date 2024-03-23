import java.util.SortedSet;
import java.util.TreeSet;

// Пример использования класса TreeSet
public class Main {
    public static void main(String[] args) {
       TreeSet<Student> students = new TreeSet<>();
       students.add(new Student(3,"Peter"));
       students.add(new Student(5,"Alex"));
       students.add(new Student(2,"John"));
       students.add(new Student(4,"Katy"));

    }
    //метод должен вернуть подмножество всех студентов, сдавших экзамен на оченку больше, чем mark
    public static SortedSet<Student> getAllStudentsFromMark(int mark, TreeSet<Student> students){
       return null;
    }
}