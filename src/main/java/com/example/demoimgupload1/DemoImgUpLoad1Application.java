package com.example.demoimgupload1;

import com.example.demoimgupload1.model.ImgData;
import com.example.demoimgupload1.repository.StorageRepo;
import com.example.demoimgupload1.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
@RestController
@RequestMapping("/image")
public class DemoImgUpLoad1Application {

    @Autowired
    StorageService storageService;

    @Autowired
    StorageRepo storageRepo;

    @PostMapping
    public ResponseEntity<?> uploadImg (@RequestParam("image") MultipartFile file) throws IOException {
        String name = file.getOriginalFilename();
        FileCopyUtils.copy(file.getBytes(), new File("F:\\JavaWeb\\demoJavaAPI\\img\\" + name));
        ImgData imgData = new ImgData("dinh", "dinh", name);
        storageRepo.save(imgData);
        return ResponseEntity.status(HttpStatus.OK).body(name);
    }

//    @GetMapping("/{fileName}")
//    public ResponseEntity<?> downLoadImg(@PathVariable String fileName){
////        byte[] imgData = storageService.downloadImage(fileName);
////        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("img/png")).body(imgData);
//    }

    public static void main(String[] args) {
        SpringApplication.run(DemoImgUpLoad1Application.class, args);
    }

}
