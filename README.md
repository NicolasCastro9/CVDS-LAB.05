# ESTUDIANTES: NICOLAS CASTRO Y SERGIO GONZALES
# CVDS-LAB.05
# PARTE 1: JUGANDO A SER UNCLIENTE HTTP
## 1.Abra una terminal Linux o consola de comandos Windows.
## 2. Realice una conexión síncrona TCP/IP a través de Telnet alsiguiente servidor:
* Host:www.escuelaing.edu.co
* Puerto: 80
Teniendo en cuenta los parámetros delcomando telnet:
telnet HOST PORT

![](https://github.com/NicolasCastro9/CVDS-LAB.05/blob/main/FOTOS/1.png?raw=true)

## 3. Antes de que el servidorcierre la conexión por falta de comunicación:

Revise la página 36 del RFC del protocolo HTTP,sobre cómo realizar una petición GET. Con esto,solicite alservidor el recurso.
‘sssss/abc.html’usando la versión 1.0 deHTTP.

Asegúrese de presionar ENTER dos veces después de ingresar elcomando.

Revise el resultado obtenido.


![image](https://user-images.githubusercontent.com/98556822/221438957-5f3a2c4d-3cd9-4cae-96c0-237b700f61a1.png)


### ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.

Una redirección 301, también conocida como redireccionamiento 301, indica el cambio permanente de la ubicación de una página web a otra. La parte 301 hace referencia al código de estado HTTP de la página que está siendo redirigida.

### ¿Qué otros códigos de error existen?,¿En qué caso se manejarán?

300 Multiple Choice: User-Agent o el usuario debe escoger uno de ellos. No hay forma estandarizada de seleccionar una de las respuestas.

302 Found: el recurso de la URL solicitada ha sido cambiado temporalmente.

303 See Other: El servidor envía esta respuesta para dirigir al cliente a un nuevo recurso solicitado a otra dirección usando una petición GET.

304 Not Modified: Le indica al cliente que la respuesta no ha sido modificada. Entonces, el cliente puede continuar usando la misma versión almacenada en su caché.

305 Use Proxy Deprecated: una respuesta solicitada debe ser accedida desde un proxy.

306 unused: Este código de respuesta ya no es usado más. Actualmente se encuentra reservado. Fue usado en previas versiones de la especificación HTTP1.1.

400 Bad Request: Esta respuesta significa que el servidor no pudo interpretar la solicitud dada una sintaxis inválida.

401 Unauthorized: Es necesario autenticar para obtener la respuesta solicitada la autenticación es posible.

402 Payment Required: Este código de respuesta está reservado para futuros usos. El objetivo inicial de crear este código fue para ser utilizado en sistemas digitales de pagos. Sin embargo, no está siendo usado actualmente.

403 Forbidden: El cliente no posee los permisos necesarios para cierto contenido, por lo que el servidor está rechazando otorgar una respuesta apropiada.

404 Not Found: El servidor no pudo encontrar el contenido solicitado.

405 Method Not Allowed: El método solicitado es conocido por el servidor pero ha sido deshabilitado y no puede ser utilizado.

500 Internal Server Error: El servidor ha encontrado una situación que no sabe cómo manejarla.

501 Not Implemented (en-US): El método solicitado no está soportado por el servidor y no puede ser manejado.

502 Bad Gateway: Esta respuesta de error significa que el servidor, mientras trabaja como una puerta de enlace para obtener una respuesta necesaria para manejar la petición, obtuvo una respuesta inválida.

503 Service Unavailable: El servidor no está listo para manejar la petición. 

504 Gateway Timeout: Esta respuesta de error es dada cuando el servidor está actuando como una puerta de enlace y no puede obtener una respuesta a tiempo.

505 HTTP Version Not Supported: La versión de HTTP usada en la petición no está soportada por el servidor.

## 4. Realice una nueva conexión con telnet, esta vez a:
* Host:www.httpbin.org
* Puerto: 80
* VersiónHTTP:1.1
Ahora,solicite (GET) el recurso /html.¿Qué se obtiene como resultado?

![image](https://user-images.githubusercontent.com/98556822/221474425-4a2befb5-dbb1-4311-be55-ccfd4226a8ec.png)



¡Muy bien!, ¡Acaba de usar del protocoloHTTP sin un navegador Web!. Cada vez que se usa un navegador, éste se conecta a un servidorHTTP, envía peticiones
(del protocoloHTTP), espera el resultado de las mismas, y -sise trata de contenidoHTML- lo interpreta y dibuja.
## 5. Seleccione elcontenido HTML de la respuesta y copielo alcortapapeles CTRL-SHIFT-C. Ejecute elcomando wc (word count) para contar palabrascon la
opción -c para contar el número de caracteres:
wc -c



Pegue elcontenido del portapapelescon CTRL-SHIFT-V y presione CTRL-D (fin de archivo de Linux). Si no termina elcomando wc presione CTRL-D
de nuevo.No presione mas de dos veces CTRL-D indica que se termino la entrada y puede cerrarle la terminal. Debe salir el resultado de la cantidad de
caracteres que tiene elcontenidoHTML que respondió elservidor.


Claro está, las peticiones GET son insuficientes en muchoscasos. Investigue:¿Cuál esla diferencia entre los verbos GET y POST?¿Qué otrostipos de
peticiones existen?

GET: Leer la representacion de un recurso, devuelve la representacion en un formato concreto HTML, XML, JSON o imágenes, JavaScript, CSS, etc.

POST: se utiliza para enviar una entidad a un recurso en específico, causando a menudo un cambio en el estado o efectos secundarios en el servidor.

HEAD: pide una respuesta idéntica a la de una petición GET, pero sin el cuerpo de la respuesta.

PUT: reemplaza todas las representaciones actuales del recurso de destino con la carga útil de la petición.

DELETE: elimina un recurso en específico.

CONNECT: establece un túnel hacia el servidor identificado por el recurso.

TRACE: realiza una prueba de bucle de retorno de mensaje a lo largo de la ruta al recurso de destino.

OPTIONS: es utilizado para describir las opciones de comunicación para el recurso de destino.

UPDATE: Actualizar recursos


## 6. En la practica no se utiliza telnet para hacer peticiones a sitios web sino elcomando curl con ayuda de la linea d comandos: “curl
www.httpbin.org”
Utilice ahora el parámetro -v y con el parámetro -i:

curl -v www.httpbin.org
curl -i www.httpbin.org
¿Cuáles son las diferencias con los diferentes parámetros?

El comando curl -v se utiliza para obtener información más detallada sobre la solicitud y la respuesta HTTP. caso 200 exitosa

![image](https://user-images.githubusercontent.com/98556822/221476408-4258e2cd-9f64-4bfc-8162-51fda1f615b4.png)


El comando curl -i se utiliza para ver los encabezados de respuesta HTTP

![image](https://user-images.githubusercontent.com/98556822/221476440-57c08a0b-6178-474e-95c2-0c209d59111c.png)


# PARTE II. -HACIENDO UNA APLICACIÓN WEB DINÁMICA A BAJO NIVEL.

## 1. Revise la clase SampleServlet incluida a continuacion, e identifique qué hace:
```
package edu.eci.cvds.servlet;
import java.io.IOException;
import java.io.Writer;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(
urlPatterns = "/helloServlet"
)
public class SampleServlet extends HttpServlet{
static final long serialVersionUID = 35L;
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
Writer responseWriter = resp.getWriter();
Optional<String> optName = Optional.ofNullable(req.getParameter("name"));
String name = optName.isPresent() && !optName.get().isEmpty() ? optName.get() : "";
resp.setStatus(HttpServletResponse.SC_OK);
responseWriter.write("Hello" + name + "!");
responseWriter.flush();
}
}
```
Esta clase es un ejemplo de GET que escribe el hello mas el parametro de name

## 2. En el pom.xml, modifique la propiedad "packaging"con el valor "war". Agregue la siguiente dependencia:

## 3. Revise en el pom.xml para qué puerto TCP/IP está configurado elservidor embebido de Tomcat (versección de plugins).

## 4. Compile y ejecute la aplicación en elservidor embebido Tomcat, a través de Maven con:

* mvn package

![image](https://user-images.githubusercontent.com/98556822/221758754-250ed5a5-7030-4430-bc33-2fec7225df66.png)

* mvn tomcat7:run

![image](https://user-images.githubusercontent.com/98556822/221758795-d60ee8d7-5a3c-4ae1-9d08-5e1bf29344b9.png)

## 5. Abra un navegador, y en la barra de direcciones ponga la URL con la cualse le enviarán peticiones al ‘SampleServlet’. Tenga en cuenta que la URL tendrá como host ‘localhost’,como puerto, elconfigurado en el pom.xml y el path debe ser el del Servlet. Debería obtener un mensaje de saludo.

## 6. Observe que el Servlet ‘SampleServlet’ acepta peticiones GET, y opcionalmente, lee el parámetro ‘name’. Ingrese la misma URL, pero ahora agregando un parámetro GET (si no sabe como hacerlo, revise la documentación en http://www.w3schools.com/tags/ref_httpmethods.asp).

## 7. Busque el artefacto gson en el repositorio de maven y agregue la dependencia.

## 8. En el navegador revise la dirección https://jsonplaceholder.typicode.com/todos/1. Intente cambiando diferentes números al final del path de la url.

## 9. Basado en la respuesta que le da elservicio del punto anterior,cree la clase edu.eci.cvds.servlet.model.Todo con un constructor vacío y los métodos getter y setter para las propiedades de los"To Dos" que se encuentran en la url indicada.




