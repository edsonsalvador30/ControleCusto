package diagram.projetos.dao;

import diagram.projetos.entity.*;
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
@Repository("RequisitosDAO")
@Transactional(transactionManager="diagram.projetos-TransactionManager")
public interface RequisitosDAO extends JpaRepository<Requisitos, java.lang.String> {

  /**
   * Obtém a instância de Requisitos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Requisitos entity WHERE entity.id = :id")
  public Requisitos findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Requisitos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Requisitos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



}
