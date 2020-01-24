package com.example.app;

import java.util.ArrayList;

public class Administrador {

    public static ArrayList<Usuario> usuarios;

    public static Usuario actual;

    public static void generarUsuarios(){
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("21","Homar Herrera","hfherrer@espol.edu.ec","homarzx","1234"));
        usuarios.add(new Usuario ("20"," Hilary Castillo", "hilarcast@espol.edu.ec","hilarix","1234"));
        usuarios.add(new Usuario ("19", "Jose Banos","josban@espol.edu.ec","josesito","1234"));
    }

    public static void actual(Usuario u){
        actual = u;
    }


}
