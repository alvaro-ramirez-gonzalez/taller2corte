
import java.util.ArrayList;
import java.util.List;


class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}


class Coche extends Vehiculo {
    public void tocarBocina() {
        System.out.println("El coche toca la bocina.");
    }
}



interface Volador {
    void volar();
}


class Avion implements Volador {
    @Override
    public void volar() {
        System.out.println("El avión está volando.");
    }
}

class Motor {
    public void encender() {
        System.out.println("El motor se enciende.");
    }
}


class Auto {
    public void arrancar() {
        Motor motor = new Motor(); // Dependencia
        motor.encender();
        System.out.println("El auto está en marcha.");
    }
}


class Rueda {
    public void girar() {
        System.out.println("La rueda gira.");
    }
}


class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;

    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
    }

    public void mover() {
        ruedaDelantera.girar();
        ruedaTrasera.girar();
        System.out.println("La bicicleta se mueve.");
    }
}



class Habitacion {
    public void limpiar() {
        System.out.println("La habitación se está limpiando.");
    }
}

// Clase Casa que tiene Habitaciones (composición)
class Casa {
    private Habitacion habitacion;

    public Casa() {
        this.habitacion = new Habitacion(); // Casa controla la vida de Habitacion
    }

    public void mantener() {
        habitacion.limpiar();
        System.out.println("La casa está siendo mantenida.");
    }
}



class Profesor {
    private String nombre;
    private Curso curso; 

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}


class Curso {
    private String nombre;
    private Profesor profesor; 

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    String getombre() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}



class Curso {
    private String nombre;

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}


class Registro {
    private Estudiante estudiante;
    private Curso curso;

    public Registro(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public void mostrarRegistro() {
        System.out.println(estudiante.getNombre() + " está inscrito en " + curso.getombre());
    }
}


class Empresa {
    private List<Empleado> empleados = new ArrayList<>();

    public void contratar(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre());
        }
    }
}


class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}