package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.example.dto.UploadDTO;

@Controller
public class TestController {

	@GetMapping("/uploadForm")
	public String uploadForm() {
		return "uploadForm"; //  /WEB-INF/views/uploadForm.jsp
	}
	
	@PostMapping("/upload")
	public String upload(UploadDTO dto) {
		String theText = dto.getTheText();
		MultipartFile theFile = dto.getTheFile();
		
		//메서드
				long size = theFile.getSize();
				String contentType = theFile.getContentType();
				String name = theFile.getName();
				String originalFilename=theFile.getOriginalFilename();
				
				System.out.println("size:" + size);
				System.out.println("contentType:" + contentType);
				System.out.println("name:" + name);
				System.out.println("originalFilename:" + originalFilename);
		
				//실제 물리적인 파일에 저장
				// 가. 경로 및 파일명 지정
				File f = new File("c:\\upload", originalFilename  );
				
				// 나. 실제로 저장하는 방법
				try {
					theFile.transferTo(f);
				} catch (IllegalStateException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		return "info"; //  /WEB-INF/views/info.jsp
	}
}
