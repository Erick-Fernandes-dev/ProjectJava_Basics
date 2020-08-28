package classes;

import teste.aula24_introducaoClass;


public class estudante {
    public static void main(String[] args) {
        aula24_introducaoClass pessoa = new aula24_introducaoClass();

        pessoa.nome = "Erick";
        pessoa.idade = 19;
        pessoa.matricula = "1212";

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.matricula);

    }

}

