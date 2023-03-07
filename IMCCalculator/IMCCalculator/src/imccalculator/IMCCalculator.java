/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imccalculator;

/**
 *
 * @author Ariel
 */
import java.util.Scanner;

public class IMCCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso (em kg): ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura (em metros ex 1.50): ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
    }

}
