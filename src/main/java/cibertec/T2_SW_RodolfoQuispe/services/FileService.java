package cibertec.T2_SW_RodolfoQuispe.services;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;

@Service
public class FileService implements IFileService {

    private final Path pathFolder = Paths.get("uploads");

    @Override
    public void guardarArchivo(MultipartFile archivo) throws Exception {
        Files.copy(archivo.getInputStream(),
                this.pathFolder.resolve(archivo.getOriginalFilename()));
    }

    @Override
    public void guardarArchivos(List<MultipartFile> archivosList) throws Exception {
        for(MultipartFile archivo : archivosList){
            this.guardarArchivo(archivo);
        }
    }
}