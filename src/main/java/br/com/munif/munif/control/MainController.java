package br.com.munif.munif.control;

import br.com.munif.munif.model.Artigo;
import br.com.munif.munif.services.ArtigoService;
import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author munif
 */
@Controller
@DependsOn(value = "ArtigoService")
public class MainController {

    @Autowired
    private ArtigoService artigoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        if (artigoService != null) {
            request.setAttribute("artigos", artigoService.list());
        } else {
            request.setAttribute("artigos", Arrays.asList(new Artigo[]{
                new Artigo("Sem Mongo", "Sem Mongo", "Sem mongo0"),
                new Artigo("Sem Mongo", "Sem Mongo", "Sem mongo1"),
                new Artigo("Sem Mongo", "Sem Mongo", "Sem mongo2"),
                new Artigo("Sem Mongo", "Sem Mongo", "Sem mongo3")
            }));
        }
        return "principal.jsp";
    }

}
