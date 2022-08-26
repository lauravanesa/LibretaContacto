import javax.swing.*;

public class Libreta_contacto {
    public class Libreta_Contactos {
        public static void main(String[] args) {
            String nombre;
            String direccion;
            String telefono;
            int posicionGuardar;
            int posicionConsultar = 0;
            String [][] Libreta = new String[5][3];

            boolean continuar = true;
            while (continuar){
                String menu = JOptionPane.showInputDialog("1. guardar contacto \n " +
                        "2. consultar contacto \n "+ "3. borrar contacto \n"+ "4.salir");
                switch (menu){
                    case "1":
                        nombre = JOptionPane.showInputDialog("igresa el nombre");
                        telefono = JOptionPane.showInputDialog("ingresa el telefono");
                        direccion = JOptionPane.showInputDialog("ingrese la direccion");
                        posicionGuardar = Integer.parseInt(JOptionPane.showInputDialog("ingrese la poscion a guardar "));

                        if (posicionGuardar < 0 || posicionGuardar > 4 ){
                            JOptionPane.showMessageDialog(null,"la posicion a seleccionar  no es coreecta ");

                        }else {
                            if (Libreta[posicionGuardar][0] != null){
                                String sobreescribir = JOptionPane.showInputDialog("¿ desea sobreescribir la posicon a guardar");

                            }
                        }

                        Libreta[posicionGuardar][0] = nombre;
                        Libreta[posicionGuardar][1] = telefono;
                        Libreta[posicionGuardar][2] = direccion;
                        JOptionPane.showMessageDialog(null,"se guardo contacto correctamente en la " + "posicion "+posicionGuardar);

                        break;
                    case "2":
                        posicionGuardar = Integer.parseInt(JOptionPane.showInputDialog("ingresa la poscion a consultar"));

                        if (Libreta[posicionConsultar][0]==null){
                            JOptionPane.showMessageDialog(null,"no se ha encontrado ningun coctacto guardado");

                        }else {
                            JOptionPane.showMessageDialog(null, "nombre"  + Libreta[posicionConsultar][0]
                                    +  "\nTelefono: "+Libreta[posicionConsultar][1]+
                                    "\nDireccion: "+Libreta[posicionConsultar][2]);

                        }
                        break;
                    case "3":
                        int posicionBorrar = Integer.parseInt(JOptionPane.showInputDialog("ingrese la posicion a borrar")
                        );
                        if (posicionBorrar < 0 || posicionBorrar > 4){
                            JOptionPane.showMessageDialog(null,"la posicion seleccionada no es valida ");
                        }else {
                            Libreta[posicionBorrar][0] = null;
                            Libreta[posicionBorrar][1] = null;
                            Libreta[posicionBorrar][2] = null;
                        }

                    case "4":
                        continuar = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"por favor lea bie e ingrese una opcion valida");


                }


            }
        }

    }




}
