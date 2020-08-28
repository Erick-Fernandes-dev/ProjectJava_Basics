public class aula06_operadoreResto_E_operadoresDeComparacoes {
	public static void main(String[] args){
		int numeroInteiro = 20;
		long numeroLong = 200000l;
		double numeroDouble = 10d;
		float numeroFloat = 20f;
		numeroFloat = (float)numeroDouble;
		int resto = 20%2;
		
		System.out.println("Resto da divisão é: "+(resto));
		System.out.println(numeroDouble);
		
		boolean comparacao = 10 > 20;
		boolean comparacao1 = 10 < 20;
		boolean comparacao2 = 10 >= 20;
		boolean comparacao3 = 10 <= 20;
		boolean comparacao4 = 10 == 20;
		boolean comparacao5 = 10 != 20;
		
		System.out.println(comparacao);
		System.out.println(comparacao1);
		System.out.println(comparacao2);
		System.out.println(comparacao3);
		System.out.println(comparacao4);
		System.out.println(comparacao5);
		
	
		System.out.println(numeroLong);
	}

}
