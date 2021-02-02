package com.example.demo.Service;

import com.example.demo.Controller.request.SoldadoEditRequest;
import com.example.demo.Dto.Soldado;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

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


    public void deletarSoldado(String cpf) {

    }


        public List<Soldado> buscarSoldados() {
            Soldado soldado1 = new Soldado();
            soldado1.setCpf("123456788");
            soldado1.setNome("Legolas");
            soldado1.setRaca("Elfo");
            soldado1.setArma("Arco e flecha");
            Soldado soldado2 = new Soldado();
            soldado2.setCpf("123456789");
            soldado2.setNome("Gafanhoto");
            soldado2.setRaca("Humano");
            soldado2.setArma("Espada");

            return Arrays.asList(soldado1,soldado2);

        }


    }



