package observer;

public class Customer implements Observer{
	
	private String nomeCliente;
	private Subject subject;
	
	public String getCustomerName(){
		return nomeCliente;
	}
	
	public void setCustomerName(String nomeCliente){
		this.nomeCliente = nomeCliente;
	}
	
	public Subject getSubject(){
		return subject;
	}
	
	public void setSubject(Subject subject){
		this.subject = subject;
	}
	
	public void update(String nomeProduto){
		System.out.println("Ola " + nomeCliente + ", " + nomeProduto + " esta disponivel");
	}
	
}
