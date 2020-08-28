public class aula19_arrays_parte2 {
	public static void main(String[] args){
		/***
		 * 1 regra --> toda vez que criarmos arrays e preciso criar o tamanho dessa
		 * array.
		 * 
		 * 2 regra --> uma vez criada uma array não pode aumentar, ele
		 * não expancivel, é um valor fixo.
		 */
		// tipos de arrays
		//byte, short, int, long, float, double = 0
		// char --> '\u0000', ''
		//boolean --> false;
		// reference --> nul
		
		int[] idades = new int[2];
		float[] numero = new float[2];
		char[] nome = new char[1];
		boolean[] numero2 = new boolean[2];
		String[] str = new String[1];
		
		
		System.out.println("idade 1: "+ idades[0]);
		System.out.println("idade 2: "+ idades[1]);
		
		System.out.println("numero 1: "+ numero[0]);
		System.out.println("numero 2: "+ numero[1]);
		
		System.out.println("char 1: "+ nome[0]);
		
		System.out.println("boolean 1: "+ numero2[0]);
		System.out.println("boolean 2: "+ numero2[1]);
		
		System.out.println("String 1: "+ str[0]);
		
		String[] nomes = new String[3];
		nomes[0] = "Naruto";
		nomes[1] = "Goku";
		nomes[2] = "Luffy";
		for (int i=0; i < 3; i++){
			System.out.println(nomes[i]);
		
		}
		
		String[] nomes2 = new String[4];
		nomes2[0] = "Ichigo";
		nomes2[1] = "Eren";
		nomes2[2] = "kim";
		nomes2[3] = "Kaiba";
		System.out.println(nomes2.length);// vai contar o tamanho desse array.
		//vai printar os nomes que estão nos indices arrays.
		for (int i = 0; i < nomes2.length; i++){
			System.out.println(nomes2[i]);
		}
	
	}	
	

}
