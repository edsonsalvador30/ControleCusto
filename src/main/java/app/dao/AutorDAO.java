package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("AutorDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AutorDAO extends JpaRepository<Autor, java.lang.String> {

  /**
   * Obtém a instância de Autor utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Autor entity WHERE entity.id = :id")
  public Autor findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Autor utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Autor entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Autor entity WHERE entity.email like concat('%',coalesce(:search,''),'%') OR entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<Autor> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Autor entity WHERE (:email is null OR entity.email like concat('%',:email,'%')) AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<Autor> specificSearch(@Param(value="email") java.lang.String email, @Param(value="nome") java.lang.String nome, Pageable pageable);
  
}
