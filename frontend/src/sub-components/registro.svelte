<script>
    let nombreUsuario = "";
    let password = "";
    let confirmPassword = "";
    let mensajeError = "";
  
    function handleSubmit() {
      // Agregar validaciones aquí (por ejemplo, verificar que las contraseñas coincidan)
      if (password !== confirmPassword) {
        mensajeError = "Las contraseñas no coinciden";
        return;
      }
  
      // Envía los datos del formulario al backend para el registro
      // Debes implementar esta parte en tu aplicación
      // Puedes usar fetch() u otra biblioteca para hacer la solicitud HTTP al backend
      fetch("/api/registro", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ nombreUsuario, password }),
      })
        .then((response) => response.json())
        .then((data) => {
          if (data.registroExitoso) {
            // Registro exitoso, redirige al usuario a la página de inicio de sesión
            window.location.href = "/login";
          } else {
            // Registro fallido, muestra un mensaje de error
            mensajeError = "El registro ha fallado. Inténtalo nuevamente.";
          }
        })
        .catch((error) => {
          console.error("Error al registrar al usuario:", error);
          mensajeError = "Error al registrar al usuario. Inténtalo nuevamente.";
        });
    }
  </script>
  
  <div class="registro-container">
    <h1>Registro de Usuario</h1>
    <form on:submit|preventDefault={handleSubmit}>
      <div class="form-group">
        <label for="nombreUsuario">Usuario</label>
        <input type="text" id="nombreUsuario" bind:value={nombreUsuario} />
      </div>
      <div class="form-group">
        <label for="password">Contraseña</label>
        <input type="password" id="password" bind:value={password} />
      </div>
      <div class="form-group">
        <label for="confirmPassword">Confirmar Contraseña</label>
        <input type="password" id="confirmPassword" bind:value={confirmPassword} />
      </div>
      <button type="submit">Registrarse</button>
    </form>
  
    {#if mensajeError}
      <p class="error-message">{mensajeError}</p>
    {/if}
  </div>
  
  <style>
    .registro-container {
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      height: 100vh;
    }
  
    h1 {
      color: #254e5f;
      font-size: 36px;
      margin-bottom: 20px;
    }
  
    form {
      display: flex;
      flex-direction: column;
      align-items: center;
      padding: 20px;
      border-radius: 8px;
      background-color: white;
      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
    }
  
    .form-group {
      display: flex;
      flex-direction: column;
      align-items: flex-start;
      width: 100%;
      margin-bottom: 10px;
    }
  
    label {
      font-size: 16px;
      margin-bottom: 5px;
    }
  
    input {
      width: 100%;
      padding: 8px;
      border-radius: 4px;
      border: 1px solid #ccc;
    }
  
    button {
      width: 100%;
      height: 40px;
      border-radius: 30px;
      background-color: #02b2ec;
      color: white;
      font-size: 15px;
      cursor: pointer;
      transition: background-color 0.3s ease-in-out;
    }
  
    button:hover {
      background-color: #007acc;
    }
  
    .error-message {
      color: #ff0000;
      font-size: 16px;
      margin-top: 10px;
    }
  </style>
  