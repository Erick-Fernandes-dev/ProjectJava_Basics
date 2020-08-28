public class aula07_operadoresDeAtribuicao {
	public static void main(String[] args){
		// =, -=, +=, /=, *=, %=
		
		int salario = 1000;
		int salario1 = 2000;
		int salario2 = 3000;
		int salario3 = 4000;
		int salario4 = 5000;
		
		//salario = salario + 1000
		
		salario += 1000;
		salario1 -= 1000;
		salario2 *= 1000;
		salario3 /= 1000;
		salario4 %= 1000;
		
		System.out.println(salario);
		System.out.println(salario1);
		System.out.println(salario2);
		System.out.println(salario3);
		System.out.println(salario4);
	}

}
