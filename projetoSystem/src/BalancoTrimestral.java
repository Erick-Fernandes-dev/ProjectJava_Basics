public class BalancoTrimestral {
	public static void main(String[] args){
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		
		System.out.println("O gasto trimestral foi de "+gastoTrimestre);
		
		System.out.println("A m�dia mensal � de "+(gastoTrimestre / 3));
	}

}
