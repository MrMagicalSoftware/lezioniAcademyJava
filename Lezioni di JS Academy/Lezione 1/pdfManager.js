const PDFDocument = require('pdfkit');
const fs = require('fs');


class PDFManager {

    constructor(nomePdf){
        this.nomePdf = nomePdf;
        this.doc = new PDFDocument();
    }

    addLink(link , nomeLink){
        this.doc
        .fillColor('blue')
        .text(nomeLink)
        .underline(100, 100, 160, 27, { color: '#0000FF' })
        .link(100, 100, 160, 27, link);
    }

    addImage(pathImage){
        this.doc.image(pathImage, {
            fit: [250, 300],
            align: 'center',
            valign: 'center'
          });
    }

    addText(text){
        this.doc.text(text);
        
    }

    close(){
        this.doc.end();
    }

    generaPdf(){
        this.doc.pipe(fs.createWriteStream(this.nomePdf +'.pdf'));
    }

}


var pdf = new PDFManager("archivio");
pdf.generaPdf();
pdf.addText("ecco un primo testo");
pdf.addText("ecco un secondo testo");
pdf.addImage("mago.png")
pdf.addLink("http://chess.com" , "play the game")
pdf.close();





