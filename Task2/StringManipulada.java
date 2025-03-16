package Task2;
public class StringManipulada 
{
    public static void main(String[] agrs)
    {
        String palavra = "Teste Palavra123";

        System.out.println("Numero de caracteres: " + palavra.length());
        System.out.println("Maiuscula: " + palavra.toUpperCase());



        System.out.println(palavra.toLowerCase().startsWith("uni"));
        System.out.println(palavra.toLowerCase().endsWith("rio"));
    }

    public static int contVogais(String txt)
    {
        int count = 0;
        for (char c : txt.toLowerCase().toCharArray())
        {
            
        }
    }
}