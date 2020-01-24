package com.example.app;

import java.util.ArrayList;
import java.util.List;

public class MaterialDeterminado {

    public static int control = 0;

    public static List<Recurso> obtenerVideos(){
        List<Recurso> recursos = new ArrayList<>();
        if(control==0){
            recursos.add(new Recurso("https://www.youtube.com/watch?v=Iz08OTTjR04"));
            recursos.add(new Recurso("https://youtu.be/kdc94p9d5OE"));
            recursos.add(new Recurso("https://www.youtube.com/watch?v=DHbx0QfoR5U"));
            recursos.add(new Recurso("https://www.youtube.com/watch?v=tsMHONmUkvI"));
            recursos.add(new Recurso("https://www.youtube.com/watch?v=U3VSJhaC4kc"));
        }
        else if(control==1){
            recursos.add(new Recurso("https://youtu.be/k9TUPpGqYTo"));
            recursos.add(new Recurso("https://youtu.be/YYXdXT2l-Gg"));
            recursos.add(new Recurso("https://youtu.be/khKv-8q7YmY"));
        }
        else if(control ==2){
            recursos.add(new Recurso("https://youtu.be/pNjDkEmUbx4"));
            recursos.add(new Recurso("https://youtu.be/EwYGBhzfWBE"));
            recursos.add(new Recurso("https://youtu.be/tH-vWAQEeL8"));
        }
        else if(control == 3){
            recursos.add(new Recurso("https://youtu.be/tH-vWAQEeL8"));
            recursos.add(new Recurso("https://youtu.be/frDcZIs7E1k"));
            recursos.add(new Recurso("https://youtu.be/5xysV6_7SBM"));

        }



        return recursos;

    }
}
