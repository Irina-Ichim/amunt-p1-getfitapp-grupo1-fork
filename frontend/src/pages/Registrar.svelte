<script>
  import { navigate } from "svelte-routing";
  let nombreUsuario = "";
  let password = "";
  let mensajeError = "";

  function handleSubmit() {
    if (nombreUsuario === "Ali Siam" && password === "GetFitEasy2023") {
      navigate("/bienvenido");
    } else if (nombreUsuario === "Madrid" && password === "GetFitEasy2023") {
      navigate("/madrid");
    } else if (nombreUsuario === "Barcelona" && password === "GetFitEasy2023") {
      navigate("/barcelona");
    } else {
      mensajeError = "Datos Incorrectos";
    }
  }
</script>

<div class="login-container">
  <h1>Login</h1>
  <form on:submit|preventDefault={handleSubmit}>
    <div class="form-group">
      <label for="nombreUsuario">Usuario</label>
      <input type="text" id="nombreUsuario" bind:value={nombreUsuario} />
    </div>
    <div class="form-group">
      <label for="password">Contraseña</label>
      <input type="password" id="password" bind:value={password} />
    </div>
    <button type="submit">Enviar</button>
  </form>

  {#if mensajeError}
    <p>{mensajeError}</p>
  {/if}
</div>

<style>
  .login-container {
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

  p {
    color: #02b2ec;
    font-size: 16px;
    margin-top: 10px;
  }
</style>
