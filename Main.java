public class Main {
    public static void main(String[] args) {
        Fisica pf = new Fisica();
        pf.setNome("Julia");
        pf.setSobrenome("Machado");
        pf.setIdade(25);
        pf.setCfp("963.852.741-0");
        System.out.println(pf);

        Juridica pj = new Juridica();
        pj.setNome("EBAC");
        pj.setSobrenome("Escola Britânica de Artes Criativas & Tecnologia");
        pj.setIdade(9);
        pj.setCnpj("37.598.548/0001-60");
        System.out.print(pj);
    }
}