package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);		
		System.out.println("Conteúdos Inscritos Camila : " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Camila : " + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Camila : " + devCamila.getConteudosConcluidos());
		System.out.println("XP : " + devCamila.calcularTotalXp());
		
		System.out.println("____________\\______________");
		
		Dev devPaulo = new Dev();
		devPaulo.setNome("Paulo");
		devPaulo.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Paulo : " + devPaulo.getConteudosInscritos());
		devPaulo.progredir();
		devPaulo.progredir();
		devPaulo.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Paulo : " + devPaulo.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Paulo : " + devPaulo.getConteudosConcluidos());
		System.out.println("XP : " + devPaulo.calcularTotalXp());
	}

}
