<img width="372" height="215" alt="image" src="https://github.com/user-attachments/assets/6438ecdc-bb1b-4a91-ada5-518395b24173" />
Sistema de Cálculo de Impuestos Salariales

Descripción

Este proyecto consiste en desarrollar un sistema de cálculo de impuestos salariales en Java, aplicando conceptos de Programación Orientada a Objetos (POO), especialmente el polimorfismo y la herencia.

El sistema permite calcular los impuestos correspondientes a diferentes tipos de trabajadores, como empleados en relación de dependencia, autónomos y directores de empresa.

 Objetivo

Implementar un sistema que permita calcular y procesar los impuestos de distintos perfiles laborales mediante un método común, utilizando fórmulas específicas para cada categoría.

Clases utilizadas

Trabajador: Clase abstracta que contiene los atributos básicos nombre y cuil, además del método abstracto calcularImpuesto().

EmpleadoRelacionDependencia: Representa a los empleados en relación de dependencia y calcula sus impuestos según su alícuota.

Autonomo: Representa a los trabajadores autónomos y aplica su propia fórmula de cálculo.

DirectorEmpresa: Representa a los directores de empresa y define su propio cálculo de impuestos.

EstudioContable: Clase encargada de procesar la lista de trabajadores, calcular los impuestos y obtener el total recaudado.

Main: Contiene el método principal, crea los objetos y demuestra el funcionamiento del sistema.

Conceptos aplicados

Programación Orientada a Objetos (POO).

Herencia.

Polimorfismo.

Clases abstractas.

Sobrescritura de métodos (@Override).

Colecciones de objetos.

Métodos abstractos.

Funcionamiento

Se define la clase abstracta Trabajador con los datos generales y el método calcularImpuesto().

Se crean las diferentes clases de trabajadores, cada una con su propia fórmula de cálculo.

La clase EstudioContable recibe una colección de trabajadores.

Se recorre la colección y se calcula el impuesto de cada trabajador de manera polimórfica.

Finalmente, se muestra por consola el detalle de los impuestos y el total recaudado.

 Tecnologías utilizadas

Lenguaje: Java.

Entorno de desarrollo: IntelliJ IDEA.

Paradigma: Programación Orientada a Objetos.

Resultado esperado

Al ejecutar el programa, el estudio contable podrá calcular los impuestos de diferentes perfiles laborales utilizando un mismo método, respetando las fórmulas correspondientes a cada tipo de trabajador y mostrando un reporte financiero con el total recaudado.
