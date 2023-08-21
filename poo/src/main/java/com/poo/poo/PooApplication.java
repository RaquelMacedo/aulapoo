package com.poo.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);
veiculo carroDoArthur = new veiculo();
carroDoArtur.proprietario="Arthur";
carroDoArthur.renavam="12345678";
carroDoArthur.marca="Porshe";
carroDoArthur.modelo="cayenne";
carroDoArthur.ano=2023;
carroDoArthur.cor="branco";
carroDoArthur.quilometagem=5000;
System.out.println(carroDoArthur.proprietario);






	}

}
