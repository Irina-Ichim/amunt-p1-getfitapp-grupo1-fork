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
        animation: color-transition 5s infinite alternate;
        background: linear-gradient(to bottom, #00ff84, #254e5f);
        border-image: linear-gradient(to bottom, #00ff84, #254e5f) 1;
        border-image-slice: 10;
    }

    video {
        width: 100%;
        max-height: 400px;
        object-fit: fill;
    }

    @keyframes color-transition {
        0% {
            background: linear-gradient(to bottom, #00ff84, #254e5f);
            border-image: linear-gradient(to bottom, #00ff84, #254e5f) 1;
        }
        50% {
            background: linear-gradient(to bottom, #254e5f, #00ff84);
            border-image: linear-gradient(to bottom, #254e5f, #00ff84) 1;
        }
        100% {
            background: linear-gradient(to bottom, #00ff84, #254e5f);
            border-image: linear-gradient(to bottom, #00ff84, #254e5f) 1;
        }
    }


</style>
