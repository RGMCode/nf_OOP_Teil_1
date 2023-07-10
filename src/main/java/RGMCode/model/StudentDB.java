package RGMCode.model;

import java.util.Objects;

public class StudentDB {

    protected int studID;
    protected String name;

    public StudentDB(int studID, String name) {
        this.studID = studID;
        this.name = name;
    }

    public int getStudID() {
        return studID;
    }

    public void setStudID(int studID) {
        this.studID = studID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studID=" + studID +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return studID == studentDB.studID && Objects.equals(name, studentDB.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studID, name);
    }


}
