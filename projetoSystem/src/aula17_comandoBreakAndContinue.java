public class aula17_comandoBreakAndContinue {
	public static void main(String[] args){
		/***
		 * Dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
		 * porém as parcelas não podem ser menores do que 1000
		 */
		double valorTotal = 30000;
		for(int parcelas = 1; parcelas >= 1000; parcelas++){
			double valorParcela = valorTotal / parcelas;
			if(valorParcela >= 1000){
				System.out.println("parcela "+parcelas+" R$ " + valorParcela);
			
			}else{
				System.out.println("saindo do laço");
				break;
			}
			System.out.println("fora do laço");
			
		}
	}

}
