import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable ,   EMPTY} from 'rxjs';
import { Persona } from '../model/persona';


//imposto la rotta primaria secondo il progetto
//in base a quello che ho scritto in eclipse rest-controller
const URL = "http://127.0.0.1:8080/api/"

/**
 * Rotte disponibili /all    ----> get
 *                  /delete  ---> delete
 *                  /insert -----> post
 * 
 * 
 */


@Injectable({
  providedIn: 'root'
})
export class DataManagerService {

  /*
    CREO UN OBJECT DI TIPO HttpClient
    mi serve per usare post- get -delete ecc
    lo chiamo http..posso chiamarlo come voglio

    private http: HttpClient
    è una variabile di classe (attributo)
    con private realizzo l'incapusulamento

    Ci pensa in automatico il costruttore
    a inizializzare l'object http.
  */
  constructor(private http: HttpClient) { }


  //realizzo i diversi metodi che sono le rotte

  public getAllPersone() : Observable<any> {

    const URL_GET = URL + "all"
    // la url finale e'
    // "http://127.0.0.1:8080/api/"  + all 
    //ovvero "http://127.0.0.1:8080/api/all

    /*
      la funzione http.get mi prende in input
      2 parametri :

      1) dove devo leggere i dati
      2) cosa mi aspetto di ottenere .. ovvero il tipo di risposta
         quindi un file di tipo json.

    */

    return this.http.get( URL_GET  , {responseType:"json"})
  }


  //funzione di delete

  public delete(id : number) : Observable<any> {
    //delete  ---> delete
    const URL_DELETE = URL + "delete" + "?id=" + id;
    // http://127.0.0.1:8080/delete?id=quelloCheVienePassato
    //Es 
    //http://127.0.0.1:8080/delete?id=5

    try {
      return this.http.delete(URL_DELETE );
    } catch(e){
      return EMPTY;
    }
    
  }

  /**
   * Prende in input una persona e ritorna un observable
   * fa una chiamata http di tipo post.
   * @param persona 
   * @returns 
   */
  public inserisciPersona(persona: Persona) : Observable<any>{

    /**
     * 
     *  stesso discorso di quando usavo
     * rested su firefox che dovevo
     * specificare gli headers con content-type:
     * application/json

     */
    const headers = new HttpHeaders()
    .append(
      'Content-Type',
      'application/json'
    );


    // ho creato prima una classe persona
    // che ha come attributi gli stessi di persona di java
    // oveero id nome cognome eta


    const URL_POST = URL + "insert";

    // chiede l'url come le altre ,e il tipo di request body di tipo persona
    // che ho definito in java con @RequestBody Persona persona in restController

    return this.http.post(URL_POST , persona , {
      headers: headers
    });

  }



}
