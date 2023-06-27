package br.edu.ifsp.pw3.cadastra.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ifsp.pw3.cadastra.model.dao.StudentDao;
import br.edu.ifsp.pw3.cadastra.model.domain.Student;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Student student) {
        dao.save(student);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Student student) {
        dao.update(student);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Student buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Student> buscarTodos() {
        return dao.findAll();
    }
    
}
