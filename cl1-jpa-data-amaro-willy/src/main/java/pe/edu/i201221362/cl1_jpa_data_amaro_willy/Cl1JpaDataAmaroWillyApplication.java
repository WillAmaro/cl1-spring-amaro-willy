package pe.edu.i201221362.cl1_jpa_data_amaro_willy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i201221362.cl1_jpa_data_amaro_willy.entity.country;
import pe.edu.i201221362.cl1_jpa_data_amaro_willy.repository.CountryRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataAmaroWillyApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataAmaroWillyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Optional<country> country = countryRepository.findById("ARG");
//		country.ifPresentOrElse(
//				c -> c.getLanguages().forEach(l -> System.out.println(l.getLanguage())),
//				() -> System.out.println("No se encontraron idiomas para ARG, mostrando para PER.")
//		);


//		List<String> countryIds = Arrays.asList("COL", "ARG");
//		countryRepository.deleteAllById(countryIds);
	}




}
