package com.example.notes.note;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notes")
public class Note {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "not_codnot")
private Long noteId;

@Column(name = "user_id")
private Long userId;

@Column(name = "not_fechacreacion")
private Instant fechaCreacion;

@Column(name = "not_fechamodificacion")
private Instant fechaModificacion;

@Column(name = "not_nombre")
private String title;

@Column(name = "not_nota")
private String text;

@Column(name = "not_notaVoz")
private boolean isVoiceNote;

@Column(name = "not_public")
private boolean isPublic;

@Column(name = "not_url")
private String url;

@Column(name = "not_categoria")
private String categoria;

	public Long getId() {
		return noteId;
	}

	public void setId(Long id) {
		this.noteId = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Instant getCreatedAt() {
		return fechaCreacion;
	}

	public void setCreatedAt(Instant createdAt) {
		this.fechaCreacion = createdAt;
	}

	public Instant getModifiedAt() {
		return fechaModificacion;
	}

	public void setModifiedAt(Instant modifiedAt) {
		this.fechaModificacion = modifiedAt;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return text;
	}

	public void setBody(String body) {
		this.text = body;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Boolean getIsVoiceNote() {
		return isVoiceNote;
	}

	public void setIsVoiceNote(Boolean isVoiceNote) {
		this.isVoiceNote = isVoiceNote;
	}

	public Boolean getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}
}
