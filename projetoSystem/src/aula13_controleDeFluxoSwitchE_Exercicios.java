public class aula13_controleDeFluxoSwitchE_Exercicios {
	public static void main(String[] args){
		byte dia = 9;
		switch(dia){
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda");
			break;
		case 3:
			System.out.println("ter�a");
			break;
		case 4:
			System.out.println("quarta");
			break;
		case 5:
			System.out.println("quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;
		case 7:
			System.out.println("sabado");
			break;
		default:
			System.out.println("Option invality");
		}
		
		char sexo = 'F';
		switch(sexo){
		case 'F':
			System.out.println("Feminino");
			break;
		case 'M':
			System.out.println("Masculino");
			break;
		default://caso n�o seja nenhuma dessas op��es o default � essencial para esse tipo de 
				//ocorrencia.
			System.out.println("Op��o inv�lida");
			
		
		}
		
		
	}

}
