package sueldos;

import entity.Seller;
import service.SellerService;

public class Sueldos {
    public static void main(String[] args) {
    //Lo primero que vamos a hacer es instanciar un objeto de tipo servicio, para poder acceder
        SellerService ss1 = new SellerService();
        //Instanciamos el objeto, para alojar el retorno de lo que construimos en la clase servicios
        //El objeto que retornamos en la clase servicios (con los atributos llenos, es el que tenemos que alojar en
        // el main para poder pasarlo por parametro y poder llamar al resto de los métodos
        Seller s1 = ss1.addSeller();

        //Una vez que tenemos en el main el objeto que retorna esta funcion con todos sus atributos cargados,
        //Puedo llamar a los otros metodos de la clase service
        //pasandole por parametros este objeto, que creamos en el primer método, para hacer los distintos calculos
        ss1.calculateMonthlySalary(s1);
        ss1.vacations(s1);

    }
}
