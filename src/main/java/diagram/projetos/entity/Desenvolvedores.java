package diagram.projetos.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela DESENVOLVEDORES
 * @generated
 */
@Entity
@Table(name = "\"DESENVOLVEDORES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.projetos.entity.Desenvolvedores")
public class Desenvolvedores implements Serializable {

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
  @Column(name = "nome", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "Linguagem", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String linguagem;

  /**
  * @generated
  */
  @Column(name = "Projeto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String projeto;

  /**
   * Construtor
   * @generated
   */
  public Desenvolvedores(){
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
  public Desenvolvedores setId(java.lang.String id){
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
  public Desenvolvedores setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém linguagem
   * return linguagem
   * @generated
   */
  
  public java.lang.String getLinguagem(){
    return this.linguagem;
  }

  /**
   * Define linguagem
   * @param linguagem linguagem
   * @generated
   */
  public Desenvolvedores setLinguagem(java.lang.String linguagem){
    this.linguagem = linguagem;
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
  public Desenvolvedores setProjeto(java.lang.String projeto){
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
    Desenvolvedores object = (Desenvolvedores)obj;
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
