public class aula09_controleDeFluxo_if_else_elseIf {
	public static void main(String[] args){
		int idade = 17;
		String categoria;
		
		 if (idade < 15) {
			 categoria = "categoria infantil";
			
		}else if(idade >= 15 && idade < 18){
			categoria = "categoria juvenil";
			
		}else{
			categoria = "categoria adulto";
		}
		 System.out.println(categoria);
		 
		 int idade_abilitacao = 18;
		 
		 if (idade_abilitacao >= 18) {
			 System.out.println("Voc� ja pode tirar sua abilita��o");
			
		} else {
			System.out.println("Voc� n�o pode tirar sua abilita��o");
			
		}
		 
		
	}

}
