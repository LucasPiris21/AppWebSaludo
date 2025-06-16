// Saludo
document.getElementById('saludoForm').addEventListener('submit', function(e) {
    e.preventDefault();
    const nombre = document.getElementById('nombre').value;
    const apellido = document.getElementById('apellido').value;
    fetch(`/holamundo?nombre=${encodeURIComponent(nombre)}&apellido=${encodeURIComponent(apellido)}`)
        .then(res => res.text())
        .then(html => {
            document.getElementById('saludoResultado').innerHTML = html;
            document.getElementById('opciones').style.display = "block";
        });
});

document.getElementById('opcionesForm').addEventListener('submit', (e) => {
    e.preventDefault();
    document.getElementById('rectanguloForm').style.display = 'none';
    document.getElementById('triRecForm').style.display = 'none';
    document.getElementById('circuloForm').style.display = 'none';
    document.getElementById('rectangulo-resultados').style = 'none';
    document.getElementById('triRec-resultados').style = 'none';
    document.getElementById('circulo-resultados').style = 'none';
    document.getElementById('resultados').style = 'none';

    document.getElementById('dimensiones').style.display = 'block'
    const figura = document.getElementById('figura').value;
    console.log(figura);
    switch (figura) {
        case 'Rectangulo':
            document.getElementById('rectanguloForm').style.display = 'block';
            break;
        case 'Triangulo Rectangulo':
            document.getElementById('triRecForm').style.display = 'block';
            break;
        case 'Circulo':
            document.getElementById('circuloForm').style.display = 'block';
            break;
        default:
            break;
    }
})

document.getElementById('rectanguloForm').addEventListener('submit', (e) => {
    e.preventDefault();
    document.getElementById('resultados').style.display = 'block';
    const base = document.getElementById('base').value;
    const altura = document.getElementById('altura').value;
    fetch(`/rectangulo?base=${encodeURIComponent(base)}&altura=${encodeURIComponent(altura)}`)
        .then(res => res.text())
        .then(html => {
            document.getElementById('rectangulo-resultados').style.display = 'block';
            document.getElementById('rectangulo-resultados').innerHTML = html;
        })
} )

document.getElementById('triRecForm').addEventListener('submit', (e) => {
    e.preventDefault();
    document.getElementById('resultados').style.display = 'block';
    const base = document.getElementById('base').value;
    const altura = document.getElementById('altura').value;
    fetch(`/triangulorectangulo?base=${encodeURIComponent(base)}&altura=${encodeURIComponent(altura)}`)
        .then(res => res.text())
        .then(html => {
            document.getElementById('triRec-resultados').style.display = 'block';
            document.getElementById('triRec-resultados').innerHTML = html;
        })
})

document.getElementById('circuloForm').addEventListener('submit', (e) => {
    e.preventDefault();
    document.getElementById('resultados').style.display = 'block';
    const radio = document.getElementById('radio').value;
    fetch(`/circulo?radio=${encodeURIComponent(radio)}`)
        .then(res => res.text())
        .then(html => {
            document.getElementById('circulo-resultados').style.display = 'block';
            document.getElementById('circulo-resultados').innerHTML = html;
        })
})
// Área, perímetro e hipotenusa
// document.getElementById('areaForm').addEventListener('submit', function(e) {
//     e.preventDefault();
//     const base = document.getElementById('base').value;
//     const altura = document.getElementById('altura').value;
//     const radio = document.getElementById('radio').value;
//     let url = `/area?base=${encodeURIComponent(base)}&altura=${encodeURIComponent(altura)}`;
//     if (radio) {
//         url += `&radio=${encodeURIComponent(radio)}`;
//     }
//     fetch(url)
//         .then(res => res.text())
//         .then(html => {
//             document.getElementById('areaResultado').innerHTML = html;
//         });
// });