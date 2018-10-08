package franquia;

public class FabricaJP implements Fabrica{

	private static FabricaJP instancia = null;
	
	public Sanduiche montarSand() {
		return new SanduicheJP();
	}
	
	public static FabricaJP getInstancia() {
		if(instancia == null) {
			instancia = new FabricaJP();
		}
		return instancia;
	}
}
