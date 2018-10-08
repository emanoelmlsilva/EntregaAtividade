package franquia;

public class SanduicheCG implements Sanduiche{
	
	Pao_Frances paoF;
	Queijo_Prato queijoP;
	Presunto_DeFrango presuntoF;
	Salada_ComVerdura saladaC;
	
	public SanduicheCG() {
		paoF = new Pao_Frances();
		queijoP = new Queijo_Prato();
		presuntoF = new Presunto_DeFrango();
		saladaC = new Salada_ComVerdura();
	}

}
