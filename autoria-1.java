<p>const carros = [
    {
    marca: "Fiat",
    modelo: "Uno",
    cor: "Cinza",
    ano: 2016
},
{
    marca: "BMW",
    modelo: "320i",
    cor: "Branca",
    ano: 2014
},
{
    marca: "Chevrolet",
    modelo: "Cruze",
    cor: "Laranja",
    ano: 2011
},
{
    marca: "Lamborghini",
    modelo: "Uracan",
    cor: "Preta",
    ano: 2014
},
{
    marca: "Porshe",
    modelo: "Taycan Turbo S",
    cor: "Azul-bebe",
    ano: 2023
},
{
    marca: "Porshe",
    modelo: "Panamera Turbo S E-Hybrid",
    cor: "Preto Metalico",
    ano: 2023
},
{
    marca: "Ferrari",
    modelo: "Spider",
    cor: "Vermelha",
    ano: 2015
},
{
    marca: "Honda",
    modelo: "Civic type R",
    cor: "Branco",
    ano: 2023
},
{
    marca: "Mercedez Benz",
    modelo: "Cla-250",
    cor: "Vermelho vinho",
    ano: 2015
},
{
    marca: "Mercedez Amg",
    modelo: "a45",
    cor: "Branco metalico",
    ano: 2023
}
]
ano(2015)
function ano(ano){
for(i = 0; i < carros.length; i++){
    if(carros[i].ano == ano){
        console.log(carros[i])
    }
}
}</p>
