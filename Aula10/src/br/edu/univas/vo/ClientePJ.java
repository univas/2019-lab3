package br.edu.univas.vo;

public class ClientePJ extends Cliente {

	private int cnpj;

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nCPNJ: " + this.cnpj;
	}
	
}
