package manager;

import model.Student;

import java.io.*;
import java.util.List;

public class WriteFileStudent <E>{
    File file = new File("D:\\JavaModul2\\quan_li_hoc_sinh\\file\\student.csv");
    public void writeData(List<Student> students) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student st : students) {
                bufferedWriter.write(st.writeString());
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
