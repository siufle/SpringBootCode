package com.xq.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {

    @GetMapping("form_layouts")
    public String formLayouts() {
        return "form/form_layouts";
    }

    @PostMapping("upload")
    public String upload(String email, String username, MultipartFile headerImg, MultipartFile[] photos) throws IOException {
        if(headerImg != null) {
            String originalFilename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File("D://upload//" + originalFilename));
        }
        if(photos.length > 0) {
            for (MultipartFile photo : photos) {
                String originalFilename = photo.getOriginalFilename();
                photo.transferTo(new File("D://upload//" + originalFilename));
            }
        }
        return "main";
    }
}
