package circle;

public class RecizeableCircleTest {
    public static void main(String[] args) {
        Cricle cricle = new Cricle(2.0);
        System.out.println("redius= "+cricle.getRadius());
        cricle.resize(Math.floor(Math.random()*100));
        System.out.println(cricle);
        System.out.println(Math.floor(cricle.getArea()));

        Rectangle rectangle =new Rectangle(2,5);
        System.out.println(rectangle);
        System.out.println("S="+rectangle.getPermiter());
    }


}
