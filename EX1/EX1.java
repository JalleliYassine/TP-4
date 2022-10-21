package TP4.EX1;
import java.util.*;;

public class EX1 {

    public static void main(String[] args) {
        Point point= new Point();

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter x: ");  
        Double x= sc.nextDouble();

        System.out.print("Enter y: ");  
        Double y= sc.nextDouble();
        sc.close();


        point.setX(x);

        point.setY(y);

        Double distance = point.distance();
        String cords = point.toString();

        System.out.print("La distance entre [0:0] et " + cords + " = " + distance);



    }


}