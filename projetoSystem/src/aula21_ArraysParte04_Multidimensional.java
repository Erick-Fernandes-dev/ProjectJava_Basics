public class aula21_ArraysParte04_Multidimensional {
	public static void main(String[] args) {
		int [][] dias = new int [2][2];
		dias[0][0] = 20;
		dias[0][1] = 21;
		dias[1][0] = 30;
		dias[1][1] = 31;
		
		for(int i = 0; i<dias.length; i++){
			System.out.println(dias[i]);
			for(int j = 0; j<dias[i].length; j++){
				System.out.println(dias[i][j]);
			}
		}
		
		System.out.println("====================================="  );
		
		for(int[] ref : dias){
			for(int dia : ref){
				System.out.println(dia);
				
			}
		}
		

	}

}
