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
    private JButton btns[];
    private JLabel totalP;
    private int total=0;
   
   public Ventana(){
        super("Tienda de Chamarras");
      
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
    private void initEST() {
       
        panelEST = new JPanel();
        panelEST.setLayout(new BoxLayout(panelEST, BoxLayout.Y_AXIS));
        panelEST.setBorder(BorderFactory.createTitledBorder("RESUMEN DE CARRITO"));
        
        totalP = new JLabel("TOTAL A PAGAR: $" + total);
        totalP.setAlignmentX(Component.CENTER_ALIGNMENT); 
        totalP.setFont(new Font("Segoe UI", Font.BOLD, 25));
        totalP.setForeground(new Color(255, 105, 180)); 
    
    panelEST.add(totalP);
        String [] opciones ={"PAGAR TOTAL","LIMPIAR CARRITO"};
        for(String op:opciones){
            JButton btn = new JButton (op);
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
           
           btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (op.equals("LIMPIAR CARRITO")) {
                    total = 0; 
                    totalP.setText("TOTAL A PAGAR: $0");
                    }
                }
            });
            panelEST.add(btn);

        }
         panelEST.add(Box.createVerticalStrut(25));
        add(panelEST, BorderLayout.CENTER);
       
    }
