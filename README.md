# 2 Bimestre
## Proyecto Java

***

### Problemática a resolver

Generar un solución en lenguaje de programación **Java**

Que permita ingresar nuevas cuentas de diversas plataformas. Las plataformas son:

1. **Facebook** (se necesita los siguientes datos: nombre de usuario, edad,
  ciudad, país, correo electrónico)
2. **Twitter** (se necesita los siguientes datos: nombre de usuario, nombres,
  apellidos, edad, ciudad, país, idioma, correo electrónico)
3. **Whatsapp** (se necesita los siguientes datos: nombre de usuario,
  número de teléfono, edad, ciudad, país)
4. **Telegram** (se necesita los siguientes datos: nombre de usuario,
  número de teléfono, ciudad, país, área de interés)
5. **Signal** (se necesita los siguientes datos: nombre de usuario,
  número de teléfono, ciudad, país, hobby principal)
6. **Instagram** (se necesita los siguientes datos: nombre de usuario, ciudad,
  edad, correo electrónico)
7. **Flickr** (se necesita los siguientes datos: nombre de usuario,
  correo electrónico)

La aplicación debe tener los siguientes métodos:

- método principal - main
- método crearFacebook - (método que devuelve un valor)
- método crearTwitter - (método que no devuelve un valor)
- método crearWhatsapp - - (método que devuelve un valor)
- método crearTelegram - (método que no devuelve un valor)
- método crearSignal- (método que devuelve un valor)
- método crearInstagram - (método que no devuelve un valor)
- método crearFlickr - (método que devuelve un valor)

En la **función principal** se presenta un ciclo repetitivo que presenta un
menú de opciones:

- Si se ingresa 1 se llamará a crearFacebook
- Si se ingresa 2 se llamará a crearTwitter
- Si se ingresa 3 se llamará a crearWhatsapp
- Si se ingresa 4 se llamará a crearTelegram
- Si se ingresa 5 se llamará a crearSignal
- Si se ingresa 6 se llamará a crearInstagram
- Si se ingresa 7 se llamará a crearFlickr

### Importante

- En cada iteración del ciclo; se pregunta al usuario si se desea salir del ciclo.
- Debe usar al menos **4 paquetes** en total.
- Cada método **que no devuelve** valores debe imprimir un resumen de la cuenta
creada con todos los valores ingresados

- Cada método que devuelva valores debe hacer un return con un resumen de la cuenta creada con todos los valores ingresados

- **Cuando el usuario termina el ciclo repetitivo** se debe presentar un mensaje con base al número total de cuentas creadas. Se debe usar el número total de cuentas como argumento (entero) de una función llamada obtenerMensaje

- En la función obtenerMensaje existe un parámetro. El mensaje se forma de la siguiente manera:

```
  Se usa el siguiente arreglo unidimensional:  

  mensajeFinal = {"Campaña con poca afluencia", "Campaña moderada siga adelante", "Excelente campaña"}

```

- Si el número de cuentas creadas está en el rango de 1 a 5 el mensaje será: **Campaña con poca afluencia**

- Si el número de cuentas creadas está en el rango de 6 a 15 el mensaje será: **Campaña moderada siga adelante**

- Si el número de cuentas creadas está en el rango de 16 en adelante, el mensaje será: **Excelente campaña**

### Presentación del trabajo final
- En la carpeta **proyecto**, debe crear un proyecto de Netbeans.
- En dicho proyecto se debe generar la solución.
