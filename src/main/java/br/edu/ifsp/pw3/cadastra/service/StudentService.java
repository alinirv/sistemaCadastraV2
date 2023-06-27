package br.edu.ifsp.pw3.cadastra.service;

import java.util.List;

import br.edu.ifsp.pw3.cadastra.model.domain.Student;

public interface StudentService {

    void salvar(Student student);

    void editar(Student student);

    void excluir(Long id);

    Student buscarPorId(Long id);

    List<Student> buscarTodos();
    
}
