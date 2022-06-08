package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;
import java.util.*;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private TextArea txtTime;
    
    @FXML
    private Button btnCanc;

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	String s=txtParola.getText();
    	elenco.addParola(s);
    	String s1="";
    	for(String r:elenco.getElenco()) {
    		s1=s1+r+"\n";
    	}
    	txtResult.setText(s1);
    	txtParola.clear();
    	txtTime.setText("tempo di esecuzione: "+System.nanoTime());
    }
    
    @FXML
    void Cancella(ActionEvent event) {
    	//String s=txtParola.getText(); 
    	// è corretto semplicemente cancellare la parole che inserisco nel box ma nel testo
    	// è richiesta la cancellazione di quella selezionata
    	String s=txtResult.getSelectedText();
    	elenco.removeParola(s);
    	String s1="";
    	for(String r:elenco.getElenco()) {
    		s1=s1+r+"\n";
    	}
    	txtResult.setText(s1);
    	txtParola.clear();
    	txtTime.setText("tempo di esecuzione (in millisecondi): "+System.nanoTime());
    	
    }

    
    
    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	txtResult.clear();
    	elenco.reset();
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
