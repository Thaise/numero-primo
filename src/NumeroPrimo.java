
public class NumeroPrimo {

	public static String verifica(int numero) {
		
		String primo = "� um n�mero primo!";
		String naoPrimo = "N�o � um n�mero primo!";
		
		if(numero != 2 && numero % 2 == 0 || numero == 1){
			return naoPrimo;
		}else{
			return primo;
		}
	}

}
