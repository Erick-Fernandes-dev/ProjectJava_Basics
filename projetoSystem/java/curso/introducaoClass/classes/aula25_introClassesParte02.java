package classes;
import teste.carro;

public class aula25_introClassesParte02{
    public static void main(String[] ards){
        carro automovel = new carro();

        automovel.marca = "Ferrari";
        automovel.placa = "23f45";
        automovel.velocidade = 140.33f;

        System.out.println("Sua marca: "+ automovel.marca);
        System.out.println("Sua placa: "+ automovel.placa);
        System.out.println("Sua velocidade: "+ automovel.velocidade);




    }
}