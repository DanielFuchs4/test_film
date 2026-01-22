package com.example.test_film;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label nenalezenLabel;

    @FXML
    private TextField nazevTextField, reziserTextField, rokVydaniTextField, hledaniNazvuTextField;

    @FXML
    private ListView<Film> filmListView;

    @FXML
    private Button pridatButton;

    @FXML
    protected void initialize() {
        filmListView.getItems().add(new Film("Auta", "Josef", 2008));
    }

    @FXML
    protected void onpridatButtonClick() {
    try{
        Film film = new Film(nazevTextField.getText(), reziserTextField.getText(),Integer.valueOf(rokVydaniTextField.getText()));
        filmListView.getItems().add(film);
        nazevTextField.clear();
        reziserTextField.clear();
        rokVydaniTextField.clear();
    } catch(Exception e){

    }
    }

    @FXML
    protected void getSelectedFilm() {
        Film film = filmListView.getSelectionModel().getSelectedItem();
        nazevTextField.setText(film.getNazev());
        reziserTextField.setText(film.getReziser());
        rokVydaniTextField.setText(String.valueOf(film.getRokVydani()));
    }

    @FXML
    protected void onnajitButtonClick() {
        String hledani = hledaniNazvuTextField.getText().trim().toLowerCase();
        for(int i = 0; i<filmListView.getItems().size(); i++){
            if(filmListView.getItems().get(i).getNazev().trim().toLowerCase().equals(hledani)){
                nazevTextField.setText(filmListView.getItems().get(i).getNazev());
                reziserTextField.setText(filmListView.getItems().get(i).getReziser());
                rokVydaniTextField.setText(String.valueOf(filmListView.getItems().get(i).getRokVydani()));
            }
            else {
                nenalezenLabel.setText("Film nebyl nalezen.");
            }
        }
    }











}
