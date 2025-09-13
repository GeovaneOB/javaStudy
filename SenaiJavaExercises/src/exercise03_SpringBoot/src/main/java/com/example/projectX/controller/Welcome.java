package com.example.projectX.controller;

// Importando os utilitários para as notações utilizadas
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Lida com requisições HTTP e retorna dados diretamente no corpo da resposta,
@RestController // em vez de retornar uma página de visualização (como HTML)

@RequestMapping ("/home") // É usado para mapear as requisições http para metódos específicos dentro dos controladores
public class Welcome {

    @GetMapping("/") // Ponto de acesso para o metódo que retorna a mensagem "bem-vindo"
    public String mensagem () {
        return "Welcome!";
    }

    @GetMapping("/autor") // // Ponto de acesso para o metódo que retorna a mensagem "Desenvolvedor(a): Geovane Oliveira"
    public String dev () {
        return "Desenvolvedor(a): Geovane Oliveira";
    }

    @GetMapping("/autor/mensagem") // Ponto de acesso para o metódo que retorna a mensagem "Seja bem-vindo(a) ao ProjectX"
    public String mensagem2 () {
        return "Seja bem-vindo(a) ao ProjectX";
    }



}