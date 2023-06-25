<script>
    import Calendario from "../components/Calendario.svelte";
    import Clases from "../components/Clases.svelte";
</script>
<main>
<div class="dia">
    <Calendario dia="LUNES"/>
    <div class="clases-diarias">
        <Clases hora="19h-20h" nombre="BOXEO 19-20h" instructor="INSTRUCTOR: AARON HUGHES" sede="SEDE: Madrid"/>
        <Clases hora="19h-20h" nombre="PILATES 19-20h" instructor="INSTRUCTORA: NICOLE WINTER" sede="SEDE: Barcelona"/>
    </div>
</div>
<hr>
<div class="dia">
    <Calendario dia="MARTES"/>
    <div class="clases-diarias">
        <Clases hora="16h-19h" nombre="YOGA 16-19h" instructor="INSTRUCTORA: ALIYAH WILLIAMS" sede="SEDE:Madrid"/>
        <Clases hora="19h-20h" nombre="CARDIO 19-20h" instructor="INSTRUCTORA: NICOLE WINTER" sede="SEDE: Barcelona"/>
    </div>
</div>
<hr>
<div class="dia">
    <Calendario dia="MIERCOLES"/>
    <div class="clases-diarias">
        <Clases hora="16h-19h" nombre="GAP 16-19h" instructor="INSTRUCTORA: NICOLE WINTER" sede="SEDE:Madrid"/>
        <Clases hora="19h-20h" nombre="ZUMBA 19-20h" instructor="INSTRUCTORA: TESHIA MILLER" sede="SEDE: Barcelona"/>
    </div>
</div>
<hr>
<div class="dia">
    <Calendario dia="JUEVES"/>
    <div class="clases-diarias">
        <Clases hora="16h-19h" nombre="CARDIO 16-19h" instructor="INSTRUCTOR: OMAR HARRIS" sede="Madrid"/>
        <Clases hora="19h-20h" nombre="BOXEO 19-20h" instructor="INSTRUCTORA: TESHIA MILLER" sede="SEDE:Barcelona"/>
    </div>
</div>
<hr>
<div class="dia">
    <Calendario dia="VIERNES"/>
    <div class="clases-diarias">
        <Clases hora="16h-19h" nombre="ZUMBA 16-19h" instructor="INSTRUCTOR: OMAR HARRIS" sede="Madrid"/>
        <Clases hora="19h-20h" nombre="BOXEO 19-20h" instructor="INSTRUCTORA: Minerva" sede="SEDE: Barcelona"/>
    </div>
</div>
<hr>
<div class="dia">
    <Calendario dia="SABADO"/>
    <div class="clases-diarias">
        <Clases hora="16h-19h" nombre="YOGA 16-19h" instructor="INSTRUCTOR: OMAR HARRIS" sede="Madrid"/>
        <Clases hora="19h-20h" nombre="BOXEO 19-20h" instructor="INSTRUCTORA: TESHIA MILLER" sede="SEDE: Barcelona"/>
    </div>
</div>
<hr>
<div class="dia">
    <Calendario dia="DOMINGO"/>
    <div class="clases-diarias">
        <Clases hora="16h-19h" nombre="CARDIO 16-19h" instructor="INSTRUCTOR: OMAR HARRIS" sede="Madrid"/>
        <Clases hora="19h-20h" nombre="BOXEO 19-20h" instructor="INSTRUCTORA: NICOLE WINTER" sede="SEDE: Barcelona"/>
    </div>
</div>
</main>

<style>

    main{
        background: linear-gradient(to bottom, #00ff84, #254e5f);
        animation: color-transition 5s infinite alternate;
    }
    @keyframes color-transition {
        0% {
            background: linear-gradient(to bottom, #00ff84, #254e5f);
        }
        50% {
            background: linear-gradient(to bottom, #254e5f, #00ff84);
        }
        100% {
            background: linear-gradient(to bottom, #00ff84, #254e5f);
        }
    }

    .dia {
        margin-top:40px;
        margin-bottom: 40px;
        display: flex;
        width: 100%;
        height: 200px;
        text-align: center;
    }
    .clases-diarias {
        margin-left: auto;
    }
</style>