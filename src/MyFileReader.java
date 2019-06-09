import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class MyFileReader {

    public static void readLines() throws IOException {
        String fileName = "C:\\Users\\Curtis\\IdeaProjects\\Advent-Of-Code2\\src\\AOCInputFiles\\2018-Day1-Task1";
        File file = new File(fileName);
        FileInputStream inputStream = new FileInputStream(file);
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        List<Integer> inputNumberList = new ArrayList<>();

        String line;
        while((line = bufferedReader.readLine()) != null) {
            inputNumberList.add(Integer.parseInt(line));
        }

        System.out.println(inputNumberList);

    }
}
