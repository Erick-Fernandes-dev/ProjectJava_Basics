public class revisao03 {
	public static void main(String[] args){
		System.out.println("Seja bem vindo, vamos começar a jogar");
		String nome = "Erick";
		int idade = 14;
		System.out.println("Bom seu nome é "+nome+ " E você tem "+ idade+" anos");
		
		int idadeParaTrabalho = idade;
		String categoria;
		if (idadeParaTrabalho <= 14) {
			categoria = "não está apto a trabalhar ainda"; 
			
		}else if (idadeParaTrabalho >= 15 && idadeParaTrabalho < 18) {
			categoria = "jovem aprendiz";
			
			
		}else{
			categoria = "Trabalhando num empresa Grande";
			
		}
		System.out.println(nome + " voce Trabalha? "+ categoria);
		
		
		String[] nome1 = new String[4];
		nome1[0] = "Broly";
		nome1[1] = "Kenpachi";
		nome1[2] = "Sasuske";
		nome1[3] = "Eren";
		
		for (int i = 0; i < nome1.length; i++){
			System.out.println(nome1[i]);
		
			
		}
		int contador = 0;
		while (contador < nome1.length){
			System.out.println(nome1[contador]);
			contador++;
			
			
			
			
			
			
			
			
			
			
			
		}
	}

}

