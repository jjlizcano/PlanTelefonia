package controlador;

import modelo.PlanTelefonia;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{

    //Atributos

    private VentanaPrincipal venPrin;
    private PlanTelefonia plan;

    //Metodos
    public Controlador(VentanaPrincipal pVenPrin, PlanTelefonia pPlan)
    {
        this.venPrin = pVenPrin;
        this.plan = pPlan;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("App lista para usar... \nSe han creado los siguientes tipos de objetos: \nVentanaPrincipal\nPlanTelefonia\nControlador");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana calcularPlan
        if(comando.equals("calcularPlan"))
        {
            String operador = venPrin.miPanelEntradaDatos.getOperador();
        }

        //Salir
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}