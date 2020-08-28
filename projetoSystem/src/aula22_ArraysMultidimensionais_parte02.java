public class aula22_ArraysMultidimensionais_parte02 {
	public static void mai(String[] args){
		// tipos de arrays:
		int[] arrint = {1, 2, 3};
		int[] arrint2 = new int[3];
		int[] arrint3 = new int[] {1, 2, 3};
		
		int [][] dias = new int [3][];
		dias[0] = new int[2];
		dias[1] = new int[] {3, 2, 1};
		dias[2] = new int[5];
		
		for (int[] arr : dias) {
			for(int num : arr) {
				System.out.println(num);
			}
			
		}
		
	}

}

