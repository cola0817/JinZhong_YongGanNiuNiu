import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Cola0817
 * @name ClassMapIOTestV1
 * @date 2023/9/18 18:11
 * @since 1.0.0
 */
public class ClassMapIOTestV1 {
    public static void main(String[] args) throws IOException {
        String filePath = "classMap.csv";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = "";
        String[] className = {"class_0", "class_1", "class_2"};
        List<String> classNameList = Arrays.stream(className).toList();
        List<String> list_0 = new ArrayList<>();
        List<String> list_1 = new ArrayList<>();
        List<String> list_2 = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            if (classNameList.containsAll(List.of(className))){
                while ((line = reader.readLine()) != null){
                    list_0.add(line);
                    if (classNameList.containsAll(List.of(className))){
                        while ((line = reader.readLine()) != null){
                            list_1.add(line);
                            if (classNameList.containsAll(List.of(className))){
                                while ((line = reader.readLine()) != null){
                                    list_2.add(line);
                                }
                            }
                        }
                    }
                }
            }

        }
        System.out.println("list0");
        list_0.forEach(System.out::println);
        System.out.println("list2");
        list_1.forEach(System.out::println);
        System.out.println("list1");
        list_2.forEach(System.out::println);

    }
}
