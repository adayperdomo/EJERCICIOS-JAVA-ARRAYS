## Ejercicio1:
```sh
public class Ejercicio1 {
    public static void main(String[] args){
        int [] array = new int[10];
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            array [i] = (int) (Math.random()*100);
            System.out.println(array[i] + " + " + contador);
            contador += array[i];
        }
        System.out.println("La suma de todos los numeros es " + contador);
    } 
}
```

```sh
package com.mycompany.ut6;

public class Ejercicio1 {

    private int[] array;
    private int suma;

    // Constructor que inicializa el arreglo y calcula la suma
    public Ejercicio1() {
        array = new int[10];
        suma = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i] + " + " + suma);
            suma += array[i];
        }
    }

    // Método para mostrar el resultado
    public void mostrarResultado() {
        System.out.println("La suma de todos los números es " + suma);
    }

    public static void main(String[] args) {
        // Se crea una instancia de Ejercicio1, lo que ejecuta el constructor
        Ejercicio1 ejercicio = new Ejercicio1();
        // Se llama al método para mostrar el resultado
        ejercicio.mostrarResultado();
    }
}

```


## Ejercicio2
```sh
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        System.out.println("Introduca 5 numeros decimales por teclado");
        Scanner sc = new Scanner (System.in);
        double num[] = new double[5];

        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextDouble();
        }
        
        System.out.println("Los numeros son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
    }
}
```

```sh
import java.util.Scanner;

public class Ejercicio2 {
    private double[] numeros;

    // El constructor lee 5 números decimales
    public Ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 5 números decimales por teclado:");
        numeros = new double[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }
    }
    
    // Método para mostrar los números leídos
    public void mostrarNumeros() {
        System.out.println("Los números son:");
        for (double num : numeros) {
            System.out.println(num);
        }
    }
    
    public static void main(String[] args) {
        Ejercicio2 ej2 = new Ejercicio2();
        ej2.mostrarNumeros();
    }
}

```


## Ejercicio3
```sh
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        System.out.println("Cuantos numeros desea introducir?");
        Scanner sc = new Scanner(System.in);
        int numeros = sc.nextInt();
        
        int num[] = new int[numeros];

        System.out.println("Introduzca los numeros");
        for (int i = 0; i < numeros; i++) {
            num[i] = sc.nextInt();
        }
        
        System.out.println("Los numeros son:");
        for (int i = num.length-1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
```
```sh
import java.util.Scanner;

public class Ejercicio3 {
    private int[] numeros;

    // El constructor solicita la cantidad de números, los lee y los almacena
    public Ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números desea introducir?");
        int cantidad = sc.nextInt();
        numeros = new int[cantidad];
        System.out.println("Introduzca los números:");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = sc.nextInt();
        }
    }

    // Muestra los números en orden inverso
    public void mostrarNumerosEnReversa() {
        System.out.println("Los números en orden inverso son:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
    
    public static void main(String[] args) {
        Ejercicio3 ej3 = new Ejercicio3();
        ej3.mostrarNumerosEnReversa();
    }
}

```


