package franquia;

public class FabricaCG implements Fabrica{

	private static FabricaCG instancia = null; 
	
	@Override
	public Sanduiche montarSand() {
		// TODO Auto-generated method stub
		return new SanduicheCG();
	}
	
	public static FabricaCG getInstancia() {
		if(instancia == null) {
			instancia = new FabricaCG();
		}
		return instancia;
	}

}
