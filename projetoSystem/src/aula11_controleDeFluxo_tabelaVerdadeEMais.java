public class aula11_controleDeFluxo_tabelaVerdadeEMais {
	public static void main(String[] args){
		/***
		 * operador tenario -> � uma forma de vc inicializar uma variavel,
		 * utilizando uma instru��o em uma linha s�
		 */
		/***
		int idade = 20;
		String status;
		if (idade < 18) {
			status = "nao adulto";
			
		} else {
			status = "adulto";

		}
		System.out.println(status);
	*/
		int idade = 20;
		String status;
		status = idade < 18 ? "nao adulto" : "adulto" ;
		System.out.println(status);
		
		int caminhada = 1200;
		String capacidade;
		
		String boasVindas = "Seja bem vindo";
		String nome = "Erick Fernandes";
		System.out.println(boasVindas+" "+nome);
		
		// obs: os operadores tenarios ajudam muito, por�m, n�o se deve utilizar operador tenario
		// dentro de outro operador tenario, pois, fica uma leitura um pouco complicada de se interpretar.
		//                                  TRUE                        FALSE
		capacidade = caminhada < 1500 ? "Continue caminhando": "Pare para descan�ar" ;
		System.out.println(capacidade);
		
	}
	

}
