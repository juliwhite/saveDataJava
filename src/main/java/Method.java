import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Method {
    Vector vPrincipal = new Vector();

    // save data in a vector.
    public void Save(User user){
        vPrincipal.addElement(user);
    }

    // Save data in a file txt.
    public void SaveFile(User student){
        try{
            FileWriter fw = new FileWriter("Children.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(student.getName());
            pw.print("|" + student.getAge());
            pw.print("|" + student.getTalk()+ "\n");
            pw.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Function to show data in a table.
    public DefaultTableModel childList(){
        Vector headers = new Vector();
        headers.addElement("NAME");
        headers.addElement("AGE");
        headers.addElement("TALK");

        // This vector have Name, Age, and talk. Table. We add to this
        // table the vector above at position 0.
        DefaultTableModel tableList = new DefaultTableModel(headers, 0);

        try {
            FileReader fr = new FileReader("Children.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                StringTokenizer data = new StringTokenizer(line, "|");
                Vector x = new Vector();
                while (data.hasMoreTokens()){
                    x.addElement(data.nextToken());
                }
                tableList.addRow(x);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return tableList;
    }

    // method to select between a range of age.
    public void rangeAge (JComboBox age){
        age.removeAllItems();
        for(int i = 3; i < 12; i++){
            age.addItem(i);
        }
    }
}
