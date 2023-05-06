package modelo;

public class PlanTelefonia
{
    // Atributos

    private int numeroCelular;
    private String operador;
    private int cantidadMinutos;
    private double valorMinuto;
    private double costoPlan;

    // Metodos

    public PlanTelefonia()
    {

    }

    public PlanTelefonia(int pNumeroCelular, String pOperador, int pCantidadMinutos)
    {
        this.numeroCelular = pNumeroCelular;
        this.operador = pOperador;
        this.cantidadMinutos = pCantidadMinutos;
    }

    public void setNumeroCelular(int numeroCelular)
    {
        this.numeroCelular = numeroCelular;
    }
    
    public void setOperador(String operador)
    {
        this.operador = operador;
    }
    
    public void setCantidadMinutos(int cantidadMinutos)
    {
        this.cantidadMinutos = cantidadMinutos;
    }
    
    public void setCostoPlan(double costoPlan)
    {
        this.costoPlan = costoPlan;
    }



    public int getNumeroCelular() 
    {
        return numeroCelular;
    }

    public String getOperador() 
    {
        return operador;
    }

    public int getCantidadMinutos() 
    {
        return cantidadMinutos;
    }

    public double getCostoPlan() 
    {
        return costoPlan;
    }


    public double calcularCostoPlan()
    {
        valorMinuto = 250;
        costoPlan = cantidadMinutos * valorMinuto;

        if(operador == "Wom")
        {
            costoPlan *= 0.5;
        }

        return costoPlan;
    }
}