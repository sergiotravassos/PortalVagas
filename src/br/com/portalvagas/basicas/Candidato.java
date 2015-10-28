/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalvagas.basicas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author felipePC
 */
@Entity
@Table(name = "candidato", catalog = "portalvagas", schema = "")
@NamedQueries({
    @NamedQuery(name = "Candidato.findAll", query = "SELECT c FROM Candidato c"),
    @NamedQuery(name = "Candidato.findByCandidatoId", query = "SELECT c FROM Candidato c WHERE c.candidatoId = :candidatoId"),
    @NamedQuery(name = "Candidato.findByCep", query = "SELECT c FROM Candidato c WHERE c.cep = :cep"),
    @NamedQuery(name = "Candidato.findByCidade", query = "SELECT c FROM Candidato c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "Candidato.findByDataNascimento", query = "SELECT c FROM Candidato c WHERE c.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "Candidato.findByEmail", query = "SELECT c FROM Candidato c WHERE c.email = :email"),
    @NamedQuery(name = "Candidato.findByEndereco", query = "SELECT c FROM Candidato c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Candidato.findByLogin", query = "SELECT c FROM Candidato c WHERE c.login = :login"),
    @NamedQuery(name = "Candidato.findByNome", query = "SELECT c FROM Candidato c WHERE c.nome = :nome"),
    @NamedQuery(name = "Candidato.findByNomeAnexo", query = "SELECT c FROM Candidato c WHERE c.nomeAnexo = :nomeAnexo"),
    @NamedQuery(name = "Candidato.findBySenha", query = "SELECT c FROM Candidato c WHERE c.senha = :senha"),
    @NamedQuery(name = "Candidato.findByTelefone", query = "SELECT c FROM Candidato c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Candidato.findByUf", query = "SELECT c FROM Candidato c WHERE c.uf = :uf")})
public class Candidato implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "candidato_id")
    private Integer candidatoId;
    @Basic(optional = false)
    @Lob
    @Column(name = "anexo")
    private byte[] anexo;
    @Basic(optional = false)
    @Column(name = "cep")
    private int cep;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "nomeAnexo")
    private String nomeAnexo;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Basic(optional = false)
    @Column(name = "telefone")
    private int telefone;
    @Basic(optional = false)
    @Column(name = "uf")
    private String uf;

    public Candidato() {
    }

    public Candidato(Integer candidatoId) {
        this.candidatoId = candidatoId;
    }

    public Candidato(Integer candidatoId, byte[] anexo, int cep, String cidade, Date dataNascimento, String email, String endereco, String login, String nome, String nomeAnexo, String senha, int telefone, String uf) {
        this.candidatoId = candidatoId;
        this.anexo = anexo;
        this.cep = cep;
        this.cidade = cidade;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.endereco = endereco;
        this.login = login;
        this.nome = nome;
        this.nomeAnexo = nomeAnexo;
        this.senha = senha;
        this.telefone = telefone;
        this.uf = uf;
    }

    public Integer getCandidatoId() {
        return candidatoId;
    }

    public void setCandidatoId(Integer candidatoId) {
        this.candidatoId = candidatoId;
    }

    public byte[] getAnexo() {
        return anexo;
    }

    public void setAnexo(byte[] anexo) {
        byte[] oldAnexo = this.anexo;
        this.anexo = anexo;
        changeSupport.firePropertyChange("anexo", oldAnexo, anexo);
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        int oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        Date oldDataNascimento = this.dataNascimento;
        this.dataNascimento = dataNascimento;
        changeSupport.firePropertyChange("dataNascimento", oldDataNascimento, dataNascimento);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        String oldLogin = this.login;
        this.login = login;
        changeSupport.firePropertyChange("login", oldLogin, login);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getNomeAnexo() {
        return nomeAnexo;
    }

    public void setNomeAnexo(String nomeAnexo) {
        String oldNomeAnexo = this.nomeAnexo;
        this.nomeAnexo = nomeAnexo;
        changeSupport.firePropertyChange("nomeAnexo", oldNomeAnexo, nomeAnexo);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        int oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        String oldUf = this.uf;
        this.uf = uf;
        changeSupport.firePropertyChange("uf", oldUf, uf);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (candidatoId != null ? candidatoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Candidato)) {
            return false;
        }
        Candidato other = (Candidato) object;
        if ((this.candidatoId == null && other.candidatoId != null) || (this.candidatoId != null && !this.candidatoId.equals(other.candidatoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.portalvagas.gui.Candidato[ candidatoId=" + candidatoId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
