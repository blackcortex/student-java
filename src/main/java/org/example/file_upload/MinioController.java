package org.example.file_upload;

import lombok.AllArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("minio/")
public class MinioController {

    private final MinioService minioService;


    @PostMapping(value = "/upload",consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public Map<String,String> uploadFile(@RequestPart(value = "file",required = false) MultipartFile files) throws IOException{
        String gKey = minioService.uploadFile(files);
        Map<String,String> result = new HashMap<>();
        result.put("GeneratedKey",gKey);
        return result;
    }

    @GetMapping(path = "/download")
    public ResponseEntity<ByteArrayResource> getFile(@RequestParam(value = "file") String file) throws IOException{
        byte[] data = minioService.getFile(file);
        ByteArrayResource resource = new ByteArrayResource(data);
        return ResponseEntity.ok().contentLength(data.length).header("content-type","application/octet-stream").header("Content-disposition","attachment;filename=\"" + file + "\"").body(resource);
    }

}
