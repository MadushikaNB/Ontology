import org.apache.jena.query.*;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.util.FileManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.InputStream;
import java.util.ArrayList;

public class Test {

    Model model;

    JButton byStarsButton;
    JButton byMarketButton;

    JComboBox mainCategoriesDropDown;
    JComboBox subCategoiresDropDown;

    JButton searchButton;

    JTextArea resultText;

    public static void main(String[] args) {
      // Test ex = new Test();
       BiryaniUI icu = new BiryaniUI();
       icu.setVisible(true);


    }


}
