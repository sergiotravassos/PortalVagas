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
@Table(name = "Experiencia")
public class Experiencia {
    	
        private int id;

	private Date dataInicio;

	private Date dataTermino;

	private Candidato idCandidato;

	private String nomeEmpresa;

	private String resumoExp;

    /**
     * @return the id
     */
    @Id
    @Column(name = "experienciaId")
    @GeneratedValue   
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the dataInicio
     */
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataTermino
     */
    public Date getDataTermino() {
        return dataTermino;
    }

    /**
     * @param dataTermino the dataTermino to set
     */
    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    /**
     * @return the idCandidato
     */
    public Candidato getIdCandidato() {
        return idCandidato;
    }

    /**
     * @param idCandidato the idCandidato to set
     */
    public void setIdCandidato(Candidato idCandidato) {
        this.idCandidato = idCandidato;
    }

    /**
     * @return the nomeEmpresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * @param nomeEmpresa the nomeEmpresa to set
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * @return the resumoExp
     */
    public String getResumoExp() {
        return resumoExp;
    }

    /**
     * @param resumoExp the resumoExp to set
     */
    public void setResumoExp(String resumoExp) {
        this.resumoExp = resumoExp;
    }
}
