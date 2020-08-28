public class exercicio03 {
	public static void main(String[] args){
		/***
		 * crie uma variável  salario e imprima seu imposto
		 * imposto:
		 * salario < 1000 --> 5% .
		 * salario >= 1000 && salario < 2000 --> 10%.
		 * salario >= 2000 && salario < 4000 --> 15%.
		 * salario > 5000 --> 20%
		 * 
		 * 
		 */
		int salario = 900;
		String imposto;
		
		if(salario < 1000){
			imposto = "5%";
			
		}else if(salario >= 1000 && salario < 2000){
			imposto = "10%";
			
		}else if(salario >= 2000 && salario < 3000){
			imposto = "15%";
			
		}else{
			imposto = "20%";
		}
		System.out.println("Seu imposto é de "+imposto);
	}

}
