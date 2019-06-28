package mediator;

public class AviaoVoando extends Colleague{

	public AviaoVoando(Mediator m) {
		super(m);
		
	}
	
	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Aviao Voando Recebeu " + mensagem);
		
	}
	
}
