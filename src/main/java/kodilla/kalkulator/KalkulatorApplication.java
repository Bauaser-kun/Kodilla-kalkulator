package kodilla.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

	public static void main(String[] args) {

		SpringApplication.run(KalkulatorApplication.class, args);
		substracting(256, 98.68);
		adding(654, 298);
	}

	public static void substracting (double a, double b){
		return a-b;
	}

	public static void adding (double a, double b){
		return a+b;
	}
}
