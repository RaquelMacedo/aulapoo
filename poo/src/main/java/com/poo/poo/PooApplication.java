package com.poo.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.poo.classes.Aluno;
import com.poo.poo.classes.Veiculo;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);
		
		Aluno aluno1 = new Aluno();
		System.out.println("A matricula do aluno " + aluno1.getNome() + " é: ");
		System.out.println(aluno1.getMatricula());

		Aluno aluno2 = new Aluno();
		System.out.println("A matricula do aluno " + aluno2.getNome() + " é: ");
		System.out.println(aluno2.getMatricula());

	}
}
