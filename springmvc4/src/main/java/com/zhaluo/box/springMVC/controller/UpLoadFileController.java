package com.zhaluo.box.springMVC.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/upload")
public class UpLoadFileController {

    @RequestMapping(value = "/uploadimage", method = RequestMethod.POST)
    public String uploadImage(MultipartFile file) {

        try {
            FileUtils.writeByteArrayToFile(new File("C:/upload/" + file.getOriginalFilename()), file.getBytes());
            return "index";
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("========文件流异常=========");
            return "error";
        }
    }
}
