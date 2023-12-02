package exercise3_4;

import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Person teacher1 = new Teacher("Ronald", "Turner", GenderType.M, "Computer science", Teacher.AcademicDegree.PhD, "Programming paradigms");
        Person teacher2 = new Teacher("Ruth", "Hollings", GenderType.F, "Jurisprudence", Teacher.AcademicDegree.MSc, "Domestic arbitration");
        Person student1 = new Student.BachelorAndMaster("Leo", "Wilkinson", GenderType.M, "Computer science", Student.BachelorAndMaster.Stage.BACHELOR, Student.BachelorAndMaster.Course.III);
        Person student2 = new Student.BachelorAndMaster("Anna", "Cunningham", GenderType.F, "World economy", Student.BachelorAndMaster.Stage.BACHELOR, Student.BachelorAndMaster.Course.I);
        Student student3 = new Student.BachelorAndMaster("Jill", "Lundqvist", GenderType.F, "Jurisprudence", Student.BachelorAndMaster.Stage.MASTER, Student.BachelorAndMaster.Course.I);
        Student.Graduate student4 = new Student.Graduate("Ronald", "Correa", GenderType.M, "Computer science", "Design of a functional programming language");
        Person person = new Person("Enrico", "Chivaldori", GenderType.M, "Computer science" );

        Collection<Person> collectionPerson = new LinkedList<>();

        collectionPerson.add(teacher1);
        collectionPerson.add(teacher2);
        collectionPerson.add(student1);
        collectionPerson.add(student2);
        collectionPerson.add(student3);
        collectionPerson.add(student4);
        collectionPerson.add(person);

        Person.printCollection(collectionPerson);
        System.out.println("---------------------------------------------------");

        Collection<Student> collectionStudent = new LinkedList<>();

        collectionStudent.add(student3);
        collectionStudent.add(student4);

        Person.printCollection(collectionStudent);

        Student.addToCollection(collectionStudent);
        












    }


}
