package com.seccion4.respo4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seccion4.respo4.model.Persona;


@Repository
public class PersonaRepository {
   private List<Persona> personas=new ArrayList<>();

   PersonaRepository(){
    
        // Agregar las personas a la lista
        personas.add(new Persona(1, "12345678-9", "Wacoldo", "Soto", 45));
        personas.add(new Persona(2, "23456789-0", "Ana", "Gómez", 34));
        personas.add(new Persona(3, "34567890-1", "Carlos", "Pérez", 29));
        personas.add(new Persona(4, "45678901-2", "Lucía", "Martínez", 38));
        personas.add(new Persona(5, "56789012-3", "Juan", "Rodríguez", 50));
   }

    public Persona create(Persona persona){
        personas.add(persona);
        System.out.println(personas.toString());
        return persona;
    }


    public List<Persona> readAll(){
        return personas;
    }

    public Persona read(int id){
        for (Persona persona : personas) {
            if(persona.getId()==id){
                return persona;
            }
        }
        return null;

    }

    public Persona readxRut(String rut) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'readxRut'");
        for (Persona persona : personas) {
            if(persona.getRut().equals(rut))
            {
                return persona;
            }
        }

        return null;

    }


    public Persona update(int id, Persona persona){
        Persona modi=this.read(id);
        if (modi!=null) {
            //no va el rut ni id para evitar errores de inconsistencia de datos
            modi.setNombre(persona.getNombre());
            modi.setApellido(persona.getApellido());
            modi.setEdad(persona.getEdad());
            return persona;
        }

        return null;
       

    }

    public String delete(int id) {
        if(personas.removeIf(kill->kill.getId()==id))
        {
            return "Persona eliminada";
        }
        
        return null;
    }
}
