package com.example.demoimgupload1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class ImgData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String type;
    private String imgData;

    public ImgData() {
    }

    public ImgData(String name, String type, String imgData) {
        this.name = name;
        this.type = type;
        this.imgData = imgData;
    }
}
