package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public Button btnMain;
    public TextField txtWysokosc;
    public TextField txtPromien;
    public TextField txtGrubosc;

    public void onBtnAction(ActionEvent actionEvent) {
        txtWysokosc.getText();
        String Wysokosc =  txtWysokosc.getText();
        int wysokosc1=Integer.parseInt(Wysokosc); //Zmiana string na int wysokości

        txtPromien.getText();
        String Promien =  txtPromien.getText();
        int Promien1=Integer.parseInt(Promien);   //Zmiana string na int promienia

        txtGrubosc.getText();
        String Grubosc =  txtGrubosc.getText();
        int Grubosc1=Integer.parseInt(Grubosc);   //Zmiana string na int grubości blachy

        System.out.print("Objetosc walca wynosi: ");
        double obj = ((3.14wysokosc1)((Grubosc1Grubosc1)-(Promien1Promien1)));
        System.out.print(obj); //Objetosc


        System.out.print("\nWynik ciezaru dla blachy stalowej: ");
        double ciezarstalowej = 7.9obj ;
        System.out.print(ciezarstalowej);
        System.out.print("\nWynik ceny dla blachy stalowej: ");
        System.out.print(2.9ciezarstalowej);

        System.out.print("\nWynik ciezaru dla blachy stalowej nierdzewnej: ");
        double ciezarnierdzewnej = 8obj;
        System.out.print(ciezarnierdzewnej);
        System.out.print("\nWynik ceny dla blachy stalowej nierdzewnej: ");
        System.out.print(3.5ciezarnierdzewnej);
    }
}
