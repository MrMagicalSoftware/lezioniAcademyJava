console.log("CIAO A TUTTI!")

//tipi di dato .

/**
 * 
 * Commento multilinea
 * numeric
 * 
 */


var myData = 10;
var myName = "Rob";

console.log(myData + " " + myName)


//Come si dichiarano variabili
/**
 * 
 * Usando la keyword let oppure
 * la keyword var.
 * 
 * 
 */

var somma , differenza , moltiplicazione;

console.log(10**2) // significa 10 alla seconda

console.log(10 % 2)


var persona = {
    id:1,
    name:"Rob",
    programming : "JAVASCRIPT"
}

console.log("########################")

console.log(persona)

console.log("########################")


const user = {
    firstName: "Angela",
    lastName: "Davis",
    role: "Professor",
}


console.log(user.role)

//Come creare un vettore


const myVett = [1 , 2 , "rob" , true , { targa :"bb32131" , modello : "alfa"} , user ];

console.log("");
console.log("ELMENTI DEL VETTORE \n\n\n");

for(let i = 0 ; i < myVett.length ; i++){
    console.log(myVett[i] + " " +  typeof( myVett[i]  )       );
}

