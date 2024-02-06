package br.com.victorjunior.certification_nlw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {
  
  @GetMapping("/retornarPrimeiraController")
  public String retornoPrimeiraController() {
    return "Criando minha primeira controller";
  }

}
