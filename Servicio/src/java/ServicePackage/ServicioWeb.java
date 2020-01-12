/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicePackage;

import Clases.Usuario;
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
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

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
}
