// Equivalente à camada de Service
package br.com.victorjunior.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import br.com.victorjunior.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
  
  public boolean execute(VerifyIfHasCertificationDTO dto) {
    if(dto.getEmail().equals("victorjunior@gmail.com") && dto.getTechnology().equals("JAVA")) {
      return true;
    }
    return false;
  }
}
