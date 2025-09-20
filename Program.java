package application;

import entities.Bill;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bill conta = new Bill();

        System.out.print("Sexo: (M/F): ");
        conta.gender = sc.next().toUpperCase().charAt(0);

        System.out.print("Quantidade de crevejas: ");
        conta.beer = sc.nextInt();

        System.out.print("Quantidade de refrigerante: ");
        conta.softDrink = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        conta.barbecue = sc.nextInt();

        System.out.println();

        System.out.println("RELATÓRIO:");
        System.out.println("Consumo = " + String.format("%.2f",  conta.feeding()));

        if (conta.feeding() == 0.0) {
            System.out.println("Isento de Couvert");
        }
        else{
            System.out.println("Couvert = " + String.format("%.2f", conta.cover()));
        }

        System.out.println("Ingresso = " + String.format("%.2f", conta.ticket()));

        System.out.println();

        System.out.println("Valor a pagar = R$ " + String.format("%.2f%n", conta.total()));
    }
}