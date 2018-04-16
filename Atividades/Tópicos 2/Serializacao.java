/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracao2018.Topicos2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Pichau
 */
public class Serializacao implements Serializable {

    private NotSerializable notsrz;

    public static void main(String[] args) {

        Serializacao srz = new Serializacao();

        try {
            srz.notsrz = new NotSerializable();
            System.out.println(TamanhoEmBytes(srz));
        } catch (IOException e) {
            System.out.print(e);
        }
    }

    private static int TamanhoEmBytes(Serializable s) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(s);
        oos.close();

        return baos.toByteArray().length;
    }

}
