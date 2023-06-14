package service;

import entity.Seller;
import java.util.Date;
import java.util.Scanner;

public class SellerService {
    //Usamos scanner para poder pedirle al usuario info por pantalla
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    //Este método va a retornar un objeto del tipo Seller e importamos la clase del objeto
    public Seller addSeller(){
        //instanaciar un objeto del tipo seller
        //Para instanciar, usamos el constructor vacio
        Seller s1 = new Seller();
        //El objeto s1, contiene todos los atributos que nosotros definimos en la entidad, pero están vacios


        //Llenando los atributos por pantalla -> Scanner, linea 8
        System.out.println("Ingresa el nombre del vendedor");
        s1.setName(read.next());
        System.out.println("Ingresa el dni del vendedor");
        s1.setIdPersonal(read.nextInt());
        System.out.println("Ingresa el sueldo base del vendedor");
        s1.setBaseSalary(read.nextDouble());
        System.out.println("Ingrese el dia de inicio");
        int day = read.nextInt();
        System.out.println("Ingrese el mes de inicio");
        int month = read.nextInt();
        System.out.println("Ingrese el año de inicio");
        int year = read.nextInt();
        //Importamos date
        Date date1 = new Date(year-1900,month-1,day);
        s1.setStartDate(date1);
        //Una vez asignados todos los valores a los atributos que podemos guardar en este momento
        // Pedimos que nos retorne el objeto con todos los valores ya cargados
        return s1;
    }

    //No retorna nada, pero si le pasamos un objeto de tipo Seller es en que yo quiero que se realice estso calculos
    public void calculateMonthlySalary (Seller s1){
        System.out.println("Ingrese las ventas totales del vendedor");
        Double sales = read.nextDouble();
        //Sabiendo las ventas, ya podemos calcular cuánto son las comisiones que corresponden
        //Serían las ventas por el 15%
        s1.setCommissions(sales*0.15);
        s1.setMonthlySalary(s1.getBaseSalary()+ s1.getCommissions());
        System.out.println("El sueldo mensual del vendedor: "
        +s1.getName() + " es de $" + s1.getMonthlySalary());
    }

    //Necesitamos pasarle por parametro un objeto del tipo Seller para poder realizar estos calculos,
    // con los datos que provengan de ese mismo objeto
    public void vacations(Seller s1){
        Date today = new Date();
        int antiguedad = today.getYear() - s1.getStartDate().getYear();

        System.out.println(antiguedad);

        //Analizarlo para saber cuántos días le corresponden
        if(antiguedad < 5){
            System.out.println("Le corresponden 14 días de vacaciones");
        } else if (antiguedad < 10) {
            System.out.println("le corresponden 21 días de vacaciones");
        } else if (antiguedad < 20) {
            System.out.println("le corresponden 28 días de vacaciones");
        } else if (antiguedad >= 20) {
            System.out.println("le corresponden 35 días de vacaciones");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }
}
