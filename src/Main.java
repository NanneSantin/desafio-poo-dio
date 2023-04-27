import edu.elaine.dio.desafio.dominio.Curso;
import edu.elaine.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso("Curso POO", "Descrição curso POO", 8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now()); //a hora que criar vai atribuir a data de criação.

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }
}
