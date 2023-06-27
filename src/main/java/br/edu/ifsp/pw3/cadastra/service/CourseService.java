package br.edu.ifsp.pw3.cadastra.service;

import java.util.List;

import br.edu.ifsp.pw3.cadastra.model.domain.Course;

public interface CourseService {

    void salvar(Course course);

    void editar(Course course);

    void excluir(Long id);

    Course buscarPorId(Long id);

    List<Course> buscarTodos();
    
}
