package Creational_Design_Pattern.Builder;

public class Main {
    public static void main(String[] args) {
        Student.Builder b = Student.getBuilder()
                    .setAge(1)
                    .setId(2)
                    .setPsp(24.4)
                     .setGradeYear(2014).setName("Praveen");
        Student s1 = b.build();
        System.out.println("id : "+s1.id);
        System.out.println("name : "+s1.name);
        System.out.println("age : "+s1.age);
        System.out.println("psp : "+s1.psp);
        System.out.println("gradeYear : "+s1.gradeYear);

    }
}
