package ies.accesodatos.empleados.services;


import ies.accesodatos.commons.services.ACommandService;
import ies.accesodatos.commons.services.Event;
import ies.accesodatos.empleados.model.Empleado;

public class EmpleadoCommandService extends ACommandService {

   
    public EmpleadoCommandService() {

    }

    public void add(Empleado item) {

        this.post("Alta empleado", Event.ACTION.ADD, item);
    }

    public void add(String nombre, String clave, String correo, boolean activo) {


        this.post("Alta empleado", Event.ACTION.ADD, "nuevo");
    }

    public void delete(Empleado empleado) {

        this.post("Alta empleado", Event.ACTION.ADD, empleado);
  }

    public void remove(int id) {

        this.post("Borrado empleado", Event.ACTION.DELETE, "borrado");
    }


    public void update(Empleado empleado) {

        this.post("Modificar empleado (total)", Event.ACTION.UPDATE, empleado);

    }

}
