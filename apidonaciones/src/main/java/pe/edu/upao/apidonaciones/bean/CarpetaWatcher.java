package pe.edu.upao.apidonaciones.bean;

import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.TimeUnit;

public class CarpetaWatcher {
	 private final Path carpeta;

	    public CarpetaWatcher(Path carpeta) {
	        this.carpeta = carpeta;
	    }

	    public void iniciarWatcher() throws IOException {
	        WatchService watchService = FileSystems.getDefault().newWatchService();
	        carpeta.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);

	        Thread thread = new Thread(() -> {
	            while (true) {
	                WatchKey key;
	                try {
	                    key = watchService.poll(10, TimeUnit.SECONDS);
	                } catch (InterruptedException e) {
	                    return;
	                }

	                if (key == null) {
	                    continue;
	                }

	                for (WatchEvent<?> event : key.pollEvents()) {
	                    if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
	                        System.out.println("Carpeta actualizada. Se ha creado un nuevo archivo.");
	                        // Realiza la lógica de refresco de la carpeta aquí
	                    }
	                }

	                key.reset();
	            }
	        });

	        thread.setDaemon(true);
	        thread.start();
	    }
}
