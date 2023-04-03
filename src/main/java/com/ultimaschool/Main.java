package com.ultimaschool;

import com.ultimaschool.pessoas.Estudante;
import com.ultimaschool.pessoas.Responsavel;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Sara Rocha");

        estudante.consolidarNotas(1,6.0);
        estudante.consolidarNotas(2,9.0);
        estudante.consolidarNotas(3,7.0);
        estudante.consolidarNotas(4,8.0);

        System.out.println(estudante.relatorio());
        System.out.println(estudante.verSituacao(5));


        Responsavel responsavel = new Responsavel("Ana Rocha");

        responsavel.pagaMensalidade(1,true);
        responsavel.pagaMensalidade(2,true);
        responsavel.pagaMensalidade(3,false);
        responsavel.pagaMensalidade(4,true);
        responsavel.pagaMensalidade(5,false);

        System.out.println(responsavel.relatorio());
        System.out.println(responsavel.verSituacao(1));
        System.out.println(responsavel.verSituacao(3));
    }
}