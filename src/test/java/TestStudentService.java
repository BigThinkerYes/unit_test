import org.testng.annotations.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TestStudentService {
    StudentRepository studentRepository = new StudentRepository();
    StudentService studentService = new StudentService(studentRepository);
    @Test
    public void testFindNamesWithLettersE(){
        when(studentRepository.getStudentsFromDatabase()).thenReturn(List.of("jon", "david", "elon", "michelle", "esther"));
        List<String> result = studentService.findNamesWithLetterE();
        List<String> expected = List.of("elon", "michelle", "esther");
        assertEquals(expected, result);
        verify(studentRepository).getStudentsFromDatabase();
    }
}
