package sequencia_ordenada;

public class OrdenadorInsertion implements Ordenador{

	private static OrdenadorInsertion instancia = null;
	
	@Override
	public int[] ordenado(int[] vetor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static OrdenadorInsertion getInstancia() {
		if(instancia == null) {
			instancia = new OrdenadorInsertion();
		}
		return instancia;
	}

}
