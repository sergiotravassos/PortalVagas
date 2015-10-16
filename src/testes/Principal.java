/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.testes;

import br.com.portalvagas.basicas.Candidato;
import br.com.portalvagas.dados.SimpleEntityManager;
import br.com.portalvagas.services.CandidatoServices;
import br.com.portalvagas.services.EmpresaServices;
import java.util.GregorianCalendar;

/**
 *
 * @author Caio Ernandes
 */
public class Principal {

    public static void main(String[] args) {
        String persistenceUnitName = "PortalVagas";

        SimpleEntityManager simpleEntityManager = new SimpleEntityManager(persistenceUnitName);

        CandidatoServices candidatoService = new CandidatoServices(simpleEntityManager);
        //EmpresaServices empresaServices = new EmpresaServices(simpleEntityManager);
        
        Candidato c = new Candidato();

        c.setNome("Caio");
        c.setDataNascimento(new GregorianCalendar(1995,02,11));
        c.getEndereco().setLogradouro("Rua de caio");
        c.getEndereco().setBairro("ur-11");
        c.getEndereco().setCep("5423456");
        c.getEndereco().setCidade("jaboatão");
        c.getEndereco().setEstado("PE");
        c.getEndereco().setNumero(85);
        c.getEndereco().setPais("Brasil");
        c.setEmail("caio@gmail.com");
        c.setAnexo(null);
        c.setNomeAnexo("caio-curriculo.doc");
        c.setLogin("caioernandes");
        c.setSenha("senhadecaio");
        
        candidatoService.save(c);

        for(Candidato candidatoLista : candidatoService.findAll()) {
            System.out.println(candidatoLista.getId() + " - " + candidatoLista.getNome());
        }
        
        simpleEntityManager.close();
    }
}
