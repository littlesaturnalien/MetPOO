package models;

public class Admission {
    /**
     * Calcula si el estudiante tiene derecho a beca
     * @param student
     */
    public void calcScholarship(Student student) {
        student.setHasScholarship(student.getAverage()>=80);

        /*if(student.getAverage() >= 80) {
            student.setHasScholarship(true);
        }
        else {
            student.setHasScholarship(false);
        }*/
    }
}
