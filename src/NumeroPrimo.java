
public class NumeroPrimo {

	public static String verifica(int numero) {
		
		String primo = "É um número primo!";
		String naoPrimo = "Não é um número primo!";
		
		if(numero != 2 && numero % 2 == 0 || numero == 1){
			return naoPrimo;
		}else{
			return primo;
		}
	}

}
