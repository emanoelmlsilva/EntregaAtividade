package franquia;

public class SanduicheRT implements Sanduiche{

	Pao_Integral paoI;
	Queijo_Cheddar queijoC;
	Presunto_DePeru presuntoP;
	Salada_ComVerdura saladaC;
	
	public SanduicheRT() {
		paoI = new Pao_Integral();
		queijoC = new Queijo_Cheddar();
		presuntoP = new Presunto_DePeru();
		saladaC = new Salada_ComVerdura();
	}
}
