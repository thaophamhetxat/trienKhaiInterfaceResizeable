package circle;

public class Rectangle implements Resizeable {
    double width;
    double height;

    public Rectangle(){

    }
    public Rectangle(double width,double height){
        this.width =width;
        this.height =height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(){
        this.width = width;
    }
    public void setHeight(){
        this.height=height;
    }
    public double getPermiter(){
        return this.width*this.height;
    }
    public String toString(){
        return "status rectangle: width= "+this.width+", height= "+this.height;
    }
    public void resize(double persent){
        System.out.println(persent);
    }
}
