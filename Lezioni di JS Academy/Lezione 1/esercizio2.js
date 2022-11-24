function somma(numero1 , numero2){
    return numero1 + numero2;
}

console.log(somma(6 , 3))
console.log(somma("CIAO" , "ROB"))
console.log(somma("CIAO" , 10))

//creare una funzione prenda
//in input un numero e
//stampi a video tutti i numeri
//da 0 fino al numero.
// 4
// 0 1 2 3 4 

/**
 * Funzione che controlla se
 * posso proseguire.
 * 
 * @param {*} nmeroUtente 
 * @returns 
 */
function check(numeroUtente){
    if(isNaN(numeroUtente))
        return  false;
    else
        return true;
}


function listaNumeri(numero) {

    if(isNaN(numero)){
        console.log("Non posso proseguire")
        return ;
    }
        
    var index = 0 ;
    while(index <= numero){
        console.log(index);
        index++;
    }
}

function showNumber(numeroUtente){

    // se non passo il check
    if( ! check(numeroUtente)  ){
        return "Non posso proseguire";
    }

    var displayNumber = "";

    for(let i = 0 ; i <= numeroUtente ;i++){
        displayNumber += i + " ";
    }

    return displayNumber;

}
console.log(  showNumber("10")   );


// arrow function
var mySomma = (n1 , n2) => {
    return n1 + n2
}

var helloWord = () => {
    console.log("ciaoa tutti")
}


console.log(mySomma(4, 3))

helloWord()

/**
 * 
 * https://www.javatpoint.com/javascript-tutorial
 * 
 * 
 * 
 * 
 * 
 * 
 */


