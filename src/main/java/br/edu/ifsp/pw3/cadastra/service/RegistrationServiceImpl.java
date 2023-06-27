package br.edu.ifsp.pw3.cadastra.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ifsp.pw3.cadastra.model.dao.RegistrationDao;
import br.edu.ifsp.pw3.cadastra.model.domain.Registration;

import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService{
    @Autowired
    private RegistrationDao dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Registration registration) {
        dao.save(registration);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Registration registration) {
        dao.update(registration);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long idStudent) {
        dao.delete(idStudent);
    }

    @Transactional(readOnly = true)
    @Override
    public Registration buscarPorId(Long idStudent) {
        return dao.findById(idStudent);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Registration> buscarTodos() {
        return dao.findAll();
    }
}
