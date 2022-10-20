package pkg1;

public class ClassRoom {

    private String subject;
    private int studentsCount;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public void displayDetails() {
        System.out.println("this is a " + subject + " classroom and it has " + studentsCount + " students");
    }

}
