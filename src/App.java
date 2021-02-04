import java.util.Arrays;

class App {
  public static void main(String[] args) {
    // imutabilidade();
    Color cinza1 = new Color(215, 215, 215);
    Color cinza2 = new Color(35, 35, 35);
    Color cinza3 = new Color(215, 215, 215);
    System.out.println(cinza1 == cinza2);
    System.out.println(cinza2 == cinza3);
    System.out.println(cinza1 == cinza3);



  }

  static void imutabilidade() {
    System.out.println("Olá mundo!");
    // primitivos
    int i = 2;
    double d = 2.2;
    boolean b = true;
    final float f = 3.5F;
    i = 5;
    // f = 78; //símbolo f não pode ser reatribuído, é constante
    // arrays em Java são objetos mutáveis
    final int[] idades = new int[3];
    // o final torna o símbolo idades não reatribuível,
    // mas não torna o array imutável!
    System.out.println(Arrays.toString(idades));
    idades[0] = 15;
    idades[1] = 25;
    idades[2] = 35;
    System.out.println(Arrays.toString(idades));
    idades[2] = 55;
    System.out.println(Arrays.toString(idades));
    // = new int[10];
    // Strings em Java (e muitas outras linguagem) é imutável
    final String nome = "Marcio";
    System.out.println(nome);
    String nova = nome.toUpperCase();
    System.out.println(nova);
    System.out.println(nome);
    zeraArray(idades);
    System.out.println(Arrays.toString(idades));
    maiusculas(nome);
    System.out.println(nome);
  }

  static void zeraArray(int[] array) {
    for (int i = 0; i < array.length; i++) array[i] = 0;
  }

  static void maiusculas(String s) {
    s.toUpperCase();
  }

}
