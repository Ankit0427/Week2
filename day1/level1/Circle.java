
import java.util.Scanner;

class crl{
    double radius;
    double area;
    double perimeter;

    void setter(double radius)
    {
        this.radius=radius;
    }

    public void area()
    {
        area=2*Math.PI*radius*radius;
        System.out.println("The Area of circle is  :  " + area );
    }

    public void peri()
    {
        perimeter=2*Math.PI*radius;
        System.out.println("The Area of circle is  :  " + perimeter );
    }

}
class Circle {

    public static void main(String[] args) {
        
        crl c1=new crl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        double radius=sc.nextDouble();
        c1.setter(radius);
        c1.area();
        c1.peri();
    }
    
}
