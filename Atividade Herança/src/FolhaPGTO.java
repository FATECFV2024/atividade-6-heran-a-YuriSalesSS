public class FolhaPGTO {
    public static void main(String[] args) {
       
        Mensalista men1, men2;
        Horista hora1, hora2;

       
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();  
        men1.imprimir();  //

       
        men2 = new Mensalista("Ana", "Rua def", "Senior");
        men2.calcularSalario();  
        men2.imprimir();  
        
        hora1 = new Horista("Carlos", "Rua aeiou", 20);
        hora1.calcularSalario();  
        hora1.imprimir();  

    
        hora2 = new Horista("Cristina", "Rua Epaminondas", 100);
        hora2.calcularSalario();  
        hora2.imprimir(); 

        }
}
