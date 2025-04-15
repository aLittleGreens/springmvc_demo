package com.it.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;

import java.io.File;
import java.io.IOException;

@Controller
public class FileController {


    @RequestMapping("fileParam")
    @ResponseBody
    public String fileParam(MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            File file1 = new File("text.txt");
            file.transferTo(file1);
        }

        return "fileParam";
    }
}
