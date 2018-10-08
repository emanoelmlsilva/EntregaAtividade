package sequencia_ordenada;

public class OrdenadorQuick implements Ordenador{
	
	private static OrdenadorQuick instancia = null;

	@Override
	public int[] ordenado(int[] vetor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static OrdenadorQuick getInstancia() {
		if(instancia == null) {
			instancia = new OrdenadorQuick();
		}
		
		return instancia;
	}

}
