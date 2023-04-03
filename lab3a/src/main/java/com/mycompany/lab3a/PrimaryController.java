package com.mycompany.lab3a;


import com.mycompany.lab3a.Osoba;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController {
    @FXML private TableColumn col_imie; 
    @FXML private TableColumn col_nazwisko;
    @FXML private TableColumn col_id;
    @FXML private TableView tabela; 
    @FXML private TextArea input1;
    @FXML private TextArea input2; 
    ObservableList<Osoba> lista=FXCollections.observableArrayList();
    
     @FXML public void dodajdolisty()
    {
     
    Osoba osoba=new Osoba(input1.getText(),input2.getText());
    lista.clear();
    lista.add(0, osoba);
    initialize();
    }
    
    @FXML public void initialize(){
    col_id.setCellValueFactory(
        new PropertyValueFactory<>("id"));
    col_imie.setCellValueFactory(
            new PropertyValueFactory<>("imie"));
    col_nazwisko.setCellValueFactory(
            new PropertyValueFactory<>("nazwisko"));
    
    
    //DODAWANIE ELEMENTU
   
    
    tabela.getItems().addAll(lista);
    
    TableViewSelectionModel<Osoba> selectionModel = tabela.getSelectionModel();
    selectionModel.setSelectionMode(SelectionMode.SINGLE);//Może być multiple
    ObservableList<Osoba> selectedItems = 
    selectionModel.getSelectedItems();
    
    
    
    
    
    
    
        selectedItems.addListener(
       new ListChangeListener<Osoba>() {
       @Override
       public void onChanged(
       ListChangeListener.Change<? extends Osoba> change) {
       Osoba os=change.getList().get(0);
       input1.setText(os.getImie());
       input2.setText(os.getNazwisko());
        }
        });

    
    }
    
   
    
    
 }

    
    
    
    
    
    
    
    
    

    
