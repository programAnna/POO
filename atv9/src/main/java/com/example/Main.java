package com.example;

import com.example.bean.Medico;
import com.example.bean.Recepcionista;
import com.example.DAO.MedicoDAO;
import com.example.DAO.RecepcionistaDAO;

public class Main {

    public static void main(String[] args) {

        try {

            // MÉDICO
            MedicoDAO medicoDAO = new MedicoDAO();

            Medico medico =
                    new Medico("Carlos Silva",
                            "Cardiologia",
                            "12345");

            medicoDAO.inserir(medico);

            Medico consultaMedico =
                    medicoDAO.consultar(1);

            System.out.println(consultaMedico.getNome());

            // RECEPCIONISTA
            RecepcionistaDAO recepcionistaDAO =
                    new RecepcionistaDAO();

            Recepcionista r =
                    new Recepcionista("Ana",
                            "11999999999",
                            "Noturno");

            recepcionistaDAO.inserir(r);

            Recepcionista consultaR =
                    recepcionistaDAO.consultar(1);

            System.out.println(consultaR.getNome());

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}