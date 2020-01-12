/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicePackage;

import Clases.Curso;
import Clases.Recurso;
import Clases.Usuario;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author homar
 */
@WebService(serviceName = "ServicioWeb")
public class ServicioWeb {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "accederCuenta")
    public Boolean accederCuenta(@WebParam(name = "id") String id, @WebParam(name = "password") String password) {
        for(Usuario u : Administrador.obtenerUsuarios()){
            if(u.getId().equalsIgnoreCase(id) && u.getPassword().equals(password)){
              return true;  
            }
        }
            
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verCurso")
    public ArrayList<Curso> verCurso() {
        
        return Administrador.obtenerCurso();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerRecurso")
    public Recurso obtenerRecurso(@WebParam(name = "id") String id) {
        for(Recurso r: Administrador.obtenerRecurso()){
            if(r.getId().equals(id)){
                return r;
            }
        }
        return null;
    }
    
}
