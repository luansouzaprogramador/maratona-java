package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.nome = "Ford Mustang";
        carro1.modelo = "GT";
        carro1.ano = 2022;
        carro2.nome = "Tesla Model S";
        carro2.modelo = "Plaid";
        carro2.ano = 2023;
        carro3 = carro1; // So podemos fazer isso quando temos objetos do mesmo tipo, na mesma linha de heranca

        System.out.println("Carro 1\nNome: "+carro1.nome+"\nModelo: "+carro1.modelo+"\nAno: "+carro1.ano);
        System.out.println("\nCarro 2\nNome: "+carro2.nome+"\nModelo: "+carro2.modelo+"\nAno: "+carro2.ano);
        System.out.println("\nCarro 3\nNome: "+carro3.nome+"\nModelo: "+carro3.modelo+"\nAno: "+carro3.ano);
    }
}
