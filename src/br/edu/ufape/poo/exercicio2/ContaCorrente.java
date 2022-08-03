package br.edu.ufape.poo.exercicio2;

public class ContaCorrente extends Conta{
	private float tarifa;
	private float limiteCredito;
	private float saldoNegativo;
	
	public ContaCorrente(String id, float saldo) {
		super(id, saldo);
	}
	public boolean debitar(float valor) {
		saldoNegativo = getSaldo() - valor;
		if(getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			return true;
		} else if (this.limiteCredito >= saldoNegativo) {
			setSaldo(0);
			this.limiteCredito += saldoNegativo;
			return true;
		}
		return false;
	}
	public void acrescentarLimite(float valor) {
		this.limiteCredito += valor;
	}
	public boolean pagamento(float valor, String codigo) {
		this.debitar(valor);
		return true;
	}
	
}
