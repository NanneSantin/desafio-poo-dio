import edu.elaine.dio.desafio.dominio.Conteudo;
import edu.elaine.dio.desafio.dominio.Curso;
import edu.elaine.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição curso Python");
        curso2.setCargaHoraria(12);

        Conteudo curso3 = new Curso(); //exemplo de polimorfismo
        curso3.setTitulo("Curso POO");
        curso3.setDescricao("Descrição curso POO");
        /*
        Por estar usando Conteudo para instanciar o curso não consigo inserir a carga
        horária.
        Tudo o que está na classe mãe (Conteudo) posso pegar na classe filha (Curso), mas
        o que está na classe filha, não posso pegar na classe mãe.
         */

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now()); //a hora que criar vai atribuir a data de criação.

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria1);

    }
}
