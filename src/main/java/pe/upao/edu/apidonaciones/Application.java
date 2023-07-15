package pe.upao.edu.apidonaciones;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import pe.upao.edu.apidonaciones.bean.CarpetaWatcher;



@SpringBootApplication(scanBasePackages = { "pe.upao.edu.apidonaciones" })
public class Application  extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer {

    public static void main(String[] args) throws IOException {
        Path carpeta = Paths.get("src/main/resources/static/imagenes");

        CarpetaWatcher watcher = new CarpetaWatcher(carpeta);
        watcher.iniciarWatcher();
        SpringApplication.run(Application.class, args);

    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

}
