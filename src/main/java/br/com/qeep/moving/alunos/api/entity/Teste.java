package br.com.qeep.moving.alunos.api.entity;

public class Teste {
	
	private String exemplo;
	private String oQueEuQuiser;
	
	public Teste(String exemplo, String oQueEuQuiser) {
		this.exemplo = exemplo;
		this.oQueEuQuiser = oQueEuQuiser;
	}
	
	public String getExemplo() {
		return exemplo;
	}
	public void setExemplo(String exemplo) {
		this.exemplo = exemplo;
	}
	public String getoQueEuQuiser() {
		return oQueEuQuiser;
	}
	public void setoQueEuQuiser(String oQueEuQuiser) {
		this.oQueEuQuiser = oQueEuQuiser;
	}
	
	
}
