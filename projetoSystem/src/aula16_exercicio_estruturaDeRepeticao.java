
public class aula16_exercicio_estruturaDeRepeticao {
	public static void main(String[] args){
		int contador = 11;
		while (contador < 10) {
			System.out.println(++contador);
			
		}
		
		contador = 0;
		do{
			System.out.println("Entrou no while" + contador++);
		}while(contador < 10);
		
		for (int i = 0; i < 10; i++){
			System.out.println("o valor do for é: "+i);
			if (i == 5){
				break;
			}
		}
		
		
	}

}
