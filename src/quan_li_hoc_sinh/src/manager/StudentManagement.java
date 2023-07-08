package manager;

import model.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement implements Management<Student> {
    WriteFileStudent writeFileStudent = new WriteFileStudent();
    ReadFileStudent readFileStudent = new ReadFileStudent();
    List<Student> students;

    public StudentManagement() {
        try {
            students = readFileStudent.readData();
            System.out.println("Đọc dữ liệu thành công !");
        } catch (IOException e) {
            System.out.println("Đọc dữ liệu không thành công !");
        }
    }


    @Override
    public void add(Student student) {

        students.add(student);
         writeFileStudent.writeData(students);
    }

    @Override
    public void edit(String id, Student student) {
        int index = findIndexById(id);
        students.set(index, student);
        writeFileStudent.writeData(students);

    }

    @Override
    public void delete(String id) {
        int index = findIndexById(id);
        students.remove(index);
        writeFileStudent.writeData(students);
    }

    @Override
    public int findIndexById(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Student> getAll() {

        return students;
    }

    public void findByName(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().contains(name)) {
                System.out.println(students.get(i).toString());
            }
        }
    }
}
