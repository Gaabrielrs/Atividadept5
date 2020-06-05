import java.util.Scanner;

class VerificarPalindromo { 

    static Scanner I = new Scanner(System.in);

    public static void main(String args[]){

        System.out.print("Digite uma palavra(Para sair digite FIM): ");
        String s = I.nextLine();
        int nCont = 0;
        StringBuilder sb = new StringBuilder(s);

        if(s.equals(sb.reverse().toString()))
        {  
            System.out.println("É palindromo") ;
            nCont++;
            System.out.println("Contabilizados " + nCont + " palindromos");
            System.out.println("------------");
        }
        else {                                                  
            System.out.println("Não é palindromo");
            System.out.println("Contabilizados " + nCont + " palindromos");
            System.out.println("------------");

        while(!s.equals("fim")){

            System.out.print(("Digite uma palavra(Para sair digite FIM): "));
            s = I.nextLine();
            sb = new StringBuilder(s);            

            if (s.equals(sb.reverse().toString())){  
                System.out.println("É palindromo") ;
                nCont++;
                System.out.println("Contabilizados " + nCont + " palindromos");
                System.out.println("------------");
            }
            else {                                                  
                System.out.println("Não é palindromo");
                System.out.println("Contabilizados " + nCont + " palindromos");
                System.out.println("------------");
                }
            }
        }
    }
}
