public class revisao {
	public static void main(String[] args){
		String nome = "Erick";
		System.out.println("Seja muito bem vindo "+nome);
		
		int num1 = 2;
		int num2 = 4;
		int num3 = 10;
		
		int exprecao = num1 * num2 + num3 - (num1 / 10);
		
		System.out.println("A expreção é "+(exprecao));
		if (exprecao > 10) {
			System.out.println("Parabens");
			
			
		}else {
			System.out.println("Erro");
		}
		String nome1 = "Erick";
		String lugar = "Sitio maciel";
		String trabalho = "Não trabalho";
		String instituicao = "Universidade";
		String curso = "lcc";
		
		System.out.println("seu nome é "+nome1+" mora no "+lugar+",\nvc trabalha? "+trabalho+" faz "+instituicao+" faz o curso "+curso);
		
	}

}
