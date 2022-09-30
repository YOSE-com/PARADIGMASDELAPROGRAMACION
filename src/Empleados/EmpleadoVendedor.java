package Empleados;

public class  EmpleadoVendedor extends Empleado {
    private double montovend;
    private double tasacomision;


    public EmpleadoVendedor (String RFC, String apellidos, String nombres, double montovend, double tasacomision){
        super(RFC,nombres, apellidos);
        this.montovend= montovend;
        this.tasacomision=tasacomision;
    }

    public double getMontovend() {
        return montovend;
    }

    public void setMontovend(double montovend) {
        this.montovend = montovend;
    }

    public double getTasacomision() {
        return tasacomision;
    }

    public void setTasacomision(double tasacomision) {
        this.tasacomision = tasacomision;
    }
    public double ingresos(){
        return getMontovend()*getTasacomision();
    }@Override
    public double bonificaciones(){
        if (getMontovend()<1000){
            return 0;

        }
        else if (getMontovend()<5000& getMontovend()>1000){
            return  ingresos()*0.5;

        }else{
            return  ingresos()*0.10;
        }

        public double descuentos(){
            if (ingresos()<1000){
                return ingresos()*0.11;
            }else {
                return ingresos()*0.15;
            }
        }
        public String MostrarInfo(){
            return "Empleado Vendedor \n "+super.MostrarInfo();
        }
    }


}
