package metodos.classes;

import metodos.testes.treino2;

public class base {
    public static void main(String[] args){
        treino2 basico = new treino2();
        basico.name = "Erick";
        basico.second_name = "Fernandes";
        basico.age = 19;

        treino2 function = new treino2();
        function.somador();
        function.peaple();

        System.out.println("Nome: "+ basico.name);
        System.out.println("Segundo nome: "+ basico.second_name);
        System.out.println("Idade: "+ basico.age);



    }
    
}