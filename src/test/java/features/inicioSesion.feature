Feature: Inicio Sesion



 Scenario Outline: Inicio de sesion
    Given El usuario ingresa a la pagina de inicio
    When Hace clic en el boton de Iniciar sesion
    And Ingresa el nombre del usuario "<nombre>"
   And Ingresa la clave del usuario "<clave>"
    Examples:
      | nombre     | clave  |
      | katiusca02 | 123456 |
