package br.edu.univas.vo;

public class ContaPoupanca extends Conta {

	private float taxaJuros;
	
	public ContaPoupanca(int numero, Cliente cliente, float taxaJuros) {
		super(numero, cliente);
		this.taxaJuros = taxaJuros;
	}

	@Override
	public boolean sacar(float valor) {
		if(valor <= getSaldo()) {
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
	public boolean transferenciaEletronica(Conta contaDestino, float valor) {
		if(valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
			
			contaDestino.setSaldo(contaDestino.getSaldo() + valor);
			
			return true;
		}
		return false;
	}

	@Override
	public void atualizarSaldo() {
		setSaldo(getSaldo() + (getSaldo()*taxaJuros / 100));
	}
	
	public float getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
}