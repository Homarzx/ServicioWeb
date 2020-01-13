/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicePackage;

import Clases.Curso;
import Clases.LisFav;
import Clases.Recurso;
import Clases.Usuario;
import java.util.ArrayList;
import java.util.Date;
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
    @WebMethod(operationName = "eliminarRecurso")
    public Boolean eliminarRecurso(@WebParam(name = "recurso") String id) {
        for(Recurso r: Administrador.obtenerRecurso()){
            if(r.getId().equals(id)){
                Administrador.obtenerCurso().remove(r);
            }
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarLista")
    public Boolean agregarLista(@WebParam(name = "recursoID") String recursoID,@WebParam(name = "lisFavID") String lisFavID) {
        Recurso rcs = null;
        for(Recurso r: Administrador.obtenerRecurso()){
            if(r.getId().equals(recursoID)){
                rcs = r;
            }
        }
       
        for(LisFav lf : Administrador.obtenerLF()){
           if(lf.getId().equals(lisFavID) && rcs!=null){
                lf.agregarRecurso(rcs);
                return true;
           }
       }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarLista")
    public Boolean eliminarLista(@WebParam(name = "lisFavID") String lisFavID) {
       for(LisFav lf : Administrador.obtenerLF()){
           if(lf.getId().equals(lisFavID)){
                Administrador.obtenerRecurso().remove(lf);
                return true;
           }
       }
       return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearRecurso")
    public Boolean crearRecurso(@WebParam(name = "id") String id,@WebParam(name = "nombre") String nombre,@WebParam(name = "url") String url) {
        Recurso r = new Recurso(id,nombre, new Date(), url);
        Administrador.obtenerRecurso().add(r);
        return true;
    }

    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearCurso")
    public Boolean crearCurso(@WebParam(name = "id") String id,@WebParam(name = "nombre") String nombre) {
        Administrador.obtenerCurso().add(new Curso(id,nombre,new LisFav()));
        return true;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarCurso")
    public Boolean eliminarCurso(@WebParam(name = "cursoID") String cursoID) {
        for(Curso r: Administrador.obtenerCurso()){
            if(r.getId().equals(cursoID)){
                Administrador.obtenerCurso().remove(r);
                return true;
            }
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarComentario")
     public Boolean eliminarComentario(@WebParam(name = "recursoID") String recursoID, @WebParam(name = "comentarioID") String comentarioID) {
        for (Recurso re: Administrador.obtenerRecurso()){
            if(re.getId().equals(recursoID)){
                re.removerComentario(comentarioID);
                return true;
            }
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "comentar")
    public Boolean comentar(@WebParam(name = "recursoID") String recursoID, @WebParam(name = "comentario") String comentario) {
        for (Recurso re: Administrador.obtenerRecurso()){
            if(re.getId().equals(recursoID)){
                re.agregarComentario(comentario);
                return true;
            }
        }
        return false;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerLisFav")
    public LisFav obtenerLisFav(@WebParam(name = "lisFavID") String lisFavID) {
        //TODO write your implementation code here:
        return null;
    }
    
    @WebMethod(operationName = "verLista")
    public ArrayList<LisFav> verLista() {
        return Administrador.obtenerLF();
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "verRecurso")
    public ArrayList<Recurso> verRecurso() {
        return Administrador.obtenerRecurso();
    }
}
