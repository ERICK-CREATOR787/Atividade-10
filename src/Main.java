public class Main {
    public static void main(String[] args) throws Exception {

        ProfessorDAO dao = new ProfessorDAO();
        Professor p = new Professor();

        p.setNome("Marcel Phillipe");
        p.setEmail("marcel.prof@gmail.com");
        p.setTelefone("1198888-0000");
        p.setGenero("masculino");
        p.setSalario(4500.00);
        p.setAtivo(true);

        dao.salvar(p);

        System.out.println("Professor cadastrado com sucesso!");
    }
}
