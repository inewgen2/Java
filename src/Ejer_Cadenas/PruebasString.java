/*

 */
package Ejer_Cadenas;

public class PruebasString {

    public static void main(String[] args) {
        String nombre = "Marcos Hernandez el niño maravilla";
        String subCadena;
        int tam = nombre.length();
        //indica la longitud de la cadena
        System.out.println("El tamaño es: " + tam);
        //indica el caracter que ocupa de acuerdo al indice de la cadena
        System.out.println("La posicion 2 es: " + nombre.charAt(2));
        //separa la cadena en subcadenas indicando la posicion de inicio de la subcadena
        System.out.println("La Subcadena que inicia en 4 es: " + nombre.substring(4));
        //separa la cadena en subcadenas indicando la posicion de inicio y el final de la subcadena
        System.out.println("La Subcadena que inicia en 4 y final 7 es: " + nombre.substring(4, 9));
        //Reemplaza un o varios caracteres por otro indicado
        subCadena = nombre.replace("o", "X");
        System.out.println("La Subcadena con remplazo es: " + subCadena);
        //NOTA se puede usar para reemplazar cuando se extrae datos de la BD y no reconoce la Ñ.
        System.out.println("La Subcadena con remplazo es: " + nombre.replace("niño", "joven"));
        //Se usa para comparar el inicio de la cadena
        if (nombre.startsWith("cos")) {//pregunta si inicia con COS 
            System.out.println("Corecto inicializacion");
        } else {
            System.out.println("Incorecto inicializacion");
        }
        //compara el inicio de la cadena desde la posicion indicada
        if (nombre.startsWith("cos", 3)) {//pregunta si inicia con cos desde el 3 indice
            System.out.println("Corecto inicializacion segun indice");
        } else {
            System.out.println("Incorecto inicializacion segun indice");
        }
        //Se usa para comparar el final de una cadena
        //sirve para buscar 
        if (nombre.endsWith("villa")) {//pregunta si inicia con cos desde el 3 indice
            System.out.println("Corecto finalizacion");
        } else {
            System.out.println("Incorecto finalizacion");
        }
        //comparacion de cadenas
        // NOTA == compara variables y equals compara objetos.
        String nombre2 = "Marcos Hernandez el niño maravilla";
        if (nombre.equals(nombre2)) {// aqui estoy haciendo una comparacion de objeto no de variables
            System.out.println("Corecto comparando");
        } else {
            System.out.println("Incorecto comparando");
        }
        //compara cadenas ignorando mayusculas y minusculas Ej PerRo = perro || PERRO = perro es true
        //se utiliza en los login de correos o inicio de secion 
        if (nombre.equalsIgnoreCase(nombre2)) {// aqui estoy haciendo una comparacion de objeto no de variables
            System.out.println("Corecto comparando case");
        } else {
            System.out.println("Incorecto comparando case");
        }
        //convertir la cadena en mayusculas y minusculas
        System.out.println("Todo MAYUSCULAS  " + nombre.toUpperCase());
        System.out.println("Todo minusculas  " + nombre.toLowerCase());
        //concatenar cadenas con cancat
        funcionConcatenar();
        //permite saber si la cadena contiene a la subcadena introducida
        funcionContains();
        //busca una cadena dentro de otra pero tienen que ser iguales
        funcionContentEquals();
        //para llamar un funcion dentro de una funcion estatica primero creamos el objeto de la clase
        // luego invocamos a la funcion dentro de la clase
        //este metodo verifica si termina la cadena con la subcadena
        PruebasString pruebas2 = new PruebasString();
        pruebas2.metodoEndsWith();//metodo equal compara las objetos string y verifica si son iguales
        pruebas2.metodoEqualsIgnoreCase();//metodo equal compara las cadenas ignorando mayusculas y minusculas
        pruebas2.metodo_isEmpty();//metodo esEmpty verifica si esta vacio el texto
        pruebas2.metodo_indexOf();//este metodo devuelve un numero, la posicion del caracter buscado
        pruebas2.metodo_indexOfConPosicionInicio();//metodo busca y caracter devuelve posicion y se indica lugar de inicio de busqueda
    }

