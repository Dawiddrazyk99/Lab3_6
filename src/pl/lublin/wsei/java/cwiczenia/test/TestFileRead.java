/*package pl.lublin.wsei.java.cwiczenia.test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestFileRead {

        public static void main (String[] args) throws java.io.IOException;
        {
            try {
                String contents = new String(Files.readAllBytes(Paths.get(first:"gusInfoGraphic.xml")));
                System.out.println("Zawartość pliku gusInfoGraphic.xml");
                System.out.println(contents);
            }
        }

        catch(IOException e)
        {
            System.out.println(("Błąd wczytywania pliku gusInfoGraphic.xml => " + e.getLocalizedMessage()));
            e.printStackTrace();
        }
    }
}*/

package test;

import pl.lublin.wsei.java.cwiczenia.GusInfoGraphicList;
import pl.lublin.wsei.java.cwiczenia.Infografika;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TestGusInfoGraphicList {
    public static void main(String args) {
        GusInfoGraphicList list = new GusInfoGraphicList("gusInfoGraphic.xml");
        for(Infografika ig: list.infografiki) ig.print();
    }
}



