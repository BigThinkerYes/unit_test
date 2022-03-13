import java.util.ArrayList;
import java.util.List;

public class StudentService {
    StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public List<String> findNamesWithLetterE(){
        List<String> studentsWithLetterE = new ArrayList<>();
        for(String student : studentRepository.getStudentsFromDatabase()){
            if(student.contains("e")){
                studentsWithLetterE.add(student);
            }
        }
        return studentsWithLetterE;
    }
}
