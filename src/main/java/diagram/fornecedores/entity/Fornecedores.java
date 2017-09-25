package diagram.fornecedores.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FORNECEDORES
 * @generated
 */
@Entity
@Table(name = "\"FORNECEDORES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.fornecedores.entity.Fornecedores")
public class Fornecedores implements Serializable {

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
  @Column(name = "endereco", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String endereco;

  /**
  * @generated
  */
  @Column(name = "telefone", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String telefone;

  /**
  * @generated
  */
  @Column(name = "estado", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String estado;

  /**
  * @generated
  */
  @Column(name = "Cidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cidade;

  /**
   * Construtor
   * @generated
   */
  public Fornecedores(){
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
  public Fornecedores setId(java.lang.String id){
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
  public Fornecedores setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém endereco
   * return endereco
   * @generated
   */
  
  public java.lang.String getEndereco(){
    return this.endereco;
  }

  /**
   * Define endereco
   * @param endereco endereco
   * @generated
   */
  public Fornecedores setEndereco(java.lang.String endereco){
    this.endereco = endereco;
    return this;
  }

  /**
   * Obtém telefone
   * return telefone
   * @generated
   */
  
  public java.lang.String getTelefone(){
    return this.telefone;
  }

  /**
   * Define telefone
   * @param telefone telefone
   * @generated
   */
  public Fornecedores setTelefone(java.lang.String telefone){
    this.telefone = telefone;
    return this;
  }

  /**
   * Obtém estado
   * return estado
   * @generated
   */
  
  public java.lang.String getEstado(){
    return this.estado;
  }

  /**
   * Define estado
   * @param estado estado
   * @generated
   */
  public Fornecedores setEstado(java.lang.String estado){
    this.estado = estado;
    return this;
  }

  /**
   * Obtém cidade
   * return cidade
   * @generated
   */
  
  public java.lang.String getCidade(){
    return this.cidade;
  }

  /**
   * Define cidade
   * @param cidade cidade
   * @generated
   */
  public Fornecedores setCidade(java.lang.String cidade){
    this.cidade = cidade;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Fornecedores object = (Fornecedores)obj;
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
