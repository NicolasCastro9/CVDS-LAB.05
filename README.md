# CVDS-LAB.05
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

Update: Actualizar recursos


## 6. En la practica no se utiliza telnet para hacer peticiones a sitios web sino elcomando curl con ayuda de la linea d comandos: “curl
www.httpbin.org”
Utilice ahora el parámetro -v y con el parámetro -i:

curl -v www.httpbin.org
curl -i www.httpbin.org
¿Cuáles son las diferencias con los diferentes parámetros?

El comando curl -v nos muestra una informacion completa de la peticion GET realizada y el estado de la peticion en este caso 200 exitosa

![image](https://user-images.githubusercontent.com/98556822/221476408-4258e2cd-9f64-4bfc-8162-51fda1f615b4.png)


El comando curl -i nos muestra solo la informacoin completa del estado de la peticion en este caso 200

![image](https://user-images.githubusercontent.com/98556822/221476440-57c08a0b-6178-474e-95c2-0c209d59111c.png)

