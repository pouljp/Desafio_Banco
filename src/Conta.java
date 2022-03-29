
public class Conta implements Iconta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected  int numero;
	protected double saldo;
	protected double limite;
	protected double pre_aprovado;
	protected  Cliente cliente;
	
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;

	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		/* saldo = saldo + valor;*/

		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	@Override
	public void pre_Aprovado(double valor, Conta ContaDestino) {

		
	}
	@Override
	public void limite(int valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		limite-=valor;
	}
			
	public void sacar() {
		
	}
	public void depositar() {
		
	}
	public void transferir() {
		
	}
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {

		System.out.println(String.format("Titula: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("limite: %.2f", this.limite));
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}
	

}