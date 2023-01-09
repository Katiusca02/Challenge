Feature: Inicio Sesion
    Inicio de Sesion de un usuario ya registrado
@test
  Scenario Outline: Inicio de sesion
    Given El usuario ingresa a la pagina de inicio
    When Hace clic en el boton de Iniciar sesion
    And Ingresa el nombre del usuario "<nombre>"
    And Ingresa la clave del usuario "<clave>"
    Then Ingresa a su cuenta
    Examples:
      | nombre     | clave  |
      | katiusca02 | 123456 |


  Scenario Outline: Agregar una laptop al carrito
    Given El usuario ingresa a la pagina de inicio
    When Hace clic en el boton de Iniciar sesion
    And Ingresa el nombre del usuario "<nombre>"
    And Ingresa la clave del usuario "<clave>"
    And Hace clic en el menu opcion laptop

    Examples:
      | nombre     | clave  |
      | katiusca02 | 123456 |
