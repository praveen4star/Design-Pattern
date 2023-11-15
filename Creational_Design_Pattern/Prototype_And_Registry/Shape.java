package Creational_Design_Pattern.Prototype_And_Registry;

public abstract class Shape {
    int x , y;
    String color;
    public  Shape(){};
    public Shape(Shape target){
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }
    public abstract Shape clone();
    public boolean equals(Object object){
        if(!(object instanceof Shape)) return false;
        Shape tmp = (Shape) object;
        return tmp.x == this.x && tmp.y == this.y && tmp.color.equals(this.color) ;
    }
}
