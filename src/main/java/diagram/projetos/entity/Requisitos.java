package diagram.projetos.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela REQUISITOS
 * @generated
 */
@Entity
@Table(name = "\"REQUISITOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.projetos.entity.Requisitos")
public class Requisitos implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "Nome", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "Cliente", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cliente;

  /**
  * @generated
  */
  @Column(name = "Projeto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String projeto;

  /**
   * Construtor
   * @generated
   */
  public Requisitos(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Requisitos setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Requisitos setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém cliente
   * return cliente
   * @generated
   */
  
  public java.lang.String getCliente(){
    return this.cliente;
  }

  /**
   * Define cliente
   * @param cliente cliente
   * @generated
   */
  public Requisitos setCliente(java.lang.String cliente){
    this.cliente = cliente;
    return this;
  }

  /**
   * Obtém projeto
   * return projeto
   * @generated
   */
  
  public java.lang.String getProjeto(){
    return this.projeto;
  }

  /**
   * Define projeto
   * @param projeto projeto
   * @generated
   */
  public Requisitos setProjeto(java.lang.String projeto){
    this.projeto = projeto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Requisitos object = (Requisitos)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
