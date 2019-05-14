package br.edu.univas.vo;

public class ContaCorrente extends Conta {

	private float taxaManutencao;
	private int chequeEspecial;
	
	public ContaCorrente(int numero, Cliente cliente, 
			float taxaManutencao, int chequeEspecial) {
		super(numero, cliente);
		this.taxaManutencao = taxaManutencao;
		this.chequeEspecial = chequeEspecial;
	}

	@Override
	public boolean sacar(float valor) {
		if(valor <= getSaldo() + chequeEspecial) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}

	@Override
	public boolean depositar(float valor) {
		setSaldo(getSaldo() + valor);
		return true;
	}

	@Override
	public boolean transferenciaeEletronica(Conta contaDestino, float valor) {
		if(valor <= getSaldo() + chequeEspecial) {
			setSaldo(getSaldo() - valor);
			contaDestino.setSaldo(contaDestino.getSaldo() + valor);
			return true;
		}
		return false;
	}

	@Override
	public void atualizarSaldo() {
		setSaldo(getSaldo() - taxaManutencao);
	}

	public float getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(float taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public int getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(int chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

}
