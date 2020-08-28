package metodos.testes;

public class treinamento {
    public String nome;
    public String endereco;
    public String cidade;
    public int idade;
    public double peso;

    public void condicao(){
        int idade = 19;
        String categoria;

        if (idade < 12) {
            categoria = "criança";

        } else if (idade > 12 && idade < 18) {
            categoria = "Adolescente";


        }else{
            categoria = "Adulto";

        }
        System.out.println(categoria);
    }
    public void contador(){
        int cont = 0;
        int dias = 20;

        while (cont <= dias) {
            cont++;
            System.out.println(cont);

        }

    }
    public void arrays(){
        String[][] nomes = new String [2][2];

        nomes[0][0] = "Erick";
        nomes[0][1] = "Santos";

        nomes[1][0] = "Jose";
        nomes[1][1] = "Edinaldo";

        for (String[] arr : nomes) {
            for (String name : arr) {
                System.out.println(name);

            }
        }
    }


}