/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicePackage;

import Clases.Curso;
import Clases.LisFav;
import Clases.Usuario;
import java.util.ArrayList;

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
    
    
}
