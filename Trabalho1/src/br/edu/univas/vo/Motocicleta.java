package br.edu.univas.vo;

public class Motocicleta extends Veiculo {

	public Motocicleta(String marca, String modelo, Motor motor) {
		super(marca, modelo, motor);
	}

	@Override
	public void acelerar(int intensidade) {
		Motor motor = getMotor();
		int novaVelocidade = 
				motor.getPotencia() * intensidade 
			  + motor.getVelocidade();
		
		motor.setVelocidade(novaVelocidade);
	}

	@Override
	public void freiar(int intensidade) {
		Motor motor = getMotor();
		int novaVelocidade = 
				motor.getVelocidade() - 
				motor.getPotencia() * intensidade;
		
		motor.setVelocidade(novaVelocidade);		
	}

	@Override
	public void trocaMarcha(int marcha) {
		getMotor().trocaMarcha(marcha);
	}

}
