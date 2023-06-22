<script>
    export let src;
    export let controls = true;
</script>

<div>
    <video id="myvideo" src={src} {controls}></video>
</div>


<style>
    div {
        width: 100%;
        margin-bottom: 40px;
        overflow: hidden;
        position: relative;
        border: 4px solid;
        animation: gradient-animation 5s linear infinite;

    }

    video {
        width: 100%;
        max-height: 400px;
        object-fit: fill;
    }

    @keyframes gradient-animation {
        0% {
            border-image: linear-gradient(to right, #87ceeb, #87ceeb) 1;
            border-image-slice: 1;
        }
        100% {
            border-image: linear-gradient(to right, #87ceeb, #00ff84) 1;
            border-image-slice: 1;
        }
    }


</style>