## Ejercicio4
```sh
import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static int maximo(){
        int numeros[] = new int[5];
        int maximo = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Numero entero"));            
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }
    public static void main(String[] args){
        int resultado = maximo();
        JOptionPane.showMessageDialog(null, "El máximo es: " + resultado);
    }
}
```
```sh
import javax.swing.JOptionPane;

public class Ejercicio4 {
    private int[] numeros;
    private int maximo;

    // El constructor lee 5 números mediante JOptionPane y calcula el máximo
    public Ejercicio4() {
        numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero:"));
        }
        maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
    }

    // Muestra el valor máximo en un diálogo
    public void mostrarMaximo() {
        JOptionPane.showMessageDialog(null, "El máximo es: " + maximo);
    }
    
    public static void main(String[] args) {
        Ejercicio4 ej4 = new Ejercicio4();
        ej4.mostrarMaximo();
    }
}

```
## Ejercicio5
```sh
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5{
    private int numeroInicio, fin;
    public Ejercicio5(int numeroInicio, int fin){
        this.numeroInicio = numeroInicio;
        this.fin = fin;
    }
    public static int[] RellenarPares(int longitud, int fin){
        int[] array = new int[longitud];
        int i = 0;
        while (i < array.length){
            int random = (int) (Math.random() * fin + 1);
            if (random % 2 == 0){
                array[i] = random;
                i++;
            }
        }
        Arrays.sort(array);
        return array;
    }
    public static void main(String[] args){
        Scanner usuario = new Scanner(System.in);
        System.out.println("Bienvenido al programa '...', por favor, intoduzca su nombre: ");
        String nombre = usuario.nextLine();
        System.out.println("\nBienvenido al programa " + nombre + ", ahora introduzca en forma de entero la longitud de tabla");
        int numero = usuario.nextInt();
        System.out.println("\nPor ultimo, introduzca el numero final, hasta el que quieras llegar en la tabla: ");
        int fin = usuario.nextInt();
        Ejercicio5 tabla = new Ejercicio5 (numero, fin);
        System.out.println("\nEl resultado de la tabla con numeros pares es la siguiente: " + Arrays.toString(Ejercicio5.RellenarPares(numero, fin)));
        usuario.close();
    }
}
```
```sh
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    private int numero;
    private int fin;
    private int[] pares;

    // El constructor solicita los parámetros y genera la tabla de pares
    public Ejercicio5(int numero, int fin) {
        this.numero = numero;
        this.fin = fin;
        this.pares = rellenarPares(numero, fin);
    }

    // Método privado que genera un arreglo de números pares aleatorios y lo ordena
    private int[] rellenarPares(int longitud, int fin) {
        int[] array = new int[longitud];
        int i = 0;
        while (i < array.length) {
            int random = (int) (Math.random() * fin + 1);
            if (random % 2 == 0) {
                array[i] = random;
                i++;
            }
        }
        Arrays.sort(array);
        return array;
    }

    // Muestra la tabla generada
    public void mostrarTablaPares() {
        System.out.println("El resultado de la tabla con números pares es: " + Arrays.toString(pares));
    }

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Bienvenido al programa, por favor, introduzca su nombre:");
        String nombre = usuario.nextLine();
        System.out.println("Bienvenido " + nombre + ". Introduzca la longitud de la tabla:");
        int numero = usuario.nextInt();
        System.out.println("Introduzca el número final (límite):");
        int fin = usuario.nextInt();
        Ejercicio5 tabla = new Ejercicio5(numero, fin);
        tabla.mostrarTablaPares();
        usuario.close();
    }
}

```
## Ejercicio6
```sh
public class Ejercicio6 {
    public static void main(String[] args) {
        int primitiva[] = {4, 9, 7, 1, 6, 2};
        int ganadora[] = {2, 3, 1, 3, 6, 2};
        int contador = 0;
        
        for (int i = 0; i < primitiva.length; i++) {
            if (primitiva[i] == ganadora[i]) {
                contador++;
            }
        }
        System.out.println("Acertaste " + contador + " numeros");
    }
}
```
```sh
public class Ejercicio6 {
    private int[] primitiva;
    private int[] ganadora;
    private int aciertos;

    // El constructor inicializa ambos arreglos y cuenta las coincidencias
    public Ejercicio6() {
        primitiva = new int[]{4, 9, 7, 1, 6, 2};
        ganadora = new int[]{2, 3, 1, 3, 6, 2};
        aciertos = 0;
        for (int i = 0; i < primitiva.length; i++) {
            if (primitiva[i] == ganadora[i]) {
                aciertos++;
            }
        }
    }

    // Muestra la cantidad de aciertos
    public void mostrarResultado() {
        System.out.println("Acertaste " + aciertos + " números");
    }

    public static void main(String[] args) {
        Ejercicio6 ej6 = new Ejercicio6();
        ej6.mostrarResultado();
    }
}

```
## Ejercicio7
```sh
import java.util.Arrays;

public class Ejercicio7 {
    public static int[] sinRepetidos(int[] t) {
        int[] temp = new int[t.length];
        int size = 0;
        
        for (int i = 0; i < t.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < size; j++) {
                if (t[i] == temp[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                temp[size++] = t[i];
            }
        }
        
        int[] resultado = new int[size];
        System.arraycopy(temp, 0, resultado, 0, size);
        return resultado;
    }
    
    public static void main(String[] args) {
        int[] t = {1, 2, 2, 3, 4, 4, 5};
        int[] resultado = sinRepetidos(t);
        System.out.println(Arrays.toString(resultado));
    }
}
```
```sh
import java.util.Arrays;

public class Ejercicio7 {
    private int[] original;
    private int[] sinRepetidos;

    // El constructor recibe un arreglo, lo procesa y elimina duplicados
    public Ejercicio7(int[] array) {
        this.original = array;
        this.sinRepetidos = eliminarRepetidos(array);
    }

    // Método privado que elimina los elementos repetidos
    private int[] eliminarRepetidos(int[] t) {
        int[] temp = new int[t.length];
        int size = 0;
        for (int i = 0; i < t.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < size; j++) {
                if (t[i] == temp[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                temp[size++] = t[i];
            }
        }
        int[] resultado = new int[size];
        System.arraycopy(temp, 0, resultado, 0, size);
        return resultado;
    }

    // Muestra el arreglo sin elementos repetidos
    public void mostrarResultado() {
        System.out.println("Array sin repetidos: " + Arrays.toString(sinRepetidos));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        Ejercicio7 ej7 = new Ejercicio7(array);
        ej7.mostrarResultado();
    }
}

```
## Ejercicio8
```sh
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datos []; //tabla para los datos iniciales

        //creamos las tablas par e impar, inicialmente de longitud 0:
        int par[] = new int [0];
        int impar[] = new int [0];

        System.out.print("Escriba n: ");
        int n = sc.nextInt(); // n es el número de datos a leer
        datos = new int [n]; //creamos la tabla de longitud n

        // leemos del teclado los valores de la tabla
        for (int i = 0; i < datos.length; i++){
            System.out.print ("Introduzca un numero: ");
            datos[i] = sc.nextInt();
        }

        //recorremos los datos para clasificarlos
        for (int numero : datos){
        //al estar la tabla con todos los datos ordenadas, los elementos
        //se insertarán siempre al final de la tabla par o impar.
            if (numero % 2 == 0){//si número es par
                par = Arrays.copyOf (par, par.length+1); //incremento la longitud de par
                par [par.length-1] = numero; //guardo el número en el último elemento
            }else{
                impar = Arrays.copyOf(impar, impar.length+1); //igual con la tabla impar
                impar[impar.length-1] = numero;
            }
        }    
        System.out.println("Pares: " +  Arrays.toString(par));
        System.out.println("Impares: " + Arrays.toString(impar));
    }
}
```
```sh
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    private int[] datos;
    private int[] pares;
    private int[] impares;

    // El constructor solicita la cantidad de números, los lee y los clasifica
    public Ejercicio8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba n: ");
        int n = sc.nextInt();
        datos = new int[n];
        System.out.println("Introduzca " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            datos[i] = sc.nextInt();
        }
        pares = new int[0];
        impares = new int[0];
        for (int numero : datos) {
            if (numero % 2 == 0) {
                pares = Arrays.copyOf(pares, pares.length + 1);
                pares[pares.length - 1] = numero;
            } else {
                impares = Arrays.copyOf(impares, impares.length + 1);
                impares[impares.length - 1] = numero;
            }
        }
    }

    // Muestra los arreglos de números pares e impares
    public void mostrarResultados() {
        System.out.println("Pares: " + Arrays.toString(pares));
        System.out.println("Impares: " + Arrays.toString(impares));
    }

    public static void main(String[] args) {
        Ejercicio8 ej8 = new Ejercicio8();
        ej8.mostrarResultados();
    }
}

```
## Ejercicio9
```sh
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int puntos [] = new int [5]; //inicialmente intervienen 5 programadores
        for (int i = 0; i < 5; i++) {
            System.out.print ("Puntos programador (" + (i + 1) + "): ");
            puntos[i] = sc.nextInt(); //leemos los datos, que no están ordenados
        }    
        Arrays.sort (puntos); //ordenamos
        System.out.println("Puntuacion: "+ Arrays.toString(puntos));

        System.out.print("Puntos del programador de exhibicion:");
        int puntosProgExh = sc.nextInt (); //puntuación del prog. de exhibición 
        while (puntosProgExh != -1){
            int pos = Arrays.binarySearch (puntos, puntosProgExh); //buscamos
            int indiceInsercion; //donde insertar para que la tabla siga ordenada
            if (pos < 0){
                indiceInsercion = -pos - 1; //indice para que la tabla esté ordenada
            }else {
                indiceInsercion = pos;//puntuación repetida, ya está en la tabla
            }
            int copia[] = new int [puntos.length + 1]; //nueva tabla con longitud+1
            //copiamos los elementos antes del "hueco"
            System.arraycopy (puntos, 0, copia, 0, indiceInsercion);
            //copiamos desplazados los elementos tras el "hueco"
            System.arraycopy (puntos, indiceInsercion, copia, indiceInsercion + 1, puntos.length- indiceInsercion);

            copia[indiceInsercion] = puntosProgExh; //asignamos el nuevo elemento
            puntos = copia; //puntos referencia la nueva tabla

            System.out.print("Puntos del programador de exhibicion: ");
            puntosProgExh = sc.nextInt (); //puntuacióndel prog. de exhibición
        }
        System.out.println("Puntuacion final:" + Arrays.toString(puntos));
    }
}
```
```sh
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
    private int[] puntos;

    // El constructor lee las 5 puntuaciones iniciales, las ordena e inicia el proceso de inserción
    public Ejercicio9() {
        Scanner sc = new Scanner(System.in);
        puntos = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Puntos programador (" + (i + 1) + "): ");
            puntos[i] = sc.nextInt();
        }
        Arrays.sort(puntos);
        System.out.println("Puntuación inicial: " + Arrays.toString(puntos));
        
        System.out.print("Puntos del programador de exhibición: ");
        int puntosProgExh = sc.nextInt();
        while (puntosProgExh != -1) {
            int pos = Arrays.binarySearch(puntos, puntosProgExh);
            int indiceInsercion = (pos < 0) ? -pos - 1 : pos;
            int[] copia = new int[puntos.length + 1];
            System.arraycopy(puntos, 0, copia, 0, indiceInsercion);
            System.arraycopy(puntos, indiceInsercion, copia, indiceInsercion + 1, puntos.length - indiceInsercion);
            copia[indiceInsercion] = puntosProgExh;
            puntos = copia;
            
            System.out.print("Puntos del programador de exhibición: ");
            puntosProgExh = sc.nextInt();
        }
    }

    // Muestra la puntuación final
    public void mostrarPuntuacionFinal() {
        System.out.println("Puntuación final: " + Arrays.toString(puntos));
    }

    public static void main(String[] args) {
        Ejercicio9 ej9 = new Ejercicio9();
        ej9.mostrarPuntuacionFinal();
    }
}

```
## Ejercicio10
```sh
import java.util.Arrays;

public class Ejercicio10 {
    private int t, valor;
    
    public Ejercicio10(int t, int valor){
        this.t = t;
        this.valor = valor;
    }
    
    public static int[] eliminarMayores(int t[], int valor){
        int[] copia = Arrays.copyOf(t, t.length); //copia es un clon de t
        int i = 0;
        
        while (i < copia.length) { // recorremos la copia
            if (copia[i] > valor) { //Hay que eliminar la copia[i]
                copia[i] = copia[copia.length - 1]; //copiamos el último en copia[i] y decrementamos la longitud de copia en 1. Elimina el último.
                copia = Arrays.copyOf(copia, copia.length -1);//ahora tendremos que volver a comprobar copia[i]. No modificamos i
            }else{
                i++;
            }
        }
        return copia;
    }  
    
    public static void main(String[] args){
        int[] t = {1, 2, 3, 4, 5};
        int valor = 3;
        int[] resultado = eliminarMayores(t , valor);
        System.out.println(Arrays.toString(resultado));
    }
}

```
```sh
import java.util.Arrays;

public class Ejercicio10 {
    private int[] original;
    private int valorLimite;
    private int[] resultado;

    // El constructor recibe el arreglo y el valor límite, y procesa la eliminación
    public Ejercicio10(int[] array, int valorLimite) {
        this.original = array;
        this.valorLimite = valorLimite;
        this.resultado = eliminarMayores(original, valorLimite);
    }

    // Método privado que elimina los elementos mayores al valor dado
    private int[] eliminarMayores(int[] t, int valor) {
        int[] copia = Arrays.copyOf(t, t.length);
        int i = 0;
        while (i < copia.length) {
            if (copia[i] > valor) {
                copia[i] = copia[copia.length - 1];
                copia = Arrays.copyOf(copia, copia.length - 1);
            } else {
                i++;
            }
        }
        return copia;
    }

    // Muestra el arreglo resultante
    public void mostrarResultado() {
        System.out.println("Array después de eliminar valores mayores a " + valorLimite + ": " + Arrays.toString(resultado));
    }

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5};
        int valor = 3;
        Ejercicio10 ej10 = new Ejercicio10(t, valor);
        ej10.mostrarResultado();
    }
}

```
## Ejercicio11
```sh
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud de la combinacion");
        int longitud = sc.nextInt();
        int combSecre[] = new int[longitud]; //combinacion secreta
        int combJuga[] = new int[longitud]; //combinacion jugador
        
        generaCombinacion(combSecre);//generamos aleatoriamente la combinación secreta
        System.out.println(Arrays.toString(combSecre));
        System.out.println("Escriba una combinacion");
        
        leeTabla(combJuga);
        
        while (!Arrays.equals(combSecre, combJuga)) { //no sean iguales
            muestraPista(combSecre, combJuga); //mostramos las pistas
            System.out.println("Escriba una combinacion: ");
            leeTabla(combJuga);  //volvemos a pedir otra combinacion
        }
        System.out.println("La camara esta abierta");
    }
    
    static void generaCombinacion(int t[]){
        final int MAX = 5;
        for (int i = 0; i < t.length; i++) { //recorremos para leer
            t[i] = (int) (Math.random()*MAX + 1);
        }
    }
    
    static void leeTabla(int t[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
    }
    
    static void muestraPista(int secre[], int jug[]){
        System.out.println("Pistas:");
        for (int i = 0; i < jug.length; i++) {
            System.out.println(jug[i]);
            if (secre[i] > jug[i]) {
                System.out.println("mayor");
            }else if (secre[i] < jug[i]){
                System.out.println("menor");
            }else{
                System.out.println("Igual");
            }
        }
    }
}
```

