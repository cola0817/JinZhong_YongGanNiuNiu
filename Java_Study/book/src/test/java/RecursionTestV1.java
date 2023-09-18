import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Cola0817
 * @name RecursionTestV1
 * @date 2023/9/18 18:41
 * @since 1.0.0
 */
public class RecursionTestV1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("classMap.csv"));
        String line = "";
        List<String> studentList = new ArrayList<>();
        String[] classNames = {"class_0", "class_1", "class_2"};
        List<String> classNameList = Arrays.stream(classNames).toList().stream().toList();
        while ((line = reader.readLine()) != null){

        }
    }

/*    public static List<List<String>> subjectStudentsByClass(List<String> classNameList,String line){

    }*/
}
