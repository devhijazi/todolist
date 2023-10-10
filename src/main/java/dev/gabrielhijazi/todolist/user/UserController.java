package dev.gabrielhijazi.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modifiers
 * PUBLIC - Qualquer um pode ter acesso
 * PRIVATE - Algumas restrições
 * PROTECTED - Deve estar na mesma estrutura do pacote
 */

@RestController
@RequestMapping("/users")
public class UserController {

  @PostMapping("/")
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel.name);
  }
}