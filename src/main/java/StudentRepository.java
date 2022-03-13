import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private String[] studentDatabase = {"jon", "david", "elon", "michelle", "esther"};

    public List<String> getStudentsFromDatabase(){
        List<String> studentFromDb = new ArrayList<>();
        for(String student : studentDatabase){
            studentFromDb.add(student);
        }
        return studentFromDb;
    }
}
