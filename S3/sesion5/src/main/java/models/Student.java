package models;

public class Student {
    private float average;
    private String cif;
    private String firstName;
    private String lastName;
    private String major;
    private boolean hasScholarship;

    public Student() {
    }

    public Student(boolean hasScholarship, String major, String lastName, String firstName, String cif, float average) {
        this.hasScholarship = hasScholarship;
        this.major = major;
        this.lastName = lastName;
        this.firstName = firstName;
        this.cif = cif;
        this.average = average;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("average=").append(average);
        sb.append(", cif='").append(cif).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", major='").append(major).append('\'');
        sb.append(", hasScholarship=").append(hasScholarship);
        sb.append('}');
        return sb.toString();
    }
}
