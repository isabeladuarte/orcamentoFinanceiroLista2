package orcamentopessoal;

public class Data {

	private int dia;
	private MesesDoAno numMes;
	private int ano;

	public Data(int dia, MesesDoAno numMes, int ano) {
		super();
		this.dia = dia;
		this.numMes = numMes;
		this.ano = ano;
		
		System.out.println("Dia do vencimento: " + this.dia);
		System.out.println("Mês: " + this.numMes);
		System.out.println("Ano: " + this.ano);
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}

	public MesesDoAno getNumMes() {
		return numMes;
	}

	public void setNumMes(MesesDoAno numMes) {
		this.numMes = numMes;
	}
	
	
}
