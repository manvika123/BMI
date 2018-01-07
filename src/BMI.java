import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        double bmi, weight_pound, height_inch,weight_kg, height_metres;
        Scanner sc= new Scanner(System.in);
        weight_pound = sc.nextDouble();
        height_inch = sc.nextDouble();

        weight_kg = weight_pound *0.45359237;
        height_metres = height_inch *0.0254;

        bmi = weight_kg/(2*height_metres);
        System.out.println("the Body Mass Intex is "+bmi);
    }
}
