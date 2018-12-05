
package bozo;

/**
 *
 * @author Luis Guilherme
 */
public class Bozo {
    /*
	 * Jogo Bozó (neste jogo todos os valores aleatórios de 5 dados são iguais - dado1, dado2, dado3, dado4 e dado5)
	 */
	
	public static int rolarDado() {   
		//número aleatório de 0 a quase 1
	double randomNumber=Math.random();
	//mudar o intervalo de 0 a quase 6
	randomNumber=randomNumber * 6;
	//intervalo de mudança até um
	randomNumber=randomNumber + 1;
	//converter para inteiro (ignorar a parte decimal)
	int randomInt= (int) randomNumber;
	return randomInt;
	}


public static int continueRolando() 
{
    int dado1 = rolarDado();
    int dado2 = rolarDado();
    int dado3 = rolarDado();
    int dado4 = rolarDado();
    int dado5 = rolarDado();
    int contador = 1;			//  Enquanto contador de loop
    while (!(dado1 == dado2 && dado2 == dado3 && dado3 == dado4  && dado4 == dado5)) { // Enquanto condição loop
        //Precisamos re-rolar
        dado1 = rolarDado();
        dado2 = rolarDado();
        dado3 = rolarDado();
        dado4 = rolarDado();
        dado5 = rolarDado();
        contador=contador + 1;  // Enquanto incremento de loop. pode ser contador ++ (mão curta)
    }
    return contador;
}
	public static void main(String[] args) {
		System.out.println("Depois de "+continueRolando() + " vezes, os valores aleatórios de dados1, dados2, dados3, dados4 e dados5 são iguais");

	}

}

