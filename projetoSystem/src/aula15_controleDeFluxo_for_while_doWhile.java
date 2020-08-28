public class aula15_controleDeFluxo_for_while_doWhile {
	public static void main(String[] args){
		int contador = 11;
		while(contador <= 10){
			System.out.println(contador);//(contador++) ou (++contador)
			contador++;
			
		}
		do {
			System.out.println("Entrou no while");
			
		} while (contador < 10);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("O valor de i é: "+i);
		}
	}

}
