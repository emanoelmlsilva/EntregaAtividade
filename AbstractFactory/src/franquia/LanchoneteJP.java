package franquia;

public class LanchoneteJP extends Lanchonete{

	@Override
	public void pedirSanduiche() {
		Sanduiche sanduiche = FabricaJP.getInstancia().montarSand();		
	}

}
