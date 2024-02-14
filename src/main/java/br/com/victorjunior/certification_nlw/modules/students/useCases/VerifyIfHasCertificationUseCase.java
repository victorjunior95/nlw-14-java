// Equivalente à camada de Service
package br.com.victorjunior.certification_nlw.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.victorjunior.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import br.com.victorjunior.certification_nlw.modules.students.repositories.CertificationStudentRepository;

@Service
public class VerifyIfHasCertificationUseCase {

  @Autowired
  private CertificationStudentRepository certificationStudentRepository;
  
  public boolean execute(VerifyIfHasCertificationDTO dto) {
    var result = this.certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());
    if (!result.isEmpty()) {
      return true;
    }
    // if(dto.getEmail().equals("victorjunior@gmail.com") && dto.getTechnology().equals("JAVA")) {
    //   return true;
    // }
    return false;
  }
}
