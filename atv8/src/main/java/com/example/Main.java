package com.example;

public class Main {
    public static void main(String[] args) {

        Circulo c = new Circulo(5);
        Retangulo r = new Retangulo(4, 6);
        Quadrado q = new Quadrado(4);
        Triangulo t = new Triangulo(8, 5);

        System.out.println("Círculo:");
        System.out.println("Arestas: " + c.quantidadeArestas());
        System.out.println("Área: " + c.calculaArea());

        System.out.println("\nRetângulo:");
        System.out.println("Arestas: " + r.quantidadeArestas());
        System.out.println("Área: " + r.calculaArea());

        System.out.println("\nQuadrado:");
        System.out.println("Arestas: " + q.quantidadeArestas());
        System.out.println("Área: " + q.calculaArea());

        System.out.println("\nTriângulo:");
        System.out.println("Arestas: " + t.quantidadeArestas());
        System.out.println("Área: " + t.calculaArea());
    }
}