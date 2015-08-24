package br.com.munif.munif.seed;

import br.com.munif.munif.model.Artigo;
import br.com.munif.munif.repositories.ArtigoRepository;
import br.com.munif.munif.services.ArtigoService;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Seed implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ArtigoService artigoService;

    private AtomicBoolean started = new AtomicBoolean(false);

    public Seed() {
        System.out.println("Iniciando "+this.getClass().getSimpleName());
    }
    
    

    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (started.get()) {
            return;
        }
        started.set(true);
        System.out.println("INICIO SEED");
        insereArtigos();
        System.out.println("FIM SEED");

    }

    private void insereArtigos() {
        artigoService.deleteAll();
        try{
        artigoService.save(new Artigo("Primeiro Artigo","Java", BLABLABLA));
        Thread.sleep(50);
        artigoService.save(new Artigo("Segundo Artigo","JavaScript", BLABLABLA));
        Thread.sleep(50);
        artigoService.save(new Artigo("Terceiro Artigo","Arduino", BLABLABLA));
        Thread.sleep(50);
        artigoService.save(new Artigo("Quarto Artigo","Robótica", BLABLABLA));
        Thread.sleep(50);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }

    public static final String BLABLABLA = ""
            + "<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam metus, congue \n"
            + "vel suscipit ut, dignissim non risus. Vestibulum ante est, fringilla nec placerat \n"
            + "eu, vestibulum vitae diam. Integer eget egestas eros. Duis enim erat, mollis quis \n"
            + "lacinia eget, blandit nec ipsum. Donec vitae turpis ipsum. Aliquam mauris libero, \n"
            + "sagittis in eleifend at, mattis imperdiet velit. Donec urna risus, rutrum molestie \n"
            + "varius ac, lacinia sit amet augue. Nam ultrices elementum eros.</p>\n"
            + "<p>Sed faucibus viverra ligula, non varius magna semper vitae. Donec eu justo ut ipsum \n"
            + "hendrerit congue nec eu risus. Cum sociis natoque penatibus et magnis dis parturient \n"
            + "montes, nascetur ridiculus mus. Lorem ipsum dolor sit amet, consectetur adipiscing \n"
            + "egestas tempus. Cras convallis odio sit amet risus convallis porttitor. Integer \n"
            + "vehicula fermentum ligula at pretium. Suspendisse semper iaculis eros, eu aliquam \n"
            + "justo imperdiet vel. Proin nec dictum mi. Duis commodo enim non tellus interdum \n"
            + "elit. Suspendisse fermentum adipiscing nisi, a tempor libero malesuada at. Morbi \n"
            + "lacinia dui adipiscing risus eleifend tincidunt. Proin eu mauris eu tellus eleifend \n"
            + "hendrerit.</p>\n"
            + "<p>Mauris sit amet tellus urna. In facilisis, tortor vitae ultricies egestas, odio \n"
            + "mi rhoncus arcu, quis euismod felis felis et velit. Mauris varius consectetur erat \n"
            + "egestas tempus. Cras convallis odio sit amet risus convallis porttitor. Integer \n"
            + "vehicula fermentum ligula at pretium. Suspendisse semper iaculis eros, eu aliquam \n"
            + "justo imperdiet vel. Proin nec dictum mi. Duis commodo enim non tellus interdum \n"
            + "iaculis. Phasellus ultrices diam sit amet orci lacinia sed consequat dui auctor.</p> 							\n"
            + "<p>Sed faucibus viverra ligula, non varius magna semper vitae. Donec eu justo ut ipsum \n"
            + "hendrerit congue nec eu risus. Cum sociis natoque penatibus et magnis dis parturient \n"
            + "montes, nascetur ridiculus mus. Lorem ipsum dolor sit amet, consectetur adipiscing \n"
            + "egestas tempus. Cras convallis odio sit amet risus convallis porttitor. Integer \n"
            + "vehicula fermentum ligula at pretium. Suspendisse semper iaculis eros, eu aliquam \n"
            + "justo imperdiet vel. Proin nec dictum mi. Duis commodo enim non tellus interdum \n"
            + "elit. Suspendisse fermentum adipiscing nisi, a tempor libero malesuada at. Morbi \n"
            + "lacinia dui adipiscing risus eleifend tincidunt. Proin eu mauris eu tellus eleifend \n"
            + "hendrerit.</p>\n"
            + "<p>Mauris sit amet tellus urna. In facilisis, tortor vitae ultricies egestas, odio \n"
            + "mi rhoncus arcu, quis euismod felis felis et velit. Mauris varius consectetur erat \n"
            + "egestas tempus. Cras convallis odio sit amet risus convallis porttitor. Integer \n"
            + "vehicula fermentum ligula at pretium. Suspendisse semper iaculis eros, eu aliquam \n"
            + "justo imperdiet vel. Proin nec dictum mi. Duis commodo enim non tellus interdum \n"
            + "iaculis. Phasellus ultrices diam sit amet orci lacinia sed consequat dui auctor.</p>\n";

}
