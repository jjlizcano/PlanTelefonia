package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    // Atributos
    private JComboBox cbOperadores;
    private JLabel lbOperadores;
    private JLabel lbNumeroCelular;
    private JTextField tfNumeroCelular;


    // Métodos
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        
        //Crear y agregar combo lista Empleados
        cbOperadores = new JComboBox();
        cbOperadores.setBounds(190,30,100,20);
        this.add(cbOperadores);
        cbOperadores.addItem("Claro");
        cbOperadores.addItem("Movistar");
        cbOperadores.addItem("Tigo");
        cbOperadores.addItem("Wom");

        //Crear y agregar etiqueta Operadores
        lbOperadores = new JLabel("Operadores: ", JLabel.RIGHT);
        lbOperadores.setBounds(0,30,180,20);
        this.add(lbOperadores);

        //Crear y agregar etiqueta NumeroCelular
        lbNumeroCelular = new JLabel("Número de celular: ", JLabel.RIGHT);
        lbNumeroCelular.setBounds(0,60,180,20);
        this.add(lbNumeroCelular);

        // Crear y agregar campos de texto
        tfNumeroCelular = new JTextField("");
        tfNumeroCelular.setBounds(190, 60, 80, 20);
        add(tfNumeroCelular);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    // Métodos de acceso
    public String getOperador()
    {
        return (String) cbOperadores.getSelectedItem();
    }
}
