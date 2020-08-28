package classes;

import teste.professor;

public class exercicio {
    public static void main(String[] args) {
        professor dados = new professor();

        dados.nome = "Erick Fernandes";
        dados.matricula = "2019876543";
        dados.rg = "4356770987";
        dados.cpf = "123.546.099-66";

        professor dados2 = new professor();
        dados2.nome = "Kim";
        dados2.matricula = "003359";
        dados2.rg = "4335654";
        dados2.cpf = "712.989.033-78";

        //dados = dados2;

        System.out.println("Nome: "+ dados.nome);
        System.out.println("Matrícula: "+ dados.matricula);
        System.out.println("RG: "+ dados.rg);
        System.out.println("CPF: "+ dados.cpf);

        System.out.println("-----------------------------------------------");

        System.out.println("Nome: "+ dados2.nome);
        System.out.println("Matrícula: "+ dados2.matricula);
        System.out.println("RG: "+ dados2.rg);
        System.out.println("CPF: "+ dados2.cpf);



    }


}