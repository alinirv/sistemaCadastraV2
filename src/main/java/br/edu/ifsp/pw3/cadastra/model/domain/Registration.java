package br.edu.ifsp.pw3.cadastra.model.domain;
import jakarta.persistence.*;

@Entity
@Table(name = "registros")
public class Registration extends AbstractEntity<Long>{
    @Column(name = "idStudent", nullable = false, unique = true)
    private Integer idStudent;

    @Column(name = "idCourse", nullable = false)
    private Integer idCourse;

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }
}
