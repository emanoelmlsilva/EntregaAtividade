package sequencia_ordenada;

public class OrdenadorMerge implements Ordenador{

	private static OrdenadorMerge instancia = null;
	
	@Override
	public int[] ordenado(int[] vetor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static OrdenadorMerge getInstancia() {
		if(instancia == null) {
			instancia = new OrdenadorMerge();
		}
		return instancia;
	}

}
