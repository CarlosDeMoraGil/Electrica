import java.util.Scanner;
public class Main {

    public static void main(String args[]){
        Freelance f1 = new Freelance();
        Companies c1 = new Companies();

        Products p1 = new Products();
        Products p2 = new Products();

        Services s1 = new Services();
        Services s2 = new Services();

        Scanner sc = new Scanner(System.in);

        //DATOS AUTONOMOS
        System.out.println("INTRODUCE LOS DATOS DEL AUTONOMO: ");

        f1.setCode("456");

        System.out.println("Introduce el nombre:  ");
        String name = sc.nextLine();
        f1.setName(name);

        System.out.println("Introduce el apellido:  ");
        String apellidos = sc.nextLine();
        f1.setSurname(apellidos);

        System.out.println("Introduce el dni: ");
        String dni = sc.nextLine();
        f1.setId(dni);

        System.out.println("Introduce la direccion:  ");
        String direc = sc.nextLine();
        f1.setAddress(direc);

        System.out.println("Introduce la poblacion:  ");
        String pobla = sc.nextLine();
        f1.setPopulation(pobla);

        System.out.println("Introduce la provincia:  ");
        String provin = sc.nextLine();
        f1.setProvince(provin);

        System.out.println("Introduce el email:  ");
        String email = sc.nextLine();
        f1.setMail(email);

        System.out.println("Introduce el telefono:  ");
        String telfn = sc.nextLine();
        f1.setPhoneNumber(telfn);

        System.out.println("  ");
        System.out.println("Codigo: " + f1.getCode());
        System.out.println("Nombre: " + f1.getName());
        System.out.println("Segundo Nombre: " + f1.getSurname());
        System.out.println("DNI: " + f1.getId());
        System.out.println("Telefono: " + f1.getPhoneNumber());
        System.out.println("Email: " + f1.getMail());
        System.out.println("Provincia: " + f1.getProvince());
        System.out.println("Poblacion: " + f1.getPopulation());
        System.out.println("Direccion: " + f1.getAddress());

        //DATOS SOCIEDAD
        System.out.println("INTRODUCE LOS DATOS DE LA SOCIEDAD: ");

        f1.setCode("548");

        System.out.println("Introduce el cif: ");
        String cif = sc.nextLine();
        f1.setId(cif);

        System.out.println("Introduce la razon: ");
        String motive = sc.nextLine();
        f1.setId(motive);

        System.out.println("Introduce la direccion:  ");
        String direcc = sc.nextLine();
        f1.setAddress(direcc);

        System.out.println("Introduce la poblacion:  ");
        String poblac = sc.nextLine();
        f1.setPopulation(poblac);

        System.out.println("Introduce la provincia:  ");
        String provinc = sc.nextLine();
        f1.setProvince(provinc);

        System.out.println("Introduce el email:  ");
        String mail = sc.nextLine();
        f1.setMail(mail);

        System.out.println("Introduce el telefono:  ");
        String telfno = sc.nextLine();
        f1.setPhoneNumber(telfno);

        System.out.println("  ");
        System.out.println("Codigo: " + c1.getCode());
        System.out.println("Razon: " + c1.getMotive());
        System.out.println("CIF: " + c1.getCif());
        System.out.println("Email: " + c1.getMail());
        System.out.println("Provincia: " + c1.getProvince());
        System.out.println("Poblacion: " + c1.getPopulation());
        System.out.println("Direccion: " + c1.getAddress());

        //DATOS PRODUCTO 1
        System.out.println("INTRODUCE LOS DATOS DEL PRIMER PRODUCTO: ");

        p1.setCode("878");

        System.out.println("Introduce el nombre: ");
        String p1n = sc.nextLine();
        p1.setName(p1n);

        System.out.println("Introduce la marca: ");
        String p1m = sc.nextLine();
        p1.setBrand(p1m);

        System.out.println("Introduce el modelo:  ");
        String p1md = sc.nextLine();
        p1.setModel(p1md);

        System.out.println("Introduce el precio:  ");
        String p1p = sc.nextLine();
        p1.setPrize(p1p);

        System.out.println("Introduce el tipo de IVA:  ");
        String p1ti = sc.nextLine();
        p1.setIva(p1ti);

        System.out.println("  ");
        System.out.println("Codigo: " + p1.getCode());
        System.out.println("Nombre: " + p1.getName());
        System.out.println("Marca: " + p1.getBrand());
        System.out.println("Modelo: " + p1.getModel());
        System.out.println("Precio: " + p1.getPrize());
        System.out.println("Tipo de IVA: " + p1.getIva());

        //DATOS PRODUCTO 2
        System.out.println("INTRODUCE LOS DATOS DEL PRIMER PRODUCTO: ");

        p2.setCode("878");

        System.out.println("Introduce el nombre: ");
        String p2n = sc.nextLine();
        p2.setName(p2n);

        System.out.println("Introduce la marca: ");
        String p2m = sc.nextLine();
        p2.setBrand(p2m);

        System.out.println("Introduce el modelo:  ");
        String p2md = sc.nextLine();
        p2.setModel(p2md);

        System.out.println("Introduce el precio:  ");
        String p2p = sc.nextLine();
        p2.setPrize(p2p);

        System.out.println("Introduce el tipo de IVA:  ");
        String p2ti = sc.nextLine();
        p2.setIva(p2ti);

        System.out.println("  ");
        System.out.println("Codigo: " + p2.getCode());
        System.out.println("Nombre: " + p2.getName());
        System.out.println("Marca: " + p2.getBrand());
        System.out.println("Modelo: " + p2.getModel());
        System.out.println("Precio: " + p2.getPrize());
        System.out.println("Tipo de IVA: " + p2.getIva());

        //DATOS SERVICIO 1
        System.out.println("INTRODUCE LOS DATOS DEL PRIMER SERVICIO: ");

        s1.setCode("878");

        System.out.println("Introduce el nombre: ");
        String s1n = sc.nextLine();
        s1.setName(s1n);

        System.out.println("Introduce el precio:  ");
        String s1p = sc.nextLine();
        s1.setPrize(s1p);

        System.out.println("Introduce el tipo de IVA:  ");
        String s1ti = sc.nextLine();
        s1.setIva(s1ti);

        System.out.println("  ");
        System.out.println("Codigo: " + s1.getCode());
        System.out.println("Nombre: " + s1.getName());
        System.out.println("Precio: " + s1.getPrize());
        System.out.println("Tipo de IVA: " + s1.getIva());

        //DATOS SERVICIO 2
        System.out.println("INTRODUCE LOS DATOS DEL SEGUNDO SERVICIO: ");

        s2.setCode("878");

        System.out.println("Introduce el nombre: ");
        String s2n = sc.nextLine();
        s2.setName(s2n);

        System.out.println("Introduce el precio:  ");
        String s2p = sc.nextLine();
        s2.setPrize(s2p);

        System.out.println("Introduce el tipo de IVA:  ");
        String s2ti = sc.nextLine();
        s2.setIva(s2ti);

        System.out.println("  ");
        System.out.println("Codigo: " + s2.getCode());
        System.out.println("Nombre: " + s2.getName());
        System.out.println("Precio: " + s2.getPrize());
        System.out.println("Tipo de IVA: " + s2.getIva());
    }
}

