package Creational_Design_Pattern.Builder;

public class Student {
    int id;
    String name;
    double psp;
    int age;
    int gradeYear;
    private Student(Builder builder){
        this.id = builder.id;
        this.age= builder.age;
        this.name = builder.name;
        this.psp = builder.psp;
        this.gradeYear = builder.gradeYear;
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    static class Builder{
        int id;
        String name;
        double psp;
        int age;
        int gradeYear;
        private Builder(){

        }
        // Here we can define the validation of attributes and restrict to create the object of student
        Builder setId(int id){
            this.id = id;
            return this;
        }
        Builder setPsp(double psp){
            this.psp = psp;
            return this;
        }

        Builder setAge(int age){
            this.age = age;
            return this;
        }
        Builder setGradeYear(int gradeYear){
            this.gradeYear = gradeYear;
            return this;
        }
        Builder setName(String name){
            this.name = name;
            return this;
        }

        Student build(){
            return new Student(this);
        }

    }
}
