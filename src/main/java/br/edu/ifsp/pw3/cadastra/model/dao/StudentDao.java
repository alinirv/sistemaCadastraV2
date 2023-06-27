package br.edu.ifsp.pw3.cadastra.model.dao;
import java.util.List;
import br.edu.ifsp.pw3.cadastra.model.domain.Student;

public interface StudentDao {
    void save(Student student);
    void update(Student student);
    void delete(Long id);

    Student findById(Long id);

    List<Student> findAll();
}
