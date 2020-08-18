package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area
{
    public static void main(String[] args){
        Scanner input;
        input = new Scanner(System.in);
        double radius;

        do{
            System.out.print("Enter a radius: ");
            radius = input.nextDouble();
        } while(radius < 0);
        double area = Circle.getArea(radius);
        System.out.println("the area of a circle of radius " + radius + " is: " + area);
        input.close();
    }
}
