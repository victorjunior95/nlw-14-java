package br.com.victorjunior.certification_nlw.modules.students.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.victorjunior.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;

@RestController
@RequestMapping("/students")
public class StudentController {
  
  @PostMapping("/verifyIfHasCertification")
  public String verifyIfHasCertification(@RequestBody VerifyIfHasCertificationDTO verifyIfHasCertificationDTO) {
    // Email
    // Technology

    System.out.println(verifyIfHasCertificationDTO);
    return "Usuário pode fazer a prova";
  }
}