```sh
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    private int[] combinacionSecreta;
    private int[] combinacionJugador;
    private int longitud;

    // El constructor inicializa la longitud, crea el arreglo secreto y lo genera aleatoriamente
    public Ejercicio11(int longitud) {
        this.longitud = longitud;
        combinacionSecreta = new int[longitud];
        combinacionJugador = new int[longitud];
        generaCombinacion(combinacionSecreta);
    }

    // Genera la combinación secreta con números entre 1 y 5
    private void generaCombinacion(int[] t) {
        final int MAX = 5;
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * MAX + 1);
        }
    }

    // Lee la combinación del jugador
    private void leeCombinacion(Scanner sc) {
        System.out.println("Introduce tu combinación (separada por espacios):");
        for (int i = 0; i < combinacionJugador.length; i++) {
            combinacionJugador[i] = sc.nextInt();
        }
    }

    // Muestra las pistas comparando cada posición
    private void muestraPista() {
        System.out.println("Pistas:");
        for (int i = 0; i < combinacionJugador.length; i++) {
            if (combinacionSecreta[i] > combinacionJugador[i]) {
                System.out.println("Posición " + (i + 1) + ": mayor");
            } else if (combinacionSecreta[i] < combinacionJugador[i]) {
                System.out.println("Posición " + (i + 1) + ": menor");
            } else {
                System.out.println("Posición " + (i + 1) + ": igual");
            }
        }
    }

    // Método para ejecutar el juego
    public void jugar() {
        Scanner sc = new Scanner(System.in);
        // (Opcional) Mostrar la combinación secreta para pruebas
        System.out.println("Combinación secreta (para depuración): " + Arrays.toString(combinacionSecreta));
        leeCombinacion(sc);
        while (!Arrays.equals(combinacionSecreta, combinacionJugador)) {
            muestraPista();
            System.out.println("Inténtalo de nuevo:");
            leeCombinacion(sc);
        }
        System.out.println("¡La cámara está abierta!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la longitud de la combinación: ");
        int longitud = sc.nextInt();
        Ejercicio11 juego = new Ejercicio11(longitud);
        juego.jugar();
    }
}

```
## Ejercicio12
```sh
import java.util.Arrays;

public class Ejercicio12 {
    public static void main(String[] args){
        int t[][];
        t = new int[5][5];
        
        for (int n = 0; n < 5; n++) {
            for (int m = 0; m < 5; m++) {
                t[n][m] = 10*n + m;
            }
        }
        System.out.println(Arrays.deepToString(t));
        for (int fila[] : t) { //los ':' significan un '=' en este caso le está dando los valores de fila a t
            for (int columna : fila) { //en este caso le está dando los valores de columan a fila
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }
}
```

```sh
import java.util.Arrays;

public class Ejercicio12 {
    private int[][] t;

    // El constructor inicializa la matriz 5x5 y la rellena con valores
    public Ejercicio12() {
        t = new int[5][5];
        for (int n = 0; n < 5; n++) {
            for (int m = 0; m < 5; m++) {
                t[n][m] = 10 * n + m;
            }
        }
    }

    // Muestra la matriz de dos formas
    public void mostrarMatriz() {
        System.out.println("Matriz (Arrays.deepToString): " + Arrays.deepToString(t));
        System.out.println("Matriz formateada:");
        for (int[] fila : t) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ejercicio12 ej12 = new Ejercicio12();
        ej12.mostrarMatriz();
    }
}

```
