# kotlin Training

## Ejercicio práctico semana 1

En el archivo [Ejercicio Semana 1](src/main/kotlin/com/labs/digital/aval/training/semana1/Exercise1.kt) implementar el metodo `evaluate` de manera tal que dados dos string
llamadados secret y guess, determine el número de carácteres que estan en la misma posición (0-index based) tanto en el string secret como gues.
Tambien el número de carácteres que estan en secret y guess pero en una posición diferente.

Condiciones:
1. Los String tendran una longitud  de 4.
2. Los String estaran solamente compuestos por los carácteres A,B,C,D,E,F.
3. Se permiten carácteres repetidos.

En el metodo a implementar encontraran que ya hay un return 
```kotlin
return CorrectAndWrong(-1, -1)
```
el primer parametro es el numero de caracteres en posicion correcta y el segundo los que estan en posicion incorrecta, en su implementacion, cambiar los -1 por las variables que definan.

Se incluyen pruebas para que validen sus resultados:
* [Pruebas caracteres no repetidos](src/test/kotlin/com/labs/digital/aval/training/semana1/TestExerciseWithDifferentLetters.kt)
* [Pruebas caracteres repetidos](src/test/kotlin/com/labs/digital/aval/training/semana1/TestExerciseWithDifferentLetters.kt)

Pueden ejecutar cada uno de los archivos de forma independiente o ejecutar la task test de gradle. 
