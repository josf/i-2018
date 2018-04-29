/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.josneyo.i2018.topicos2.serializacao.exercise2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Pichau
 */
public class Serializacao implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        byte[] aux;

        AnotherNotSerializable notsrz = new AnotherNotSerializable(); //Gera o erro
        notsrz.name = "Testador";
        notsrz.color = "Blue";
        notsrz.number = 101;

        aux = serializaInstacia(notsrz);
        System.out.println(aux);
        produzInstacia(aux);

    }

    private static byte[] serializaInstacia(Serializable s) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(s);
        oos.close();

        return baos.toByteArray();
        
    }

    private static void produzInstacia(byte[] s) throws IOException, ClassNotFoundException {
        ByteArrayInputStream baos = new ByteArrayInputStream(s);
        ObjectInputStream ois = new ObjectInputStream(baos);

        AnotherNotSerializable exx = (AnotherNotSerializable) ois.readObject();
        
        ois.close();
        
        System.out.println(exx.name);
        System.out.println(exx.number);
        
    }

}
