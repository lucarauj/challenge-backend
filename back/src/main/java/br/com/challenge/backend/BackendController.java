package br.com.challenge.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {
	@Autowired
	private VideoRepository repositorio;
	
	@GetMapping("/video")
	public List<Video> obterVideos() {
		List<Video> videos = repositorio.findAll();
		return videos;
	}
	
	@PostMapping("/video")
	public Video cadastrarVideo(@RequestBody Video video) {
		Video videoSalvo = repositorio.save(video);
		return videoSalvo;
	}
	
	

}
