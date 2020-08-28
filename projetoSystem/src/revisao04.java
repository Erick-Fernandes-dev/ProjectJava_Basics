
public class revisao04 {
	public static void main(String[] args){
		String nome = "Erick";
		int idade = 19;
		float peso = 80.5f;
		
		char genero = 'M';
		
		String sexo = "";
		
		switch(genero){
		case 'F':
			sexo = "Feminino";
			break;
		case 'M':
			sexo = "Masculino";
			break;
		default:
			System.out.println("Ouve algum erro");
			
		System.out.println("Seu sexo é"+sexo);
			
		
		}
		System.out.println("Nome: "+nome+"\nIdade: "+idade+"\npeso: "+peso+"\nSexo: "+sexo);
		
		if (peso >= 80){
			System.out.println("Precisa fazer algum tipo de dieta");
			
		}else if(peso < 80 && peso >= 40){
			System.out.println("Seu peso está balanceado");
			
		}else{
			System.out.println("Você preisa angordar mais um pouquinho;");
			
			
			
			
			
			
			
			
			
		}
		
		
	}

}
