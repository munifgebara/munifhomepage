/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.munif.munif.repositories;

import br.com.munif.munif.model.Artigo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author munif
 */
@Component
public interface ArtigoRepository extends MongoRepository<Artigo, String> {

    public Artigo findByTitulo(String lastName);

}
