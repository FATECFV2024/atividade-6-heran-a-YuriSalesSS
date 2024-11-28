public class FolhaPGTO {
    public static void main(String[] args) {
        Mensalista men1, men2;

        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcularInss();
        System.out.println("Nome: " + men1.getNome());
        System.out.println("Nome");
    }


}
