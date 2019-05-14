package br.edu.univas.vo;

public abstract class  Conta {
	
	private int numero;
	private float saldo;
	private Cliente cliente;
	
	public abstract boolean sacar(float valor);
	
	public abstract boolean depositar(float valor);
	
	public abstract boolean transferenciaeEletronica(Conta contaDestino  , float valor);
	
	public abstract void atualizarSaldo ();
	
	public Conta(int numero , Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
