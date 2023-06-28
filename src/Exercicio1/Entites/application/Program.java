package Exercicio1.Entites.application;

import Exercicio1.Entites.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //fazer um programa para ler os valores da largura e altura de um retângulo.
        //Em seguida, mostrar na tela o valor de sua area, perimetro e diagonal.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and heigth: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("Area = %.2f%n", rect.area());
        System.out.printf("Perimeter = %.2f%n", rect.perimeter());
        System.out.printf("Diagonal = %.2f%n", rect.diagonal());

        sc.close();

    }
}
