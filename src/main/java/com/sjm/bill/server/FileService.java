package com.sjm.bill.server;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    String upLoadImage(MultipartFile multipartFile);
}
