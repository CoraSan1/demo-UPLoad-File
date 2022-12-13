package com.example.demoimgupload1.repository;


import com.example.demoimgupload1.model.ImgData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepo extends JpaRepository<ImgData, Long> {
    Optional<ImgData> findByName(String name);

}
