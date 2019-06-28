package mediator;

public class AviaoPista extends Colleague{

	public AviaoPista(Mediator m) {
		super(m);
		
	}
	
	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Aviao em solo Recebeu " + mensagem);
		
	}
	
}