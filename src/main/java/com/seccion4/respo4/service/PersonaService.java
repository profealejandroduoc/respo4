package com.seccion4.respo4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seccion4.respo4.model.Persona;
import com.seccion4.respo4.repository.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona guardarPersona(Persona persona){
        return personaRepository.create(persona);
    }

    public List<Persona> listarPersonas(){
        return personaRepository.readAll();
    }


    public Persona buscarxId(int id){
        return personaRepository.read(id);
    }

    public Persona buscarxrut(String rut) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'buscarxrut'");
        return personaRepository.readxRut(rut);
    }

    public Persona modificar(int id, Persona persona)
    {
        return personaRepository.update(id, persona);
    }

    public String borrar(int id) {
        // TODO Auto-generated method stub
        
        return personaRepository.delete(id);
    }

}
