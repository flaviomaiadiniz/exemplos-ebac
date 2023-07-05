package br.com.flavio;

public class Cliente {

	private String gradeRequest;
	private boolean contratoEmpresa;
	
	public Cliente (String gradeRequest, boolean contratoEmpresa) {
		this.gradeRequest=gradeRequest;
		this.contratoEmpresa=contratoEmpresa;
	}
	
	public String getgradeRequest() {
		return gradeRequest;
	}
	public boolean contratoEmpresa(){
		return contratoEmpresa;
	}
}