    //concatenar cadenas con cancat
    public static void funcionConcatenar() {
        String cadena = "Jose";
        char vchar = cadena.charAt(2);
        System.out.println("\nMETODO MUESTRA INDEX: ");
        System.out.println(cadena);
        System.out.println(vchar);
        cadena = cadena.concat("Luis");
        System.out.println("\nMETODO CONCATENA: ");
        System.out.println(cadena);
    }

    //permite saber si la cadena contiene a la subcadena introducida
    // se puede usar como un modulo de validacion 
    public static void funcionContains() {
        String cadena1 = "Jose";
        String cadena2 = "Video tutoriales de java";
        boolean resultado_busqueda = cadena2.contains(cadena2);
        System.out.println("\nMETODO CONTIENE CADENAS: ");
        System.out.println("Resultado con variable: " + resultado_busqueda);
        System.out.println("Resultado busqueda directa: " + cadena2.contains("jav"));
    }

    //busca una cadena dentro de otra pero tienen que ser iguales
    public static void funcionContentEquals() {
        String cadena1 = "Jose";
        String cadena2 = "Video tutoriales de java";
        boolean resultado_busqueda = cadena2.contentEquals(cadena2);
        System.out.println("\nMETODO CONTIENE CADENAS IGUALES: ");
        System.out.println("Resultado con variable: " + resultado_busqueda);
        System.out.println("Resultado busqueda directa: " + cadena2.contentEquals("java"));
    }

    //metodo equal compara las objetos string y verifica si son iguales
    public void metodoEndsWith() {
        String cadenaPrincipal = "Esta es la cadena principal";
        String subFijoBusqueda = "pal";
        boolean resultado = cadenaPrincipal.endsWith(subFijoBusqueda);
        System.out.println("\nMETODO ENDSWITH");
        System.out.println("Resultado: " + resultado);
    }

    //metodo equal compara las cadenas ignorando mayusculas y minusculas
    public void metodoEqualsIgnoreCase() {
        String textoPrincipal = "Admin";
        String textoSecundario = "admin";
        System.out.println("\nMETODO SON IGUALES IGNORANDO MAYUSCULAS Y MINUSCULAS:");
        boolean res = textoPrincipal.equalsIgnoreCase(textoSecundario);
        System.out.println("Resultado de comparacion: " + res);
    }
    //metodo esEmpty verifica si esta vacio el texto
    public void metodo_isEmpty() {
        String textoPrincipal = "";
        //String textoSecundario = "admin";
        System.out.println("\nMETODO EMPTY VERIFICA SI ESTA VACIO:");
        boolean vacio = textoPrincipal.isEmpty();
        System.out.println("Resultado de comparacion: " + vacio);
    }
    //este metodo devuelve un numero, la posicion del caracter buscado
    public void metodo_indexOf(){
        String cadena="usuario1293@gmail.com";
        int caracterA_buscar='@';// se permite esto por @ tiene asociado un numero en el codigo ASCII
        System.out.println("\nMETODO INDEXOF BUSCA Y DEVUELVE POSICION:");
        System.out.println("Cadena original: " + cadena);
        System.out.println("Imprimimos @: " + caracterA_buscar);
        System.out.println("La posicion es:"+cadena.indexOf(caracterA_buscar));
    }
    //metodo busca y caracter devuelve posicion y se indica lugar de inicio de busqueda
    public void metodo_indexOfConPosicionInicio(){
        String cadena="usuario1293@gmail.com";
        int caracterA_buscar='@';// se permite esto por @ tiene asociado un numero en el codigo ASCII
        System.out.println("\nMETODO INDEXOF BUSCA Y DEVUELVE LA POSICION USA LUGAR INICIO DE BUSQUEDA:");
        System.out.println("Cadena original: " + cadena);
        System.out.println("Imprimimos @: " + caracterA_buscar);
        System.out.println("La posicion es:"+cadena.indexOf(caracterA_buscar,10));
    }
    
}
