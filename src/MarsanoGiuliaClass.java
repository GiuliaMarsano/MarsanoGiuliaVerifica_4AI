
/**
 * <b>Produttoria(moltiplicazione di un certo numero di fattori)</b>
 * 
 * classe MarsanoGiuliaClass
 * 
 * @author <b>Marsano Giulia</b> <U>4AI</U> <i>14/03/2024</i>
 *
 */
public class MarsanoGiuliaClass {
	
	/**
	 * costruttore
	 */
	public MarsanoGiuliaClass() {
		
	}
	
	/**
	 * metodo per calcolare una produttoria
	 * 
	 * @param s indice iniziale
	 * @param f indice finale
	 * 
	 * @return valore produttoria
	 */
	public int MarsanoMet(int s,int f) {
		int r=0;
		for(int i=1;i<f;i++) {
			r=r+r;//Errore non trovato
		}
		return r;
	}
	
	/**
	 * 
	 * @param args test di classe
	 */
	public static void main(String[] args) {
		MarsanoGiuliaClass c=new MarsanoGiuliaClass();
		System.out.println("Produttoria: "+c.MarsanoMet(5,7));
	}

}