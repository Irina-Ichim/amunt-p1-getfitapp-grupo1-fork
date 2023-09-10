<footer>
    <section>
        <h2>Barcelona</h2>
        <p>Passeig de Gràcia</p>
        <p>n.º80</p>
        <p>08008</p>
    </section>
    <section>
        <h2>Madrid</h2>
        <p>Paseo De La Castellana</p>
        <p>n.º41</p>
        <p>28046</p>
    </section>
</footer>

<style>
    footer {
        display: grid;
        grid-template-columns: repeat(2, 1fr);
        justify-content: center;
       background: linear-gradient(to bottom, #007acc, #254e5f);
        animation: color-transition 5s infinite alternate;
        color: #ffffff;
    }

    section {
        text-align: center;
    }

    section h2 {
        font-size: 24px;
        margin-bottom: 10px;
    }

    section p {
        font-size: 16px;
        margin: 0;
    }
   
</style>
