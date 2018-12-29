using System;

class URI {

    static void Main(string[] args) {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 int x;
            double y, cons;

            x = int.Parse(Console.ReadLine());
            y = double.Parse(Console.ReadLine());

            cons = x / y;

            Console.WriteLine("{0:N3} km/l", cons);
    }

}
