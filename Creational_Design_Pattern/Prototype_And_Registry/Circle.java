package Creational_Design_Pattern.Prototype_And_Registry;

public class Circle extends Shape{
    int radius;
    public Circle(){};
    public Circle(Circle target){
        super(target);
        if(target != null){
           this.radius = target.radius;
        }
    }
    @Override
    public Circle clone(){
       return new Circle(this);
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Circle) || !super.equals(object)) return false;
        Circle tmp = (Circle) object;
        return this.radius == tmp.radius;
    }
}
