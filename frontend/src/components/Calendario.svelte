<script>
 export let dia;
</script>

<div>
    <h1>{dia}</h1>
    <button>Reservar Clase</button>
</div>

<style>
    div {
        margin-left: 50px;
    }
    h1 {
        text-align: start;
        color: #ffffff;
        font-size: 30px;

    }
    button {
        margin-top: 50px;
        width: 200px;
        height: 60px;
        border-radius: 30px;
        border: none;
       
        margin-right: 50px;
        color: #ffffff;
        animation: color-transition 5s infinite alternate;
    }

    @keyframes color-transition {
    0% {
        background: linear-gradient(to bottom, #007acc, #254e5f); 
    }
    50% {
        background: linear-gradient(to bottom, #254e5f, #007acc); 
    }
    100% {
        background: linear-gradient(to bottom, #007acc, #254e5f); 
    }
}

</style>

