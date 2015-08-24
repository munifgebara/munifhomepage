package br.com.munif.munif.services;

import br.com.munif.munif.model.Artigo;
import br.com.munif.munif.repositories.ArtigoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author munif
 */
@Service(value = "ArtigoService")
public class ArtigoService {

    private final ArtigoRepository artigoRepository;

    @Autowired
    public ArtigoService(ArtigoRepository repository) {
        System.out.println("Iniciando " + this.getClass().getSimpleName());
        this.artigoRepository = repository;
    }

    public List<Artigo> list() {
        return artigoRepository.findAll();
    }

    public Artigo findById(String id) {
        return artigoRepository.findOne(id);
    }

    public void save(Artigo artigo) {
        artigoRepository.save(artigo);
    }

    public void deleteById(String id) {
        artigoRepository.delete(id);
    }

    public void deleteAll() {
        artigoRepository.deleteAll();
    }

    public Artigo findByTitulo(String titulo) {
        return artigoRepository.findByTitulo(titulo);
    }

}
