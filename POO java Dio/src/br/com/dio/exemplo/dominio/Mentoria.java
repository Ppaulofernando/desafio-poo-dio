package br.com.dio.exemplo.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;//Encapsulado	
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Mentoria [TÍTULO : " + getTitulo() + "   DESCRIÇÃO : " + getDescricao() + "  DATA : " + data + "]";
	}
	
	
	

}
