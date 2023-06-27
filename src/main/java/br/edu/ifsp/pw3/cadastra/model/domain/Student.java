package br.edu.ifsp.pw3.cadastra.model.domain;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class Student {

    @Id
    @Column(name = "idStudent", nullable = false, unique = true)
    private Long idStudent;

    @Column(name = "nameStudent", nullable = false)
    private String nameStudent;

    @DateTimeFormat(iso = ISO.DATE)
    @Column(name = "dateBirthStudent", nullable = false, columnDefinition = "DATE")
    private LocalDate dateBirthStudent;

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public LocalDate getDateBirthStudent() {
        return dateBirthStudent;
    }

    public void setDateBirthStudent(LocalDate dateBirthStudent) {
        this.dateBirthStudent = dateBirthStudent;
    }

    @Override
    public String toString() {
        return "Student [idStudent=" + idStudent + ", nameStudent=" + nameStudent + ", dateBirthStudent="
                + dateBirthStudent + "]";
    }
}
