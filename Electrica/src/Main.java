import java.util.Scanner;
public class Main {

    public static void main(String args[]){
        Freelance a1 = new Freelance();
        Companies c1 = new Companies();

        Products p1 = new Products();
        Products p2 = new Products();

        Services s1 = new Services();
        Services s2 = new Services();

        Bill f1 = new Bill();

        Scanner sc = new Scanner(System.in);

        //DATOS AUTONOMOS
        System.out.println("INTRODUCE LOS DATOS DEL AUTONOMO: ");

        a1.setCode("456");

        System.out.println("Introduce el nombre:  ");
        String name = sc.nextLine();
        a1.setName(name);

        System.out.println("Introduce el apellido:  ");
        String apellidos = sc.nextLine();
        a1.setSurname(apellidos);

        System.out.println("Introduce el dni: ");
        String dni = sc.nextLine();
        a1.setId(dni);

        System.out.println("Introduce la direccion:  ");
        String direc = sc.nextLine();
        a1.setAddress(direc);

        System.out.println("Introduce la poblacion:  ");
        String pobla = sc.nextLine();
        a1.setPopulation(pobla);

        System.out.println("Introduce la provincia:  ");
        String provin = sc.nextLine();
        a1.setProvince(provin);

        System.out.println("Introduce el email:  ");
        String email = sc.nextLine();
        a1.setMail(email);

        System.out.println("Introduce el telefono:  ");
        String telfn = sc.nextLine();
        a1.setPhoneNumber(telfn);

        System.out.println("  ");
        System.out.println("Codigo: " + a1.getCode());
        System.out.println("Nombre: " + a1.getName());
        System.out.println("Segundo Nombre: " + a1.getSurname());
        System.out.println("DNI: " + a1.getId());
        System.out.println("Telefono: " + a1.getPhoneNumber());
        System.out.println("Email: " + a1.getMail());
        System.out.println("Provincia: " + a1.getProvince());
        System.out.println("Poblacion: " + a1.getPopulation());
        System.out.println("Direccion: " + a1.getAddress());

        //DATOS SOCIEDAD
        System.out.println("  ");
        System.out.println("INTRODUCE LOS DATOS DE LA SOCIEDAD: ");

        a1.setCode("548");

        System.out.println("Introduce el cif: ");
        String cif = sc.nextLine();
        a1.setId(cif);

        System.out.println("Introduce la razon: ");
        String motive = sc.nextLine();
        a1.setId(motive);

        System.out.println("Introduce la direccion:  ");
        String direcc = sc.nextLine();
        a1.setAddress(direcc);

        System.out.println("Introduce la poblacion:  ");
        String poblac = sc.nextLine();
        a1.setPopulation(poblac);

        System.out.println("Introduce la provincia:  ");
        String provinc = sc.nextLine();
        a1.setProvince(provinc);

        System.out.println("Introduce el email:  ");
        String mail = sc.nextLine();
        a1.setMail(mail);

        System.out.println("Introduce el telefono:  ");
        String telfno = sc.nextLine();
        a1.setPhoneNumber(telfno);

        System.out.println("  ");
        System.out.println("Codigo: " + c1.getCode());
        System.out.println("Razon: " + c1.getMotive());
        System.out.println("CIF: " + c1.getCif());
        System.out.println("Email: " + c1.getMail());
        System.out.println("Provincia: " + c1.getProvince());
        System.out.println("Poblacion: " + c1.getPopulation());
        System.out.println("Direccion: " + c1.getAddress());

        //DATOS PRODUCTO 1
        System.out.println("  ");
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
        System.out.println("  ");
        System.out.println("INTRODUCE LOS DATOS DEL SEGUNDO PRODUCTO: ");

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
        System.out.println("  ");
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
        System.out.println("  ");
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
        
        //FACTURA
        System.out.println(" ");
        System.out.println("DATOS DE LA FACTURA");

        a1.setCode("61460");

        System.out.println("Introduce una fecha de la factura: ");
        String f1dt = sc.nextLine();
        f1.setDate(f1dt);

        System.out.println("  ");
        System.out.println("FACTURA");
        System.out.println("Codigo: " + f1.getCode());
        System.out.println("Fecha: " + f1.getDate());
        System.out.println("DATOS CLIENTE");
        System.out.println("CIF: " + c1.getCif());
        System.out.println("Email: " + c1.getMail());
        System.out.println("Provincia: " + c1.getProvince());
        System.out.println("Poblacion: " + c1.getPopulation());
        System.out.println("Direccion: " + c1.getAddress());
        System.out.println("DATOS VENTA");
        System.out.println("Codigo: " + p1.getCode());
        System.out.println("Nombre: " + p1.getName());
        System.out.println("Precio: " + p1.getPrize());
        System.out.println("Tipo de IVA: " + p1.getIva());
        System.out.println("TOTAL" + p1.getPrize() + p2.getPrize());


    }
}

