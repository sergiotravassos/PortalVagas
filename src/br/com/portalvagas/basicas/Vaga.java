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
@Table(name = "Vaga")
public class Vaga {

    private int id;

    private Date dataDaVaga;

    private int status;

    private String tituloVaga;

    private String descricao;

    private String duracaoContrato;

    private String localVaga;

    private double salario;

    private String escolaridadeRequerida;

    private String categoria;

    /**
     * @return the id
     */
    @Id
    @Column(name = "vagaId")
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
     * @return the dataDaVaga
     */
    public Date getDataDaVaga() {
        return dataDaVaga;
    }

    /**
     * @param dataDaVaga the dataDaVaga to set
     */
    public void setDataDaVaga(Date dataDaVaga) {
        this.dataDaVaga = dataDaVaga;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the tituloVaga
     */
    public String getTituloVaga() {
        return tituloVaga;
    }

    /**
     * @param tituloVaga the tituloVaga to set
     */
    public void setTituloVaga(String tituloVaga) {
        this.tituloVaga = tituloVaga;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the duracaoContrato
     */
    public String getDuracaoContrato() {
        return duracaoContrato;
    }

    /**
     * @param duracaoContrato the duracaoContrato to set
     */
    public void setDuracaoContrato(String duracaoContrato) {
        this.duracaoContrato = duracaoContrato;
    }

    /**
     * @return the localVaga
     */
    public String getLocalVaga() {
        return localVaga;
    }

    /**
     * @param localVaga the localVaga to set
     */
    public void setLocalVaga(String localVaga) {
        this.localVaga = localVaga;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the escolaridadeRequerida
     */
    public String getEscolaridadeRequerida() {
        return escolaridadeRequerida;
    }

    /**
     * @param escolaridadeRequerida the escolaridadeRequerida to set
     */
    public void setEscolaridadeRequerida(String escolaridadeRequerida) {
        this.escolaridadeRequerida = escolaridadeRequerida;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
