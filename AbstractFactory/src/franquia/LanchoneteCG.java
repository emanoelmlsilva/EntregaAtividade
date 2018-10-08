package franquia;

public class LanchoneteCG extends Lanchonete{	
	
	@Override
	public void pedirSanduiche() {
		Sanduiche sanduiche = FabricaCG.getInstancia().montarSand();	
		
	}

}
