<script>
    export let src;
    export let controls = true;
</script>

<div>
    <video id="myvideo" src={src} {controls}>
        <!-- Agrega una pista de subtítulos aquí -->
        <track kind="captions" src="ruta/subtitulos.vtt" label="Subtítulos" default>
    </video>
</div>



<style>
    div {
        width: 100%;
        margin-bottom: 40px;
        overflow: hidden;
        position: relative;
        border: 4px solid;
        animation: color-transition 5s infinite alternate;
        background: linear-gradient(to bottom, #007acc, #254e5f);
        border-image-slice: 10;
    }

    video {
        width: 100%;
        max-height: 400px;
        object-fit: fill;
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



</style>
