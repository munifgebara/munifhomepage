package br.com.munif.munif.control;

import br.com.munif.munif.model.Artigo;
import br.com.munif.munif.services.ArtigoService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/artigo")
public class ArtigosAPI {

    @Autowired
    private ArtigoService artigoService;

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public Artigo newInstance() {
        return new Artigo();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Artigo> listAll() {
        return artigoService.list();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Artigo read(@PathVariable String id) {
        return artigoService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Artigo save(@RequestBody Artigo artigo) {
        artigoService.save(artigo);
        return artigo;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Artigo update(@RequestBody Artigo artigo) {
        artigoService.save(artigo);
        return artigo;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable String id) {
        artigoService.deleteById(id);
        return "OK";
    }

}
