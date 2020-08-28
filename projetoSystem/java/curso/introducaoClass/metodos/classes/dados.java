package metodos.classes;

import metodos.testes.treinamento;

public class dados{
    public static void main(String[] args){
        treinamento sobre = new treinamento();
        
        sobre.nome = "Erick";
        sobre.idade = 19;
        sobre.cidade = "Guarabira";
        sobre.endereco = "sitio maciel";
        sobre.peso = 80f;

        treinamento about = new treinamento();
        about.condicao();
        about.arrays();
        about.arrays();


    }
}