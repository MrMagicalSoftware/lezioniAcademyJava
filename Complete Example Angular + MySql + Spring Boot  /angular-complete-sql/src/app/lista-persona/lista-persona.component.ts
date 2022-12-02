import { Component, OnInit } from '@angular/core';
import { DataManagerService } from '../api/data-manager.service';
import { Persona } from '../model/persona';

@Component({
  selector: 'app-lista-persona',
  templateUrl: './lista-persona.component.html',
  styleUrls: ['./lista-persona.component.css']
})
export class ListaPersonaComponent implements OnInit {

  // mi creo un attributo vettore di persone
  vettPersona : Persona[];
  rispostaApi : string
  personaInviata : Persona //object che viene inviato
                          // per l'inserimento



  idDaEliminare : number // mi serve per la delete 
  // per capire cosa eliminare

  // mi creo l'object di tipo service ...
  constructor(private dataManager : DataManagerService) {
    this.vettPersona = [];
    this.personaInviata =  {} as Persona; //sintassi di init
    this.rispostaApi = "";
    this.idDaEliminare = -1;
  }

  ngOnInit(): void {

    console.log("on init")
    /**
     * 
     *  Se voglio che vengano
     * caricati in automico
     * metto il codice qui dentro:
     * 
     *  this.dataManager.getAllPersone().subscribe(
      data => {
        this.vettPersona = data;
      }, err => {
        this.vettPersona = [];
        // se ho un errore
        // posso fare anche altro
        //notificare che ho trovato un errore ecc
      }
    )
     * 
     * 
     */


  }


  fetchData(){
    console.log("ok")
    // chiamo la funzione di data-manager-service
    //con l'objetc dataManager
    this.dataManager.getAllPersone().subscribe(
      data => {
        this.vettPersona = data;
        this.rispostaApi ="ok ho scaricato i dati"
      }, err => {
        this.vettPersona = [];
        // se ho un errore
        // posso fare anche altro
        //notificare che ho trovato un errore ecc
        this.rispostaApi ="e' avvenuto un errore nel fetch dei dati "
      }
    )
  }


  elimina(){
    this.dataManager.delete(this.idDaEliminare).subscribe(
      data =>{

        this.rispostaApi = data ?  "ok ho eliminato" : "non ho eliminato"

      }, err =>{
        this.rispostaApi = "non ho eliminato e' avvenuto un errore"
      }
    )
  }




  insertData(){

    this.dataManager.inserisciPersona(this.personaInviata).
    subscribe(data => {

      if(data)
        this.rispostaApi = "OK HO INSERITO LA PERSONA";
      else
        this.rispostaApi = "Non posso inserire la persona";


    }, err =>{
      this.rispostaApi = "Non posso inserire la persona ERROR";
    })

  }


}
