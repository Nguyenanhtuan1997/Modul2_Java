package manager;

import model.ClassRoom;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class ClassManagement implements Management<ClassRoom> {
    ArrayList<ClassRoom> classRooms = new ArrayList<>();

    @Override
    public void add(ClassRoom classRoom) {

        classRooms.add(classRoom);
    }

    @Override
    public void edit(String id, ClassRoom classRoom) {
        int index = findIndexById(id);
        classRooms.set(index, classRoom);

    }

    @Override
    public void delete(String id) {
        int index = findIndexById(id);
        classRooms.remove(index);

    }

    @Override
    public int findIndexById(String id) {
        for (int i = 0; i < classRooms.size(); i++) {
            if (id.equals(classRooms.get(i).getIdClass())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<ClassRoom> getAll() {
        return classRooms;
    }

    public void findByName(String name) {
        for (int i = 0; i < classRooms.size(); i++) {
            if (classRooms.get(i).getNameClass().contains(name)) {
                System.out.println(classRooms.get(i).toString());
            }
        }
    }
}
