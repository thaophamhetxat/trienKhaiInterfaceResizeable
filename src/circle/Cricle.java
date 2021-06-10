package circle;

public class Cricle implements Resizeable{
    double radius;

    public Cricle(){

    }
    public Cricle(double radius){
        this.radius =radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){

        return Math.pow(radius,2)*Math.PI;
    }
    public String toString(){

        return "status circle: radius= "+this.radius;
    }
    public void resize(double percent){
        System.out.println("random= "+percent);
        this.radius = this.radius+(this.radius / 100 * percent);
    }
}
