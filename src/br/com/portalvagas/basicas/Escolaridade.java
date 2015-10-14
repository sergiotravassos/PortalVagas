/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.basicas;

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
@Table(name = "Escolaridade")
public class Escolaridade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "escolaridade_id")
    private int id;

    @Column(name = "desc_escolaridade", length = 200, nullable = false)
    private String descEscolaridade;

    /**
     * @return the id
     */
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
     * @return the descEscolaridade
     */
    public String getDescEscolaridade() {
        return descEscolaridade;
    }

    /**
     * @param descEscolaridade the descEscolaridade to set
     */
    public void setDescEscolaridade(String descEscolaridade) {
        this.descEscolaridade = descEscolaridade;
    }
}
