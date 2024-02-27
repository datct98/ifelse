package lol.entities;

import java.util.ArrayList;

public class ClassRoom {
    private ArrayList<Figure> students;

    public ArrayList<Figure> getStudents() {
        return students;
    }

    public ClassRoom(ArrayList<Figure> students) {
        this.students = students;
    }

    public ClassRoom() {

    }
}
