package observer;

public class ObserverTest{
	
	public static void main(String[] args){
		
		Customer customer1 = new Customer();
		customer1.setCustomerName("Maria");
		Customer customer2 = new Customer();
		customer2.setCustomerName("Francisco");
		
		
		//Produto criado e estoque zerado
		Product iphone = new Product();
		iphone.setNomeProduto("Apple iphone");
		iphone.setDisponibilidade(false);
		
		//Apos estoque zerado os clientes se registram
		iphone.registraObservador(customer1);
		iphone.registraObservador(customer2);
		
		// iphone disponível
		
		iphone.setDisponibilidade(true);
	}

}