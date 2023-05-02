#Autor: Diego Rodriguez
#language:en

Feature: yo como usuario quiero seleccionar 5 productos aleatorios, con cantidades aleatorias entre 1 y 10
  en la pagina exito
  Scenario: Seleccion de 5 productos
    Given que Diego ingresa a exito
    When selecciona los productos
    Then los productos en el carrito seran igual a los seleccionados
