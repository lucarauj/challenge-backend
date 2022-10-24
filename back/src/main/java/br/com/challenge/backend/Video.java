package br.com.challenge.backend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="videos")
public class Video {
	
	@Id
	private String id;
	private String titulo;
	private String description;
	private String url;
	
	public Video() {
		
	}
	
	public Video(String titulo, String description, String url) {
		this.titulo = titulo;
		this.description = description;
		this.url = url;
	}
	
	public String getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDescription() {
		return description;
	}
	public String getUrl() {
		return url;
	}
}
