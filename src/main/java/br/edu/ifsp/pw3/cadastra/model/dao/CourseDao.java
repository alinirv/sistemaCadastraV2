package br.edu.ifsp.pw3.cadastra.model.dao;

import java.util.List;

import br.edu.ifsp.pw3.cadastra.model.domain.Course;

public interface CourseDao {
    void save(Course course);
    void update(Course course);
    void delete(Long id);

    Course findById(Long id);

    List<Course> findAll();
}
