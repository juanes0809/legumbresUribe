package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner pedirDato= new Scanner(System.in);


        System.out.println("Cual es el nombre del produto?");
        String nombreProducto=pedirDato.nextLine();

        System.out.println("Cual es el nombre del distribuidor?");
        String nombreDistribuidor= pedirDato.nextLine();

        System.out.println("Cual es el costo del lote?");
        double costoLote=pedirDato.nextDouble();

        double costoVentaPublico;
        int cantidadCompradaProducto;
        int totalCompra;

        System.out.println("****************");
        System.out.println("Resumen ingreso mercancia: ");
        System.out.println("Lote que entra: "+nombreProducto);
        System.out.println("Costo toal: $"+costoLote);
        System.out.println("Entregado por: "+nombreDistribuidor);
        System.out.println("*****************");


        System.out.println("\n++++++Venta el detal++++++\n");
        costoVentaPublico=5000;

        System.out.println("Apreciado usuario, el costo unitario de "+nombreProducto+"es de: $"+costoVentaPublico);

        System.out.println("Digita la cantidad de "+nombreProducto+"Que quieres comprar ");
        cantidadCompradaProducto= pedirDato.nextInt();
        

    }
}