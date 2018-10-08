package sequencia_ordenada;

public class OrdenadorBubble implements Ordenador{

	private static OrdenadorBubble instancia = null;
	
	@Override
	public int[] ordenado(int[] vetor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static OrdenadorBubble getInstancia() {
		if(instancia == null) {
			instancia = new OrdenadorBubble();
		}
		return instancia;
	}

}
