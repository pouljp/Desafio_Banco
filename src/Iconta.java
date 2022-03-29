
public interface Iconta {

	void sacar(double valor) ;
		
	void depositar(double valor);
		
	void transferir(double valor, Conta ContaDestino);
		
	void pre_Aprovado(double valor, Conta ContaDestino);
	
	void imprimirExtrato();


	void limite(int valor, Conta contaDestino);
	
}
