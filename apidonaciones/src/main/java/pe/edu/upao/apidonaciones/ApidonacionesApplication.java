package pe.edu.upao.apidonaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import pe.edu.upao.apidonaciones.bean.CarpetaWatcher;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class ApidonacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApidonacionesApplication.class, args);
	}

	public static void main( String[] args ) throws IOException
	{
		Path carpeta = Paths.get("src/main/resources/static/imagenes");

		CarpetaWatcher watcher = new CarpetaWatcher(carpeta);
		watcher.iniciarWatcher();
		SpringApplication.run(ApidonacionesApplication.class, args);

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ApidonacionesApplication.class);
	}

}
