<script>
export let nombre;
export let instructor;
export let sede;
</script>

<div>
    <h1>{nombre}</h1>
    <p>{instructor}</p>
    <p>{sede}</p>
</div>

<style>
    div {
        margin-right: 150px;
        margin-bottom: 20px;
    }

    h1 {
        display: flex;
        justify-content: center;
        font-size:25px;
        color: #ffffff;
        margin-bottom: 5px;
    }

    p {
       color: #ffffff;
        text-align: start;
    }
</style>