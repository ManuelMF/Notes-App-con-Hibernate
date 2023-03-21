package com.example.notes.file;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fil_id")
    private Long id;

    @Column(name = "fil_notaid")
    private Long noteId;
    @Column(name = "fil_nombre")
    private String nombre;
    @Column(name = "fil_tipo")
    private String tipo;

    @Column(name = "fil_data")
    private byte[] data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public String getType() {
        return tipo;
    }

    public void setType(String type) {
        this.tipo = type;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
