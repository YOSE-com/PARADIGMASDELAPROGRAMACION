package Empleados;

public class EmpleadoPermanente extends Empleado{
    private double sueldobase;
    private String afiliacion;

    public EmpleadoPermanente (String dni, String apellidos, String nombres, double sueldobase, String afiliacion){
        super (dni,apellidos,nombres);
        this.sueldobase=sueldobase;
        this.afiliacion=afiliacion;
    }

    public double getSueldobase() { return sueldobase; }
    public void setSueldobase (double sueldobase) {this.sueldobase=sueldobase;}
    public String getAfiliacion(){return afiliacion;}
    public void setAfiliacion (String afiliacion){this.afiliacion=afiliacion;}

    public double ingresos(){
        return getSueldobase();
    }
    public double descuentos(){
        if(getAfiliacion().equalsIgnoreCase("AFP"))
            return getSueldobase()*0.15;
        else return getSueldobase()*0.11;
    }
    public double bonificaciones (){
        return 0;
    }

    public String MostrarInfo(){
        return "EMPLEADO PERMANENTE: \n"+super.MostrarInfo();
    }
    //METODO PROPIO QUE RETORNA LA MOVILIDAD SEGUN SUS INGRESOS
    public double movilidad()
    { if (ingresos()<1000) return 50;
    else return 40;
    }
}

