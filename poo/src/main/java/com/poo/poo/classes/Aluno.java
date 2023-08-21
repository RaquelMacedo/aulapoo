package com.poo.poo.classes;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int anoDeNascimento; 
    private int matricula;

    private static int contador = 1111;

    public Aluno () {
        //Nome
        System.out.println("Escreva o nome do aluno: ");
        Scanner sc = new Scanner(System.in);
        setNome(sc.nextLine());

        //Nascimento
        System.out.println("Qual o ano de nascimento do aluno? ");
        Scanner sc2 = new Scanner(System.in);
        setAnoDeNascimento(sc2.nextInt());

        // Matricula
        this.setMatricula(contador);
        contador++;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }
    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
