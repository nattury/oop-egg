package entity;

import java.util.Date;

//Definir los atributos que van a caracterizar a este objeto
public class Seller {
    private String name;
    private Integer idPersonal;
    private Double baseSalary;
    private Double commissions;
    private Double monthlySalary;
    private Date startDate;

    // constructor por defecto
    public Seller() {
    }

    //Constructor por parametros -> pasando por parametro cada uno de los atributos que definimos
    //Y lo que hace es guardarlo en esos atributos que definimos previamente

    public Seller(String name, Integer idPersonal, Double baseSalary, Double commissions, Double monthlySalary, Date startDate) {
        this.name = name;
        this.idPersonal = idPersonal;
        this.baseSalary = baseSalary;
        this.commissions = commissions;
        this.monthlySalary = monthlySalary;
        this.startDate = startDate;
    }


    //getter & setter

    //Método get del atributo nombre, es una función que retorna un dato de tipo String
    //La invocamos con el nombre: getName(), no necesita ningun parametro para funcionar
    //Y retorna el atributo name
    public String getName() {
        return name;
    }

    //Setter, tenemos un método de tipo void, en donde no se va a retornar nada. Yo le tengo que pasar un parametro
    //Y va a alojarlo en el atributo que este requiriendo. En este caso va a ser nombre.
    //El parametro que paso, se va a guardar en el atributo.
    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Double getCommissions() {
        return commissions;
    }

    public void setCommissions(Double commissions) {
        this.commissions = commissions;
    }

    public Double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


    //toString -> Retorna la impresión del objeto con todos sus datos detallados, con sus atributos


    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", idPersonal=" + idPersonal +
                ", baseSalary=" + baseSalary +
                ", commissions=" + commissions +
                ", monthlySalary=" + monthlySalary +
                ", startDate=" + startDate +
                '}';
    }

    //Luego creamos el paquete servicio para operar con todos nuestros datos.
}