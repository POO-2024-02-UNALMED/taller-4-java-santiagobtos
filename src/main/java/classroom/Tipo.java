package classroom;

public enum Tipo {
	DISCIPLINAR(10,"disciplinar"),FUNDAMENTACION(20,"fundamenracion"),ELECTIVA(30,"electiva");
	
	private int codigo;
	private String nombre;
	Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
