package com.copitovalidator.QrValidateInput;
import com.copitovalidator.controllers.ValidateController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.copitovalidator"})
public class QrValidateInputApplication {

	public static void main(String[] args) {
		SpringApplication.run(QrValidateInputApplication.class, args);
	}

}
