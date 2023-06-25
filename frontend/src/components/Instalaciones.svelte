<script>
    import imagenBoxeo from "../assets/servicios/boxeo.jpeg"
    import imagenCardio from "../assets/servicios/cardio.jpeg"
    import imagenEntrenador from "../assets/servicios/entrenador.jpg"
    import imagenPiscina from "../assets/servicios/piscina.jpeg"
    import imagenSauna from "../assets/servicios/sauna.jpeg"
    import imagenYoga from "../assets/servicios/yoga.jpeg"
</script>

<main>
    <h1>Nuestros Servicios</h1>
    <section>
        <div>
            <img src={imagenBoxeo} alt=""/>
            <p>Boxeo</p>
            <button>Haz una Reserva</button>
        </div>
        <div>
            <img src={imagenCardio} alt=""/>
            <p>Cardio</p>
            <button>Haz una Reserva</button>
        </div>
        <div>
            <img src={imagenEntrenador} alt=""/>
            <p>Entrenador Personal</p>
            <button>Haz una Reserva</button>
        </div>
        <div>
            <img src={imagenPiscina} alt=""/>
            <p>Piscina</p>
            <button>Haz una Reserva</button>
        </div>
        <div>
            <img src={imagenSauna} alt=""/>
            <p>Sauna</p>
            <button>Haz una Reserva</button>
        </div>
        <div>
            <img src={imagenYoga} alt=""/>
            <p>Yoga</p>
            <button onclick="window.location.href=`/registrate`">Haz una Reserva</button>
        </div>
    </section>
</main>

<style>
    section {
        display: grid;
        grid-template-columns: repeat(3, 1fr);
    }

    h1 {
        margin: 20px;
        font-weight: bold;
        color: #254e5f;
    }

    div {
        display: grid;
        justify-items: center;
    }
    img {
        border-radius: 15px;
        object-fit: cover;
        width: 330px;
        height: 260px;
        margin-bottom: 20px;
    }

    p {
        font-weight: bold;
        font-size: 20px;
        margin-bottom: 10px;
        color: #254e5f;
    }

    button {
        margin-top: 20px;
        margin-bottom: 40px;
        width: 200px;
        height: 60px;
        border-radius: 30px;
        border:none;
        background: linear-gradient(to bottom, #00ff84, #254e5f);
        color:#ffffff;
        font-size: 15px;
        cursor:pointer;
    }


    footer {
        margin-top: 80px;
    }
</style>