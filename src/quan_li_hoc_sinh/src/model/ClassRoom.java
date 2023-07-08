package model;

import java.util.ArrayList;

public class ClassRoom {
    private String idClass;
    private String nameClass;

    public ClassRoom(String idClass, String nameClass) {
        this.idClass = idClass;
        this.nameClass = nameClass;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "Lớp học {" +
                "id lớp học = " + idClass +
                ", Tên lớp học ='" + nameClass + '\'' +
                '}'+ "\n";
    }
}
