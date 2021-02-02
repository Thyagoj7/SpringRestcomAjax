package com.example.demo.Service;

import com.example.demo.Controller.request.SoldadoEditRequest;
import com.example.demo.Dto.Soldado;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf) {
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e flecha");
        return soldado;

    }

    public void criarSoldado(Soldado soldado){

    }


    public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {
    }
}
