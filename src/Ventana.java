import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Ventana extends JFrame {
   private Container contenedor;
   private JPanel panelNOR;
   
   public Ventana(){
        super("Tienda de Chamarras");
      initNOR();

      
      JPanel tienda = new JPanel();
        tienda.setLayout(new GridLayout(6,1));
      
      tienda.add(prenda("Chamarra de Cuero", 300));
        tienda.add(prenda("Chamarra de mezclilla",200));
        tienda.add(prenda("Chamarra de Gamuza",500));
      tienda.add(prenda("Chamarra de poliester", 250));
        tienda.add(prenda("Chaqueta Deportiva",280));
        tienda.add(prenda("Chamarra de Nylon",230));
      
      add(shopping,BorderLayout.WEST);
}
   
   private void initNOR() {
       panelNOR = new JPanel(new BorderLayout());
        panelNOR.setBorder(BorderFactory.createTitledBorder("SUDADERAS"));
        panelNOR.add(new JLabel("TIENDA DE SUDADERAS",
                SwingConstants.CENTER), BorderLayout.CENTER);
        add(panelNOR, BorderLayout.NORTH);
    }
   
   public void pagar(){

        if(total == 0){
            JOptionPane.showMessageDialog(this,"El carrito está vacío, seleccione alguna prenda");
        }else{
            JOptionPane.showMessageDialog(this,"Pagado");
            limpiar();
         }
   }
    public void limpiar(){

        carrito.setText("");
        total = 0;
        totalDin.setText("Total: $0");
    
    }
   
