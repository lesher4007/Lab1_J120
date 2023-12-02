package exercise3_4;

import java.util.Collection;

public class Person {

    private String name;
    private String surname;
    private GenderType genderType;
    private String faculty;

    public Person(String name, String surname, GenderType genderType, String faculty) {
        setName(name);
        setSurname(surname);
        setGenderType(genderType);
        setFaculty(faculty);
    }

    @Override
    public String toString() {
        return "Person " +
                "name: " + name +
                ", surname: " + surname +
                ", genderType: " + genderType +
                ", faculty: " + faculty +  "\n";
    }
    static public <T> void printCollection(Collection<T> collection){
        System.out.println(collection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStringGenderType() {
        return genderType.getPronoun();
    }

    public String getGenderType() {
        return genderType.getPronoun3();
    }

    public String graduateGender(){
        return genderType.getPronoun2();
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void print(){}

    public static void printAll(Person[] array) {
        for (Person person : array) {
            person.print();
        }
    }
}
