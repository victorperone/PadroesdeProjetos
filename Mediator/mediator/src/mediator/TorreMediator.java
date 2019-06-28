package mediator;

import java.util.ArrayList;

public class TorreMediator implements Mediator{
	protected ArrayList<Colleague> avioes;
	
	public TorreMediator() {
		avioes = new ArrayList<Colleague>();
		
	}
	
	public void adicionarColleague(Colleague colleague) {
		avioes.add(colleague);
	}
	
	@Override
	public void enviar(String mensagem, Colleague colleague) {
		for (Colleague contato : avioes) {
			if (contato != colleague) {
				definirProtocolo(contato);
				contato.receberMensagem(mensagem);
			}
		}
		
	}
	
	private void definirProtocolo(Colleague contato) {
		if (contato instanceof AviaoPista) {
			System.out.println("Ola, como esta o clima?");
		} else if (contato instanceof AviaoVoando) {
			System.out.println("Ola, a pista esta livre?");
		}
		
	}
	
}
