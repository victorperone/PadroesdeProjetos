package observer;

import java.util.*;

public class Product implements Subject{
	
	private String nomeProduto;
	
	private boolean disponivel;
	
	private List<Observer> listOfObservers = new ArrayList<Observer>();
	
	public String getNomeProduto(){
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto){
		this.nomeProduto = nomeProduto;
	}
	
	public boolean estaDisponivel(){
		return disponivel;
	}
	
	public void setDisponibilidade(boolean disponivel){
		this.disponivel = disponivel;
		if(disponivel){
			notificaObservadores();
		}
	}
	
	public List<Observer> getListOfObservers(){
		return listOfObservers;
	}
	
	public void setListOfObservers(List<Observer> listOfObservers){
		this.listOfObservers = listOfObservers;
	}

	public void registraObservador(Observer observer){
		listOfObservers.add(observer);
	}
	public void removeObservador(Observer observer){
		listOfObservers.remove(observer);
	}
	public void notificaObservadores(){
		System.out.println("Notificando todos os observadores!!");
		for (Observer observer : listOfObservers){
			observer.update(nomeProduto);
		}
	}
}