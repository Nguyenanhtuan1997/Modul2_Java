package quan_li_ho_so_HS.Manager;

import quan_li_ho_so_HS.Student.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentMangement implements Management<Student> {
    List<Student> students = new ArrayList<>();


    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void edit(String id, Student student) {
        int index = findIndexById(id);
        students.set(index, student);
    }

    @Override
    public void delete(String id) {
        int index = findIndexById(id);
        students.remove(index);
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
            if (students.get(i).getFullName().contains(name)) {
                System.out.println(students.get(i).toString());
            }
        }
    }
}
