package br.com.victorjunior.certification_nlw.modules.questions.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.victorjunior.certification_nlw.modules.questions.entities.QuestionEntity;

public interface QuestionRepository extends JpaRepository<QuestionEntity, UUID>{
  
  // realiza uma query automática a partir do 'findBy...' desde que a palavra subsequente coincida com um propriedade/coluna da entidade
  List<QuestionEntity> findByTechnology(String technology);

}
