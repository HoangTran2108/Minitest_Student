package model;

public class Student {
    private String name;
    private String id;
    private String dateOfBirth;
    private String className;

    public Student() {
    }

    public Student( String name, String id, String dateOfBirth, String className) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Họ và tên: " + name  +
                ", Mã sinh viên: " + id +
                ", Ngày sinh" + dateOfBirth +
                ", Lớp: " + className;
    }
}
