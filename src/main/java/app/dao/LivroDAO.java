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
@Repository("LivroDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface LivroDAO extends JpaRepository<Livro, java.lang.String> {

  /**
   * Obtém a instância de Livro utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Livro entity WHERE entity.id = :id")
  public Livro findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Livro utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Livro entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Livro entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<Livro> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Livro entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:data is null OR entity.data = :data)")
  public Page<Livro> specificSearch(@Param(value="nome") java.lang.String nome, @Param(value="data") java.util.Date data, Pageable pageable);
  
}
