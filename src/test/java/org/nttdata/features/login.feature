Feature: Flujo inicial de login

  Scenario Outline: Realizar login exitoso
    Given el usuario se logea con "<usuario>" y "<password>"
    Then se valida el login exitoso

    Examples:
      | usuario       | password   |
      | standard_user | secret_sauce |

