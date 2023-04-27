import edu.elaine.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso POO");
        curso2.setDescricao("Descrição curso POO");
        curso2.setCargaHoraria(12);

        Conteudo curso3 = new Curso(); //exemplo de polimorfismo
        curso3.setTitulo("Curso Python");
        curso3.setDescricao("Descrição curso Python");
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

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devElaine = new Dev();
        devElaine.setNome("Elaine S");
        devElaine.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Elaine: "+ devElaine.getConteudosInscritos());
        devElaine.progredir();
        devElaine.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Elaine: "+ devElaine.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Elaine: "+ devElaine.getConteudosConcluidos());
        System.out.println("XP: " + devElaine.calcularTotalXp());

        System.out.println("-------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: "+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila: "+ devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: "+ devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

    }
}
