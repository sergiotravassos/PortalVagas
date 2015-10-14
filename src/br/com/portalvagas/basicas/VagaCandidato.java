/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.basicas;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sergiotravassos
 */
@Entity
@Table(name = "VagaCandidato")
public class VagaCandidato {

    //corrigir este atributo e gerar get e set
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidato_id",
            insertable = true, updatable = true)
    private Candidato idCandidato;

    @Column(name = "data_candidatura", length = 50, nullable = false)
    private Date dataCandidatura;

    @Column(name = "status_vaga", length = 100, nullable = false)
    private boolean statusVaga;

    /**
     * @return the dataCandidatura
     */
    public Date getDataCandidatura() {
        return dataCandidatura;
    }

    /**
     * @param dataCandidatura the dataCandidatura to set
     */
    public void setDataCandidatura(Date dataCandidatura) {
        this.dataCandidatura = dataCandidatura;
    }

    /**
     * @return the statusVaga
     */
    public boolean isStatusVaga() {
        return statusVaga;
    }

    /**
     * @param statusVaga the statusVaga to set
     */
    public void setStatusVaga(boolean statusVaga) {
        this.statusVaga = statusVaga;
    }

}
