
<section>
<div>
    <h2>SERVICIOS ADICIONALES</h2>
    <p>En GetFitEasy, siempre ampliamos nuestros servicios adicionales para satisfacer las necesidades de <br>nuestra
        comunidad. ¿Hay algo que te gustaría que añadiéramos a la lista? Envía una solicitud.</p>
</div>

<ul>
    <li>Instalaciones modernas</li>
    <li>Nutrición personal</li>
    <li>*</li>
    <li>*</li>
    <li>Clases premium</li>
    <li>Pases mensuales para invitados</li>
    <li>*</li>
    <li>*</li>
    <li>Entrenadores personales</li>
    <li>Vestidores</li>
</ul>
</section>

<style>
    section{
        background: linear-gradient(to bottom, #00ff84, #254e5f);
        animation: color-transition 5s infinite alternate;
    }
    @keyframes color-transition {
    0% {
        background: linear-gradient(to bottom, #007acc, #123456); 
        border-image: linear-gradient(to bottom, #007acc, #123456) 1; 
    }
    50% {
        background: linear-gradient(to bottom, #123456, #007acc); 
        border-image: linear-gradient(to bottom, #123456, #007acc) 1; 
    }
    100% {
        background: linear-gradient(to bottom, #007acc, #123456); 
        border-image: linear-gradient(to bottom, #007acc, #123456) 1; 
    }
}

    div {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 30vh;
    }

    h2,
    p {
        text-align: center;
    }

    h2 {
        margin-top: -50px;
        margin-bottom: 5px;
        font-size: 1.6em;
        color: #ffffff;
    }

    p {
        font-size: 17px;
        margin-bottom: 30px;
        color: #ffffff;
    }

    ul {
        display: grid;
        grid-template-columns: repeat(2, 1fr);
        gap: 10px;
        justify-items: center;
        align-items: center;
        text-align: center;
        margin: 0 auto;
        max-width: 600px;
        padding: 0;
        list-style: none;
        margin-bottom: 30px;
        margin-top: -50px;
        color:#ffffff;
    }
</style>
