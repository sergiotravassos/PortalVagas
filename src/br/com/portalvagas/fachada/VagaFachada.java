/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.fachada;

import br.com.portalvagas.basicas.Vaga;
import br.com.portalvagas.negocio.VagaNegocio;

/**
 *
 * @author Caio Ernandes
 */
public class VagaFachada {

    public void inserirVaga(Vaga vaga) throws Exception {
        VagaNegocio vn = new VagaNegocio();
        vn.save(vaga);
    }

    public void atualizarVaga(Vaga vaga) throws Exception {
        VagaNegocio vn = new VagaNegocio();
        vn.update(vaga);
    }

    public void deletarVaga(Vaga vaga) throws Exception {
        VagaNegocio vn = new VagaNegocio();
        vn.delete(vaga);
    }
}
