package saveData;

import Domain.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FileData {

    Vector vPincipal = new Vector();

    public void saveContact(User person) {
        vPincipal.addElement(person);
    }
    //save in file .txt

    public void saveFile(User user) {
        try {
            FileWriter filewriter = new FileWriter("People.txt", true);
            BufferedWriter bufferwriter = new BufferedWriter(filewriter);
            PrintWriter printwriter = new PrintWriter(bufferwriter);
            printwriter.print(user.getName());
            printwriter.print(" | " + user.getUserName());
            printwriter.print(" | " + user.getAdress());
            printwriter.print(" | " + user.getEmail());
            printwriter.print(" | " + user.getPassword());
            printwriter.print(" | " + user.getPhoneNumber());
            printwriter.print(" | " + user.getPaymentMethod());
            printwriter.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //show data on table
    public DefaultTableModel listPeople() {
        Vector space = new Vector();
        space.addElement("Name");
        space.addElement("UserName");
        space.addElement("Adress");
        space.addElement("Email");
        space.addElement("Password");
        space.addElement("PhoneNumber");
        space.addElement("PaymentMethod");
        
        //create vector with the varibles
        //create table model for add vector on 0 space
        DefaultTableModel modelTable = new DefaultTableModel(space, 0);
        
        try{
            FileReader filereader = new FileReader("People.txt");
            BufferedReader buffreader = new BufferedReader(filereader);
            String aux;
            while((aux=buffreader.readLine())!=null){
                StringTokenizer data = new StringTokenizer(aux," | ");
                Vector auxVec = new Vector();
                while(data.hasMoreTokens()){
                   auxVec.addElement(data.nextToken());
                }
               modelTable.addRow(auxVec);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);// esperar a hacer la clase de excepciones
        }
        return modelTable;
    }

}