/* 2.20) dados 2 numeros enteros J, K se desea saber si estos numeros son amigos.
 Ej. Si J=284 y K=220 =>
284 = 1, 2, 4, 71, 142 => 220
220 = 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 => 284
 */
package EJER01;

public class Ej2_20_SaberSiSonAmigos {
public static void esAmigo(int j, int k){
    int aux=0, aux2=0;
    int _j=j, _k=k;
    for(int i=1;i<j;i++){
        if(j%i==0)
            aux=i+aux;
    }
    for(int i=1;i<k;i++){
        if(k%i==0)
            aux2=aux2+i;
    }
    if((aux==_k) && (aux2==_j))
        System.out.println("Los numeros son AMIGOS");
    else
        System.out.println("Los numeros son NO AMIGOS");
}
    public static void main(String[] args) {
        int _valor1 = Validaciones.generaPositivo("Ingrese el valor J: ");
        int _valor2 = Validaciones.generaPositivo("Ingrese el valor K: ");
        esAmigo(_valor1, _valor2);
    }
}
