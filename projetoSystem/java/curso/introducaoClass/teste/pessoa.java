package teste;

import teste.treino;


public class pessoa {
    public static void main(String[] args){
        treino alguem = new treino();

        alguem.nome = "Erick";
        alguem.endereco = "8903";
        alguem.idade = 18;
        alguem.peso = 89.9;

        System.out.println("Seu nome é : " + alguem.nome);
        System.out.println("Seu endereço é : " + alguem.endereco);
        System.out.println("Sua idade é : " + alguem.idade);
        System.out.println("Seu peso é : " + alguem.peso);

    }

}