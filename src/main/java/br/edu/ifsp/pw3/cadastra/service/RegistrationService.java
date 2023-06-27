package br.edu.ifsp.pw3.cadastra.service;

import java.util.List;

import br.edu.ifsp.pw3.cadastra.model.domain.Registration;

public interface RegistrationService {
        void salvar(Registration registration);

    void editar(Registration registration);

    void excluir(Long idStudent);

    Registration buscarPorId(Long idStudent);

    List<Registration> buscarTodos();
    
}
