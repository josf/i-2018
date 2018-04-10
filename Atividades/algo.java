package integracao2018;

import java.io.*;

/**
 * Created by aluno on 09/04/18.
 */
public class Serializacao implements Serializable {

    private DeuPau d;

    public static void main(String[] args) {

        Serializacao s = new Serializacao();

            try {
                s.d = new DeuPau();
                System.out.println(TamanhoEmBytes(s));
            } catch (IOException e){
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
