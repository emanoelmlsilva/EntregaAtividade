package franquia;

public class SanduicheJP implements Sanduiche{

	Pao_Bola paoB;
	Queijo_Mussarela queijoM;
	Presunto_DeFrango presuntoF;
	Salada_SemVerdura saladaS;
	
	public SanduicheJP() {
		paoB = new Pao_Bola();
		queijoM = new Queijo_Mussarela();
		presuntoF = new Presunto_DeFrango();
		saladaS = new Salada_SemVerdura();
	}

}
