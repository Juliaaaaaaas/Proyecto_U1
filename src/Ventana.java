import javax.swing.*;

public class Ventana extends JFrame {
   private JButton btns[];
    private JComboBox chamarras;
    private JRadioButton talla, chica,mediana,grande;
   private JCheckBox envio, carrito;
   private JTextArea pedido;
   private JButton extra, agregar, limpiar;
   
   private Container contenedor;
   
   public Ventana(){

        super("Tienda de Chamarras");
}
