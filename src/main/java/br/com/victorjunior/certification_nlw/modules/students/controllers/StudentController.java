package br.com.victorjunior.certification_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.victorjunior.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import br.com.victorjunior.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;

@RestController
@RequestMapping("/students")
public class StudentController {

  // Preciso usar o meu USECASE/Service
  @Autowired // injeção de dependência, inicializando o USECASE
  private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;
  
  @PostMapping("/verifyIfHasCertification")
  public String verifyIfHasCertification(@RequestBody VerifyIfHasCertificationDTO verifyIfHasCertificationDTO) {
    // Email
    // Technology

    var result = this.verifyIfHasCertificationUseCase.execute(verifyIfHasCertificationDTO);
    if(result) {
      return "Usuário já fez a prova";
    }
    System.out.println(verifyIfHasCertificationDTO);
    return "Usuário pode fazer a prova";
  }
}
