package br.com.munif.munif.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Bootstrap extends AbstractAnnotationConfigDispatcherServletInitializer {

    public Bootstrap() {
        System.out.println("Iniciando " + this.getClass().getSimpleName());
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ApplicationConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
