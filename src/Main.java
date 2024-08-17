import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		char []valoresAGuardarChar;
		 
		
		valoresAGuardarChar = in.next().toCharArray();//serve para transformar cada um dos digitos em um carater e guarda no array cada caracter
		int[]valoresAGuardarInt = new int [13];//serve para criar um array de valores inteiros com uma capacidade de 13 espaços
		
		for(int i=0;i<13;i++) {
		
			 valoresAGuardarInt[i] = valoresAGuardarChar[i]-'0'; }//serve para transformar o carater em inteiro
		
		int soma = 0;
		for (int z=1; z<12; z+=2) {
			valoresAGuardarInt[z]=valoresAGuardarInt[z]*3;
			soma= soma + valoresAGuardarInt[z];
			
		}
		
		for (int z=0; z<12; z+=2) {
			valoresAGuardarInt[z]=valoresAGuardarInt[z]*1;
			soma = soma + valoresAGuardarInt[z];
			
		}
		
		int resto = soma%10;
		int digitoControlo = 10 - resto;	
		if (digitoControlo == 10) {
			digitoControlo = 0;
		}else {digitoControlo =10 - resto;}
		
		if(digitoControlo == valoresAGuardarInt[12]) {System.out.println("OK");}
		else {System.out.println("ERRO " + digitoControlo);}
		
		
	}
	}

