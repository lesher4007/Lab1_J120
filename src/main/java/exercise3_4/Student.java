package exercise3_4;

import java.util.Collection;
import java.util.List;

public class Student extends Person{

    public Student(String name, String surname, GenderType genderType, String faculty) {
        super(name, surname, genderType, faculty);
    }

    static class BachelorAndMaster extends Student{
         private Stage stage;
         private Course course;

         public BachelorAndMaster(String name, String surname, GenderType genderType, String faculty, Stage stage, Course course) {
            super(name, surname, genderType, faculty);
            setStage(stage);
            setCourse(course);
        }

        public enum Stage{
            BACHELOR("Bachelor"), MASTER("Master");

            Stage(String stage) {
                this.stage = stage;
            }

            private String stage;

            public String getStage() {
                return stage;
            }
        }

        public enum Course{
            I,II,III
        }

        public void setStage(Stage stage) {
            this.stage = stage;
        }

        public Course getCourse() {
            return course;
        }

        public void setCourse(Course course) {
            this.course = course;
        }

        @Override
        public void print() {
            System.out.println("This is "+getName()+" "+getSurname()+". "+getStringGenderType()+" studies "+getFaculty()+". "+getStringGenderType()+" is "+getCourse()+"‘th year "+stage.getStage()+" student.");
        }

        @Override
        public String toString() {
            return "Student " +
                    "name: " + getName() +
                    ", surname: " + getSurname() +
                    ", gender: " + getGenderType() +
                    ", faculty: " + getFaculty() +
                    ", stage: " + stage +
                    ", course: " + course + "\n";
        }
    }

    static class Graduate extends Student{
        private String dissertationTopic;

        public Graduate(String name, String surname, GenderType genderType, String faculty, String dissertationTopic) {
            super(name, surname, genderType, faculty);
            setDissertationTopic(dissertationTopic);
        }

        @Override
        public void print() {
            System.out.println("This is "+getName()+" "+getSurname()+". "+getStringGenderType()+" studies "+getFaculty()+". "+graduateGender()+" thesis title is "+getDissertationTopic()+".");
        }

        @Override
        public String toString() {
            return "Graduate " +
                    "name: " + getName() +
                    ", surname: " + getSurname() +
                    ", gender: " + getGenderType() +
                    ", faculty: " + getFaculty() +
                    ", dissertation topic: " + dissertationTopic + "\n";
        }

        public String getDissertationTopic() {
            return dissertationTopic;
        }

        public void setDissertationTopic(String dissertationTopic) {
            this.dissertationTopic = dissertationTopic;
        }
    }
    static void addStudents(List<? super Student> collection) {

        Student student1 = new Student.BachelorAndMaster("Leo", "Wilkinson", GenderType.M, "Computer science", Student.BachelorAndMaster.Stage.BACHELOR, Student.BachelorAndMaster.Course.III);
        Student student2 = new Student.BachelorAndMaster("Mary", "Smith", GenderType.F, "World economy", Student.BachelorAndMaster.Stage.BACHELOR, Student.BachelorAndMaster.Course.II);
        Student student3 = new Student.BachelorAndMaster("Sara", "Parker", GenderType.M, "Jurisprudence", Student.BachelorAndMaster.Stage.BACHELOR, Student.BachelorAndMaster.Course.III);
        Student student4 = new Student.BachelorAndMaster("Jack", "Brown", GenderType.M, "Jurisprudence", Student.BachelorAndMaster.Stage.BACHELOR, Student.BachelorAndMaster.Course.II);
        Student student5 = new Student.BachelorAndMaster("Michael", "Jackson", GenderType.M, "World economy", Student.BachelorAndMaster.Stage.BACHELOR, Student.BachelorAndMaster.Course.I);

        collection.add(student1);
        collection.add(student2);
        collection.add(student3);
        collection.add(student4);
        collection.add(student5);


    }

}
