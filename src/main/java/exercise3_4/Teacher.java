package exercise3_4;

public class Teacher extends Person{

    private AcademicDegree academicDegree;
    private String nameOfSpecialty;

    public Teacher(String name, String surname, GenderType genderType, String faculty, AcademicDegree academicDegree, String nameOfSpecialty) {
        super(name, surname, genderType, faculty);
        setAcademicDegree(academicDegree);
        setNameOfSpecialty(nameOfSpecialty);
    }

    public AcademicDegree getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(AcademicDegree academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getNameOfSpecialty() {
        return nameOfSpecialty;
    }

    public void setNameOfSpecialty(String nameOfSpecialty) {
        this.nameOfSpecialty = nameOfSpecialty;
    }

    public enum AcademicDegree{
        MSc, PhD
    }

    @Override
    public void print() {
        System.out.println("This is "+getName()+" "+getSurname()+". "+getStringGenderType()+" teaches "+getFaculty()+". "+getStringGenderType()+" has "+getAcademicDegree()+" degree in "+getNameOfSpecialty()+".");
    }

    @Override
    public String toString() {
        return "Teacher " +
                "name: " + getName() +
                ", surname: " + getSurname() +
                ", gender: " + getGenderType() +
                ", faculty: " + getFaculty() +
                ", academic degree: " + academicDegree +
                ", name of specialty: " + nameOfSpecialty + "\n";
    }
}
