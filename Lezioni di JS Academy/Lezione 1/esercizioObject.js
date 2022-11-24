


class Phone {

    constructor(marca , costo , isDualSim){
        this.marca = marca;
        this.costo = costo;
        this.isDualSim = isDualSim;
    }

}

// CREARE UN NUOVO OBJECT


var phone1 = new Phone("xijini", 60 , true);

console.log(phone1)

const magazzino = [];

for(let i = 0 ; i <= 10 ; i++)
    magazzino.push( new Phone("xijini " + i  , 30 + (Math.random() * 70)  , true)  )


console.log("#######################")
console.log(magazzino)


const cercaMaxPhone = (vett) => {

    let maxPhone = vett[0];

    for(let i = 1 ; i <= 10 ; i++){
        if(vett[i].costo > maxPhone.costo){
            maxPhone = vett[i];
        }
    }
    return maxPhone;
}


console.log("MAX PHONE")
console.log(        cercaMaxPhone(magazzino)             )



function somma(n1 , n2){
    return n1 +n2;
}

const somma = (n1 , n2)  => {
    return n1 + n2;
}