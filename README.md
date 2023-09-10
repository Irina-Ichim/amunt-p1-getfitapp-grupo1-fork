# GetFitEasy

GetFitEasy es una cadena de asesoramiento de salud y bienestar que ofrece un espacio con máquinas y clases para nuestros clientes. Hemos desarrollado una página web para gestionar el seguimiento de nuestros clientes.

## Cómo lanzar el proyecto en local

1. Desde la carpeta `frontend`, ejecuta los siguientes comandos en tu terminal:

   ```bash
   npm install
   npm run dev
   ```

   Antes de lanzar la API de Spring Boot, asegúrate de crear una base de datos en `localhost:5432/postgres`.

2. Desde la carpeta `backend`, ejecuta el siguiente comando para iniciar la API de Spring Boot:

   ```bash
   gradlew.bat bootRun
   ```

## 🔧 Competencias técnicas

- Desarrollo de un proyecto full-stack con Kotlin, Spring Boot y Svelte.
- Desarrollo de componentes de acceso a los datos utilizando Postgres.
- Creación de una interfaz de usuario web dinámica.
- Práctica de programación en pareja (pair programming).

## 💡 Funcionalidades

- Página web atractiva que muestra los servicios ofrecidos, una lista de actividades programadas, una sección sobre quiénes somos, una lista de consejos saludables y la posibilidad de registrarse con inicio de sesión (para el propietario de la empresa y administradores de Madrid y Barcelona).

## 🏋 Planificando el trabajo

- Propuesta de diseño inicial.
- Creación de historias de usuario y definición de tareas con la ayuda de nuestros formadores, Gabriela Corotelo y Javi Sánchez.
- Comunicación activa con nuestro cliente, Ali Siam.
- Desarrollo en el frontend con Svelte Routing y creación de componentes.
- Desarrollo en el backend con la creación de pruebas (tests).

## 🧑‍💻 Creando la base de datos

- El proyecto se ejecuta localmente en el puerto 8080.
- API REST:

  | Método | Ruta                | Descripción                           |
  |--------|---------------------|---------------------------------------|
  | GET    | `/api/subscribers`  | Devuelve una lista de suscriptores.   |

- Hemos creado una base de datos en PostgreSQL y luego la hemos implementado desde Spring Boot utilizando el archivo `data.sql`.
- Se ha agregado el método `fun findByAddressContaining(location: String)` para obtener listas de Barcelona y Madrid, que se crearon previamente en el archivo `data.sql`.

**IMPORTANTE:** Asegúrate de cambiar la contraseña en `application.properties` para cargar la base de datos de PostgreSQL.

### 👭 Nuestro equipo

| ![Jhoana Vicente](https://avatars.githubusercontent.com/u/126072279?v=4) | ![Irina Ichim](https://avatars.githubusercontent.com/u/126028195?v=4) | ![Maribel Telleria](https://avatars.githubusercontent.com/u/126073882?v=4) | ![Minerva Pedret](https://avatars.githubusercontent.com/u/126767503?v=4) |
|:-------------------------------------------------------------------------:|:------------------------------------------------------------------:|:-----------------------------------------------------------------------:|:----------------------------------------------------------------------:|
| Jhoana Vicente                                                           | Irina Ichim                                                        | Maribel Telleria                                                    | Minerva Pedret                                                       |
