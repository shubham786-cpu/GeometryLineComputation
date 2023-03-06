package javapackages;
import java.util.Scanner;
import java.lang.Math;

public class GeometryLine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values for Line1");
        System.out.println("Enter value of x1:");
        int x1=sc.nextInt();
        System.out.println("Enter value of y1:");
        int y1=sc.nextInt();
        System.out.println("Enter value of x2:");
        int x2=sc.nextInt();
        System.out.println("Enter value of y2:");
        int y2=sc.nextInt();
        System.out.println("Enter values for Line2");
        System.out.println("Enter value of x1:");
        int lx1=sc.nextInt();
        System.out.println("Enter value of y1:");
        int ly1=sc.nextInt();
        System.out.println("Enter value of x2:");
        int lx2=sc.nextInt();
        System.out.println("Enter value of y2:");
        int ly2=sc.nextInt();
        double length1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double length2=Math.sqrt(Math.pow((lx2-lx1),2)+Math.pow((ly2-ly1),2));
        if(length1>length2) {
            System.out.println("The length of line 1 with cartesian points ("+x1+","+y1+") and ("+x2+","+y2+") is greater than line 2");
        }
        else if(length1<length2){
            System.out.println("The length of line 2 with cartesian points ("+lx1+","+ly1+") and ("+lx2+","+ly2+") is greater than line 1");
        }
        else {
            System.out.println("The lengths of both lines are equal");
        }

    }
}