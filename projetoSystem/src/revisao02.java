public class revisao02 {
	public static void main(String[] args){
		String nome = "erick ";
		float peso = 80;
		String endereco = "gba-mcl 54"; 
		int idade = 19;
		System.out.println("seu nome é "+nome+" sua idade é "+idade+" seu peso é de "+peso+"\nseu endereco é "+endereco);
		String faixa_idade;
		
		if (idade >= 15 && idade < 18) {
			faixa_idade = "Adolescente";
			
		}else if(idade <= 12){
			faixa_idade = "criança";
			
		}else{
			faixa_idade = "Adulto";
		}
		System.out.println("você é "+faixa_idade);
		
		int contador = 0;
		while(contador < 10){
			contador++;
			System.out.println(contador);
		}
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
			
		}
		
	
	
	}
	
	
	
	

}
