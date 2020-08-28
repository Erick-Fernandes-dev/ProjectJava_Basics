public class aula20_arrays_parte3_foreach {
	public static void main(String[] args){
		int[] number = new int[5];
		int[] number2 = {1, 2, 3, 4, 5};//uma das formas de montar uma array. Tam = 5, index = 0 ate 4
		int[] numero3 = new int[]{1, 2, 3, 4, 5};
		
		for (int i = 0; i < number2.length; i++) {
			System.out.println(number2[i]);
			
			}
		for (int num : number2){//foreach
			//essa variável vai representar cada uma das posições de uma array;
			System.out.println(num);
		}
		int num = 0;
		
		
		
		
		
		
	}

}
