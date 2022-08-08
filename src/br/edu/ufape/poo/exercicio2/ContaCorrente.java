package br.edu.ufape.poo.exercicio2;



public class ContaCorrente extends Conta{
	private float tarifa;
	private float limiteCredito;
	private float saldoNegativo;
	
	public ContaCorrente(String id, float saldo) {
		super(id, saldo);
		this.tarifa = 0.02f;
	}
	
	public boolean debitar(float valor) {
		saldoNegativo = getSaldo() - valor;
		if(getSaldo() >= valor || this.limiteCredito >= Math.abs(saldoNegativo)) {
			setSaldo(getSaldo() - valor);
			registrarMovimentacao(new RegistroOperacao("Debitar", valor));
			return true;
		} 
		return false;
	}
	
	public void acrescentarLimite(float valor) {
		this.limiteCredito += valor;
	}
	
	public boolean pagamento(float valor, String codigo) {
		if(this.debitar(valor)) {
			registrarMovimentacao(new RegistroOperacao("Pagamento", valor));
			return true; 
			}
		return false;
	}
	
	public void tarifa(float saldo, float tarifa) {
		saldo = saldo*tarifa;
	}
	
}
