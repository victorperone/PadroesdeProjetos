package mediator;

public class TestaMediator {

	public static void main(String[] args) {
		TorreMediator mediator = new TorreMediator();
		
		AviaoVoando colleagueVoando = new AviaoVoando(mediator);
		AviaoPista colleagueSolo = new AviaoPista(mediator);
		
		mediator.adicionarColleague(colleagueVoando);
		mediator.adicionarColleague(colleagueSolo);
		
		colleagueVoando.enviarMensagem("O tempo está bom!!");
		colleagueSolo.enviarMensagem("Cuidado!!! A pista esta molhada");

	}

}
