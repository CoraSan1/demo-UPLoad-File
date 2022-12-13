package com.example.demoimgupload1.service;


import com.example.demoimgupload1.model.ImgData;
import com.example.demoimgupload1.repository.StorageRepo;
import com.example.demoimgupload1.util.ImgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class StorageService {
    @Autowired
    private StorageRepo repository;

//    public String uploadImage(MultipartFile file) throws IOException {
//
//        ImgData imageData = repository.save(new ImgData(file.getOriginalFilename(), file.getContentType(), file.getBytes()));
//        if (imageData != null) {
//            return "file uploaded successfully : " + file.getOriginalFilename();
//        }
//        return null;
//    }

//    public byte[] downloadImage(String fileName){
//        Optional<ImgData> dbImageData = repository.findByName(fileName);
//        byte[] images=ImgUtils.decompressImg(dbImageData.get().getImgData());
//        return images;
//    }
}
