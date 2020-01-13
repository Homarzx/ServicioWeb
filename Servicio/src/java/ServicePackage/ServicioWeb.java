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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "comentar")
    public String comentar(@WebParam(name = "recursoID") String recursoID) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearRecurso")
    public Boolean crearRecurso(@WebParam(name = "Recurso") Recurso Recurso) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarRecurso")
    public String eliminarRecurso() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarLista")
    public String agregarLista(@WebParam(name = "videoID") String videoID) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarLista")
    public Boolean eliminarLista(@WebParam(name = "videoID") String videoID) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearCurso")
    public Boolean crearCurso(@WebParam(name = "Curso") Curso Curso) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarCurso")
    public Boolean eliminarCurso(@WebParam(name = "cursoID") String cursoID) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarComentario")
    public Boolean eliminarComentario(@WebParam(name = "comentarioID") String comentarioID) {
        //TODO write your implementation code here:
        return null;
    }
    
}
