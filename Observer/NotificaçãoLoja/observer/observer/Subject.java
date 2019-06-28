package observer;

public interface Subject {

	public void registraObservador(Observer observer);
	public void removeObservador(Observer observer);
	public void notificaObservadores();
	
}
