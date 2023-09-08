package com.yuhe.spid.web.test;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

@RestController
public class UploadFileTestController {
    @PostMapping("/uploadFileTest")
    public HashMap<String, String> uploadFileTest(HttpServletRequest request) throws Exception {
        HashMap<String, String> result = new HashMap<>();

        String contentType = request.getContentType();
        int contentLength = request.getContentLength();
        if (!ServletFileUpload.isMultipartContent(request)) {
            result.put("error", "请求ContentType为" + contentType + "，不包含multipart/form-data");
            return result;
        }
        if (contentLength > 10485760) {
            result.put("error", "文件长度" + contentLength + "大于10485760（10M）");
            return result;
        }

        String pathName = "/GitRepository/yuhe/spid/temp/spid/upload";
        File uploadDir = new File(pathName);
        if (!uploadDir.isDirectory()) {
            if (!uploadDir.mkdirs()) {
                result.put("error", "创建目录失败");
                return result;
            }
        }

        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setRepository(uploadDir);

        ServletFileUpload upload = new ServletFileUpload(factory);
        upload.setHeaderEncoding("UTF-8");
        List<FileItem> items = upload.parseRequest(request);

        for (FileItem item : items) {
            String fileName = item.getName();
            String fileExtName = StringUtils.getFilenameExtension(fileName);
            if (fileExtName == null || !".jpg.jpeg.pdf.exe".contains(fileExtName)) {
                result.put("error", "上传文件扩展名是不允许的扩展名：" + fileExtName + "格式");
                return result;
            }
            String newFileName = new Random().nextInt(1000) + "_" + fileName;
            File uploadedFile = new File(pathName, newFileName);
            item.write(uploadedFile);

            result.put("FileUrl", uploadedFile.getAbsolutePath());
        }

        return result;
    }
}
