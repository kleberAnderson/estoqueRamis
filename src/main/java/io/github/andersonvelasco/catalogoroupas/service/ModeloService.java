package io.github.andersonvelasco.catalogoroupas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import io.github.andersonvelasco.catalogoroupas.model.Modelo;
import io.github.andersonvelasco.catalogoroupas.repository.ModeloRepository;

@Service
public class ModeloService {

    @Autowired
    private ModeloRepository repository;

    public List<Modelo> getAllModelos() {
        return repository.findAll(Sort.by("nome").ascending());
    }

    public Modelo getModeloById(Long id) {
        return repository.getReferenceById(id);
    }

    public Modelo getModeloByNome(String nome) {
        return repository.findModeloByNome(nome);
    }

    public Modelo save(Modelo modelo) {
        if(modelo.getNome() == null || modelo.getNome().trim().isEmpty()) {
            return null;
        }
        return repository.save(modelo);
    }

    public void deleteModeloById(Long id) {
        repository.deleteById(id);
    }
}
