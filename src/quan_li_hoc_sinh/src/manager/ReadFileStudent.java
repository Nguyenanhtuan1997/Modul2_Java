package manager;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileStudent {
    File file = new File("D:\\JavaModul2\\quan_li_hoc_sinh\\file\\student.csv");

    public List<Student> readData() throws IOException {
        List<Student> students = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                students.add(new Student(strings[0], strings[1], Integer.parseInt(strings[2]), strings[3]));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
