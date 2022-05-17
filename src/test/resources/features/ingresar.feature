Feature: El usuario debera comprar productos en la aplicacion Linio.com.co
          debe selececcionar el producto en la seccion hogar y dirigirse a la categoria
          de colchones y almohadas, posteriormente debera agregarlo al carrito de compras

  Scenario Outline: selecionar el producto agregar al carrito y eliminarlo

    Given el usuario esta en la aplicacion https://www.linio.com.co/
    When el usuario ingresa a la seccion colchones de la categoria Hogar y selecciona un producto con el carrito
    And   el usuario selecciona el producto <producto>
    And   el usuario agrega productos al carrito de compras <cantidad>
    And   el usuario elimina el producto seleccionado del carrito de compras
    Then el usuario ve el mensaje <mensaje>

    Examples:
      | producto                                               | cantidad | mensaje                                      |
      | Super Mega Combo Azul Queen 160x190 Resortado Marshall | 3        | No hay productos seleccionados en el carrito |

