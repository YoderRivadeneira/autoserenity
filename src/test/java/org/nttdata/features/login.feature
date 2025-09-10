Feature: Flujo de compras HP

  Scenario Outline: Realizar login exitoso
    Given el usuario se logea con "<usuario>" y "<password>"
    When el usuario agrega dos productos al carrito
    And procede al checkout de los productos agregados al carrito
    And completa el formulario de compra con "<nombre>", "<apellido>" y "<codigoPostal>"
    Then el mensaje de compra exitosa debe ser "<mensajeEsperado>"



    Examples:
      | usuario       | password   |  nombre  | apellido  | codigoPostal | mensajeEsperado |
      | standard_user | secret_sauce | Yoder    | Omar     | 12345        |  THANK YOU FOR YOUR ORDER  |

