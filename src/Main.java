
public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("Joao");
		int limite = 1000;
		
		Conta cc = new ContaCorrente (joao);
		Conta poupanca = new ContaPoupanca (joao);			

		cc.depositar(100);
		cc.transferir(100,poupanca);		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc.limite(100,cc);
		

	}

}
