package franquia;

public class LanchoneteRT extends Lanchonete{

	public FabricaRT fabricaRT;
	
	@Override
	public void pedirSanduiche() {		
		Sanduiche sanduiche = FabricaRT.getInstancia().montarSand(); 
	}

}
