package br.edu.ifsp.pw3.cadastra.model.dao;

import java.util.List;

import br.edu.ifsp.pw3.cadastra.model.domain.Registration;

public interface RegistrationDao {
    void save(Registration registration);
    void update(Registration registration);
    void delete(Long id);

    Registration findById(Long idStudent);

    List<Registration> findAll();
}
