package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}

	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file, HttpSession session, Model model) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getStorageDescription());

		// get the byte data
		byte[] data = file.getBytes();
		// we have to this file to server.....
		String Path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
				+ File.separator + "image" + File.separator + file.getOriginalFilename();
		System.out.println(Path);
		try {
			FileOutputStream fos = new FileOutputStream(Path);
			fos.write(data);
			fos.close();
			System.out.println("fileUploded");
			model.addAttribute("filename", file.getOriginalFilename());
			model.addAttribute("msg", "Uploded succesfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Uploading Error");
			model.addAttribute("msg", "Uploded Error");

		}

		return "filesuccess";
	}
}
