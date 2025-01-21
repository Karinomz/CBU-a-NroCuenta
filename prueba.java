import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {

        String cbu, suc, cuenta;
        int longitud;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Encontrar el numero de cuenta con el CBU");
        System.out.println();
        while (true) {
            // Mostrar el menú de opciones
            System.out.println();
            System.out.println("Selecciona un banco:");
            System.out.println("1. Banco Santander o BBVA");
            System.out.println("2. Banco Galicia");
            System.out.println("3. Banco Patagonia");
            System.out.println("4. Banco ICBC");
            System.out.println("5. Banco Macro");
            System.out.println("6. Banco HSBC");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            int opcion = scanner.nextInt();

            // Salir si la opción es 5
            if (opcion == 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            switch (opcion) {
                case 1:  // Banco Santander
                    System.out.println("Has seleccionado Banco Santander.");
                    System.out.println();
                    System.out.println("Ingrese el numero de CBU");
                    cbu = scanner.next();
                    suc= cbu.substring(4,7);
                    System.out.print("Sucursal: ");
                    System.out.println(suc);
                    cuenta=cbu.substring(15,21);
                    System.out.print("Cuenta  : ");
                    System.out.println(cuenta);
                    break;

                case 2 :  // Banco Galicia
                    System.out.println("Has seleccionado Banco Galicia.");
                    System.out.println();
                    System.out.println("Ingrese el numero de CBU");
                    cbu = scanner.next();
                    suc= cbu.substring(4,7);
                    System.out.print("Sucursal: ");
                    System.out.print(suc);
                    suc= cbu.substring(20,21);
                    System.out.print("-"+suc);
                    cuenta=cbu.substring(12,20);
                    System.out.print(" Cuenta  : ");
                    System.out.println(cuenta);
                    System.out.println(cuenta +"-"+ cbu.substring(21,21)+" "+ cbu.substring(4,7)+"-"+suc);

                case 3 :  // Banco Patagonia
                    //NRO. CUENTA	412 009 498949983
                    //CBU	2850 12044 009  498949983 8
                    //CTA. NRO. 3759 09413752771
                    //CBU NRO. 2850 75923 009 413752771 1
                    System.out.println("Has seleccionado Banco Patagonia.");
                    System.out.println();
                    System.out.println("Ingrese el numero de CBU");
                    cbu = scanner.next();
                    suc= cbu.substring(4,7);
                    System.out.print("Sucursal: ");
                    System.out.print(suc);
                    cuenta=cbu.substring(10,20);
                    System.out.print(" Cuenta  : ");
                    System.out.println(cuenta);
                    System.out.println();
                    System.out.println(suc+"-"+cuenta+"-000");
                    break;
                case 4 :  // Banco ICBC

                    System.out.println("Has seleccionado Banco ICBC.");
                    System.out.println();
                    System.out.println("Ingrese el numero de CBU");
                    cbu = scanner.next();
                    suc= cbu.substring(3,7);
                    System.out.print("Sucursal: ");
                    System.out.print(suc);
                    cuenta=cbu.substring(8,10);
                    System.out.println(" Cuenta  : "+cuenta+cbu.substring(13,19)+"/"+cbu.substring(19,21));
                    System.out.println(suc+"/"+cuenta+cbu.substring(13,19)+"/"+cbu.substring(19,21));

                    System.out.println();

                    break;

                case 5 :  // Banco Macro
                    // 4-5520-954894 208/9
                    System.out.println("Has seleccionado Banco Macro.");
                    System.out.println();
                    System.out.println("Ingrese el numero de CBU");
                    cbu = scanner.next();
                    suc= cbu.substring(17,20);
                    System.out.println("Sucursal: "+suc+"/"+ cbu.substring(20,21));
                    System.out.println("Cuenta: "+cbu.substring(8,9)+"-"+cbu.substring(4,7)+cbu.substring(9,10)+"-"+cbu.substring(11,17));
                    System.out.println();
                    System.out.println(cbu.substring(8,9)+"-"+cbu.substring(4,7)+cbu.substring(9,10)+"-"+cbu.substring(11,17)+" "+suc+"/"+ cbu.substring(20,21));
                    break;

                case 6 :
                    //hsbc
                    //CBU: 1500 600 6000600 6011246 4
                    //     600 6011246
                    //NRO. CUENTA	685 3243689
                    //CBU	1500 685 3000685  3243689 6
                    //           685
                    //                        3243689
                    //14,21
                    System.out.println("Has seleccionado Banco HSBC.");
                    System.out.println();
                    System.out.println("Ingrese el numero de CBU");
                    cbu = scanner.next();
                    suc= cbu.substring(4,7);
                    System.out.print("Sucursal: "+suc);
                    System.out.println();
                    System.out.print("Cuenta: "+cbu.substring(14,21));
                    System.out.println();
                    System.out.println(suc+"/"+cbu.substring(14,21));
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");

            }

        }
    }
}

