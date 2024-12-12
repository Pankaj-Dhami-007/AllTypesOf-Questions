import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentEntry{
    long id;
    String name;
    long age;


public StudentEntry(int id, String name, long age) {
    this.id = id;
    this.name = name;
    this.age = age;
}

public long getId(){
    return id;
}

@Override
public String toString() {
    return "StudentEntry{id = '" +id +"', name='" + name + "', age=" + age + "}";
 }
}

class StudentController{

    Map<Long,StudentEntry> studentEntries = new HashMap<>();
    private StudentEntry mEntry;
    public StudentController(){

        studentEntries.put(101L, new StudentEntry(101, "Pankaj", 25));
        studentEntries.put(102L, new StudentEntry(102, "Singh", 26));
        studentEntries.put(103L, new StudentEntry(103, "Dhami", 27));

    }

    public List<StudentEntry> getAll(){

        return new ArrayList<>(studentEntries.values());
    }
}

public class CollectionsExample {
    public static void main(String[] args) {
        
      StudentController controller = new StudentController();
      List<StudentEntry> students = controller.getAll();
      students.forEach(System.out :: println);

    }
}
