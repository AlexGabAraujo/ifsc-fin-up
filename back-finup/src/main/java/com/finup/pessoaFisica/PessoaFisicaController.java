package com.finup.pessoaFisica;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("PessoaFisica")
@SecurityRequirement(name = "bearer-key")
public class PessoaFisicaController {

}
