package br.com.munif.munif.config;

import com.mongodb.Mongo;
import com.mongodb.WriteConcern;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 *
 * @author munif
 */
@EnableMongoRepositories(basePackages = {"br.com.munif.munif.repositories"})
@ComponentScan(basePackages = {"br.com.munif.munif.repositories","br.com.munif.munif.services"})
@Configuration
public class ApplicationConfig extends AbstractMongoConfiguration {

    public ApplicationConfig() {
        System.out.println("Iniciando " + this.getClass().getSimpleName());
    }

    @Override
    protected String getDatabaseName() {
        return "munif";
    }

    @Override
    @Bean
    public Mongo mongo() throws Exception {
        Mongo mongo = new Mongo();
        mongo.setWriteConcern(WriteConcern.SAFE);
        return mongo;
    }

}
