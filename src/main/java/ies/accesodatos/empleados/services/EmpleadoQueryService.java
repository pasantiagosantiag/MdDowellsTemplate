package ies.accesodatos.empleados.services;




import ies.accesodatos.empleados.model.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoQueryService {


    public EmpleadoQueryService() {

    }
    public List<Empleado> getAll() {
      return new ArrayList<Empleado>();
    }
    public Empleado getById(int id) {
        var item=new Empleado();
        return item;
    }
}
