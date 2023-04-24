public class Aula_4_OperadoresAritméticos {
    public static void main(String[] args) {
        
        /********************/
        /*OPERADORES UNÁRIOS*/
        int a, b;

        a++; // ou a = a + 1 (INCREMENTO)
        a--; // ou a = a -1 (DECREMENTO)

        /********************/
        /*OPERADORES DE ATRIBUIÇÃO*/
        a += b; // ou a = a + b (SOMAR E ATRIBUIR)
        a -= b; // ou a = a - b (SUBTRAIR E ATRIBUIR)
        a *= b; // ou a = a * b (MULTIPLICAR E ATRIBUIR)
        a /= b; // ou a = a / b (DIVIDIR E ATRIBUIR)
        a %= b; // ou a = a % b (RETOS E ATRIBUIR)

        /********************/
        /*CLASSE MATH*/
        //Constanate
        Math.PI; //= 3.1415...

        //Exponeciação
        Math.pow(5,2); //= 25

        //Raiz quadrada
        Math.sqrt(a); //= 5   

        //Raz cúbica 
        Math.cbrt(b); //= 3  

        /********************/
        /*ARREDONDAMENTOS*/
        //valor absoluto
        Math.abs(-10); // = 10

        //Arredonda para baixo
        Math.floor(3.9); // = 3

        //Arredodamento para cima
        Math.ceil(4.2); // = 5

        //Arredondamento aritmeticamente
        Math.round(5.6); // = 6

        /*************************************/

        //GERANDO NÚMEROS ALEATÓRIOS
        double num = Math.random();
        int n = (int) (1 + num * (10-1));

        System.out.println(n);        
    }
    
}
