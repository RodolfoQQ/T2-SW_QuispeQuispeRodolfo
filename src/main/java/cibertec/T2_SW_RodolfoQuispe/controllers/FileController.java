package cibertec.T2_SW_RodolfoQuispe.controllers;


import cibertec.T2_SW_RodolfoQuispe.models.dto.ArchivoDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/files")
public class FileController {

    private FileService fileService;

    @PostMapping("")
    public ResponseEntity<ArchivoDto> subirArchivos(
            @RequestParam("files")List<MultipartFile> multipartFileList
    ) throws Exception{
        fileService.guardarArchivos(multipartFileList);
        return new ResponseEntity<>(ArchivoDto.builder()
                .mensaje("Archivos subidos correctamente").build(),
                HttpStatus.OK);
    }



}