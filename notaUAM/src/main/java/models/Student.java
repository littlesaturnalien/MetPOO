package models;

public class Student {
    private String cif;
    private String names;
    private String surnames;
    private String course;
    private int term1;
    private int term2;
    private int term3;

    //Empty Constructor
    public Student() {
    }

    //Constructor with all the parameters
    public Student(String cif, String names, String surnames, String course, int term1, int term2, int term3) {
        this.cif = cif;
        this.names = names;
        this.surnames = surnames;
        this.course = course;
        this.term1 = term1;
        this.term2 = term2;
        this.term3 = term3;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getTerm1() {
        return term1;
    }

    public void setTerm1(int term1) {
        this.term1 = term1;
    }

    public int getTerm2() {
        return term2;
    }

    public void setTerm2(int term2) {
        this.term2 = term2;
    }

    public int getTerm3() {
        return term3;
    }

    public void setTerm3(int term3) {
        this.term3 = term3;
    }

    public int getFinalGrade() {
        return (int) (this.term1 + this.term2 + this.term3)/3;
    }

    public String evalFinalGrade() {
        int finalGrade = getFinalGrade();
        if (finalGrade >= 70 && finalGrade <= 100){
            return "Class passed";
        } else if (finalGrade >= 0 && finalGrade < 70){
            return "Class failed";
        } else {
            return "Invalid grade";
        }
    }

    public String evalMakeUpTest() {
        int finalGrade = getFinalGrade();
        if (finalGrade < 0 || finalGrade > 100) {
            return "Invalid grade";
        } else if (finalGrade >= 60 && finalGrade <= 69) {
            return "Approved";
        } else {
            return "Denied";
        }
    }
}
