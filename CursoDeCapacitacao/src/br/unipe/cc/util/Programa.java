package br.unipe.cc.util;

import java.util.HashSet;
import java.util.Set;

import br.unipe.cc.modelo.*;

public class Programa {
	public static void main(String[] args) {
		Professor professor = new Professor(1,"Professor1","Especialidade1");
		Set<Aluno> listaDeAlunos = new HashSet<Aluno>();
		
		Curso curso = new Curso(professor, listaDeAlunos,"Ciências da Computação",1);
		
		
		
	}
}
