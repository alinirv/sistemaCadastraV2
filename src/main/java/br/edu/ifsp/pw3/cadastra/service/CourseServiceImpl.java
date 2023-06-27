package br.edu.ifsp.pw3.cadastra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ifsp.pw3.cadastra.model.dao.CourseDao;
import br.edu.ifsp.pw3.cadastra.model.domain.Course;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDao dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Course course) {
        dao.save(course);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Course course) {
        dao.update(course);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Course buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Course> buscarTodos() {
        return dao.findAll();
    }

}
