package br.com.dio.exemplo.dominio;

public class Curso extends Conteudo {
	private int cargaHoraria;//Encapsulado	
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "CURSO T�TULO : " + getTitulo() + "  DESCRI��O : " + getDescricao() + "    CARGAHOR�RIA : " + cargaHoraria + "]";
	}

}
