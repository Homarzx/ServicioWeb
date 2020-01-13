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

/**
 *
 * @author homar
 */
public class Administrador {
    
    
    public static ArrayList<Usuario> obtenerUsuarios(){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("1","1234","homar",21,new LisFav()));
        return usuarios;
    }
    
    public static ArrayList<Curso> obtenerCurso(){
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Algebra12@","Algebra matricial",new LisFav()));
        return cursos;
    }
    
    public static ArrayList<Recurso> obtenerRecurso(){
        ArrayList<Recurso> recurso = new ArrayList<>();
        recurso.add(new Recurso("al21","algebra matricial video 1",new Date(),"https://github.com/Homarzx/ServicioWeb/commits/master"));
        return recurso;
    }
    
     public static ArrayList<LisFav> obtenerLF(){
        ArrayList<LisFav> lfs = new ArrayList<>();
        lfs.add(new LisFav("1245",new ArrayList<Recurso>()));
        return lfs;
    }
    
}
