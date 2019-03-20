package br.edu.univas.main;

public class ClientePessoaJuridica extends Cliente {

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
				"\nCNPJ: " + cnpj;
	}
}
