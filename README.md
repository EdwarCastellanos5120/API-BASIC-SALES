# API-BASIC-SALES

## Descripción

El proyecto personal utiliza el lenguaje de programación Java y el framework Spring y Spring Boot. La información de
clientes, productos, proveedores y ventas se administró a través de la API. Puede realizar operaciones CRUD en las
tablas correspondientes de la base de datos. La base de datos utilizada es MySQL. La API se probó con Postman.

## Tecnologías

### Java:

Es un lenguaje de programación versátil y ampliamente utilizado en el desarrollo de
aplicaciones empresariales y APIs.

### Framework Spring y Spring Boot:

Es un framework de desarrollo de aplicaciones de código abierto para Java que
proporciona características como Inversión de Control (IoC) y contenedor de inyección de dependencias. Spring Boot es
una extensión de Spring que facilita la configuración y creación de aplicaciones listas para producción.

### MySQL:

Es un sistema de gestión de bases de datos relacional (RDBMS) utilizado para almacenar y recuperar datos
relacionados con clientes, productos, proveedores y ventas.

### Hibernate:

Es un framework de mapeo objeto-relacional (ORM) que permite mapear objetos Java a tablas de base
de datos y viceversa, facilitando la interacción con la base de datos.

### Lombok:

Es una biblioteca que ayuda a reducir el código repetitivo en clases Java mediante el uso de anotaciones
para generar automáticamente métodos como getters, setters, constructores, etc.

### Spring JPA:

Es una abstracción de alto nivel sobre el estándar JPA (Java Persistence API) que simplifica el
acceso a la base de datos mediante la creación de repositorios.

### Swagger UI:

Es una herramienta que permite generar automáticamente una documentación interactiva para la API
REST, facilitando la comprensión y prueba de los endpoints.

### JWT (JSON Web Tokens) y Spring Security:

JWT se utiliza para implementar la capa de seguridad de la API, permitiendo la
autenticación y autorización de usuarios. Spring Security es una poderosa biblioteca de seguridad para aplicaciones
Java.

# Endpoints

## Auth Endpoints

### POST /login
Permite a los usuarios autenticarse en la aplicación proporcionando credenciales válidas (nombre de usuario y
contraseña). Retorna un token JWT para realizar autenticación en otras partes de la API.

### POST /register
Permite a los usuarios registrarse en la aplicación proporcionando información de registro como nombres, apellidos,
nombre de usuario y contraseña. Retorna un token JWT para autenticación.

## Provider Endpoints

### GET /providers/list
Obtiene una lista de todos los proveedores registrados en la base de datos.

### POST /providers/create
Crea un nuevo proveedor en la base de datos con la información proporcionada en el cuerpo de la solicitud.

### PUT /providers/update/{id}
Actualiza la información de un proveedor existente identificado por su ID.

### DELETE /providers/delete/{id}
Elimina un proveedor existente de la base de datos identificado por su ID.

### GET /providers/search/byId/{id}
Busca y devuelve un proveedor específico por su ID.

### GET /providers/search/byNit/{nit}
Busca y devuelve un proveedor específico por su número de NIT.

### GET /providers/search/byName/{name}
Busca y devuelve un proveedor específico por su nombre.

### GET /providers/search/byAddress/{address}
Busca y devuelve un proveedor específico por su dirección.

## Product Endpoints

### GET /products/list
Obtiene una lista de todos los productos registrados en la base de datos.

### POST /products/create
Crea un nuevo producto en la base de datos con la información proporcionada en el cuerpo de la solicitud.

### PUT /products/update/{id}
Actualiza la información de un producto existente identificado por su ID.

### DELETE /products/delete/{id}
Elimina un producto existente de la base de datos identificado por su ID.

### GET /products/search/byId/{id}
Busca y devuelve un producto específico por su ID.

### GET /products/search/byName/{name}
Busca y devuelve un producto específico por su nombre.

### GET /products/search/byPrice/{price}
Busca y devuelve una lista de productos con un precio específico.

### GET /products/search/byQuantityGreaterThan/{quantity}
Busca y devuelve una lista de productos con una cantidad mayor a la especificada.

### GET /products/search/byProviderId/{id}
Busca y devuelve una lista de productos pertenecientes a un proveedor específico por su ID.

### GET /products/search/byNameAndPrice/{name}/{price}
Busca y devuelve una lista de productos que coinciden con un nombre específico y tienen un precio específico.

### GET /products/search/byProviderName/{name}
Busca y devuelve una lista de productos pertenecientes a un proveedor específico por su nombre.

### GET /products/search/byProviderNit/{nit}
Busca y devuelve un producto perteneciente a un proveedor específico por su número de NIT.

## Sales Endpoints

### GET /sales/list
Obtiene una lista de todas las ventas registradas en la base de datos.

### POST /sales/create
Crea una nueva venta en la base de datos con la información proporcionada en el cuerpo de la solicitud.

### DELETE /sales/delete/{id}
Elimina una venta existente de la base de datos identificada por su ID.

### DELETE /sales/deleteByReference/{reference}
Elimina una venta existente de la base de datos identificada por su referencia.

### GET /sales/findByReference/{reference}
Busca y devuelve una venta específica por su referencia.

## Customer Endpoints

### GET /customers/list
Obtiene una lista de todos los clientes registrados en la base de datos.

### POST /customers/create
Crea un nuevo cliente en la base de datos con la información proporcionada en el cuerpo de la solicitud.

### PUT /customers/update/{id}
Actualiza la información de un cliente existente identificado por su ID.

### DELETE /customers/delete/{id}
Elimina un cliente existente de la base de datos identificado por su ID.

### GET /customers/search/byId/{id}
Busca y devuelve un cliente específico por su ID.

### GET /customers/search/byDpi/{dpi}
Busca y devuelve un cliente específico por su número de DPI (Documento Personal de Identificación).

### GET /customers/search/byKeyword/{keyword}
Busca y devuelve una lista de clientes que contienen la palabra clave especificada en su nombre, apellido o DPI.

### GET /customers/search/byBirthDate/{birthDate}
Busca y devuelve una lista de clientes que nacieron en la fecha especificada. La fecha debe estar en el formato "yyyy-MM-dd".