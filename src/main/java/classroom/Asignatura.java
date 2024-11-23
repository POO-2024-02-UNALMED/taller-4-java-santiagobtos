package classroom;

public class Asignatura {

    public String nombre;
    String n = nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this.nombre="Sin nombre";
        this.tipo=Tipo.FUNDAMENTACION;
        this.codigoExterno=0;
        this.codigoInterno=0;
    }

    public Asignatura(int codigoInterno,Tipo tipo) {
        this.nombre="sin nombre";
        this.codigoInterno=codigoInterno;
        this.tipo=tipo;
        this.codigoExterno=codigoInterno;
    }

   
    

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo);
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno=codigoInterno;
    }

    
    public void cambiarDatos(){
        this.codigoExterno=50;
        this.codigoInterno=50;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
