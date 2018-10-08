package sequencia_ordenada;

public class Cliente {
	
	public static Ordenador ordena;
	
	public int[] ordenar(int[] vetor) {
		return ordena.ordenado(vetor);
	}
	
	public void setOrdenaBubbleSort() {
		ordena = OrdenadorBubble.getInstancia();
	}
	
	public void setOrdenaInsertionSort() {
		ordena = OrdenadorInsertion.getInstancia();
	}
	
	public void setOrdenaMergeSort() {
		ordena = OrdenadorMerge.getInstancia();
	}
	
	public void setOrdenaQuickSort() {
		ordena = OrdenadorQuick.getInstancia();
	}
	
}
