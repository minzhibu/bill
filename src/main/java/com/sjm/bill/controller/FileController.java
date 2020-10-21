package com.sjm.bill.controller;

import com.sjm.bill.server.FileService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
@RequestMapping("/upload")
public class FileController {

    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping("/image")
    public @ResponseBody String UploadImage(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        return fileService.upLoadImage(multipartFile);
    }

    @RequestMapping(value = "/image/{imageName}",produces = {MediaType.IMAGE_JPEG_VALUE,MediaType.IMAGE_PNG_VALUE,MediaType.IMAGE_GIF_VALUE})
    public @ResponseBody byte[] getImage(@PathVariable("imageName") String imageName){
        FileInputStream inputStream = null;
        byte[] bytes = new byte[0];
        try{
            String imagePath = "F:\\images\\"+ imageName;
            File file = new File(imagePath);
            System.out.println(imagePath);
            inputStream = new FileInputStream(file);
            bytes = new byte[inputStream.available()];
            inputStream.read(bytes,0,inputStream.available());
        }catch(Exception e){
            e.getStackTrace();
        }finally{
            if(inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return bytes;
    }
}
