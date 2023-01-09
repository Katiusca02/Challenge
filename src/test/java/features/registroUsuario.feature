Feature: Dar de alta un usuario.
  Registro de usuario por primera vez
@test
  Scenario Outline: Registrar Usuario
    Given El usuario ingresa a la pagina de inicio
    When Hace clic en el boton de Inscribirse
    And Ingresa su usuario "<usuario>"
    And Ingresa su clave "<clave>"
    Then Se registra el usuario exitosamente
    Examples:
      | usuario  | clave  |
      | perrito4 | 987654 |
