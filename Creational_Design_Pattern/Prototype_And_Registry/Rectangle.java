package Creational_Design_Pattern.Prototype_And_Registry;

public class Rectangle extends Shape{
    int width, height;
    public Rectangle(){

    }
    public Rectangle(Rectangle target){
        super(target);
        if(target != null){
            this.height = target.height;
            this.width = target.width;
        }
    }
    @Override
    public Rectangle clone(){
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof  Rectangle) || !super.equals(object)) return false;
        Rectangle tmp = (Rectangle) object;
        return tmp.height == this.height && this.width == tmp.width;
    }
}
