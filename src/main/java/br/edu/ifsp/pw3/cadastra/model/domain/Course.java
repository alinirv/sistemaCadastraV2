package br.edu.ifsp.pw3.cadastra.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCourse", nullable = false, unique = true)
    private Long idCourse;

    @Column(name = "nameCourse", nullable = false)
    private String nameCourse;

    @Column(name = "timeCourse", nullable = false)
    private String timeCourse;

    @Column(name = "categoryCourse", nullable = false)
    private String categoryCourse;

    @Column(name = "descriptionCourse", nullable = false)
    private String descriptionCourse;

    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getTimeCourse() {
        return timeCourse;
    }

    public void setTimeCourse(String timeCourse) {
        this.timeCourse = timeCourse;
    }

    public String getCategoryCourse() {
        return categoryCourse;
    }

    public void setCategoryCourse(String categoryCourse) {
        this.categoryCourse = categoryCourse;
    }

    public String getDescriptionCourse() {
        return descriptionCourse;
    }

    public void setDescriptionCourse(String descriptionCourse) {
        this.descriptionCourse = descriptionCourse;
    }

    @Override
    public String toString() {
        return "Course [idCourse=" + idCourse + ", nameCourse=" + nameCourse + ", timeCourse=" + timeCourse + ", categoryCourse=" + categoryCourse
                + ", descriptionCourse=" + descriptionCourse + "]";
    }
}
