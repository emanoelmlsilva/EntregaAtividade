package franquia;

public class FabricaRT implements Fabrica{
	
	private static FabricaRT instancia = null;
	
	public Sanduiche montarSand() {
		return new SanduicheRT();
	}
	
	public static FabricaRT getInstancia() {
		if(instancia == null) {
			instancia = new FabricaRT();
		}
		return instancia;
	}

}
