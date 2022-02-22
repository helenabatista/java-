/*
1. Imprimir a mensagem: “É preciso fazer todos os algoritmos 
para aprender”
*/
 
package Exercicio_1;  
  
public class MainClass {  
    public static void main(String[] args) {  
        System.out.println("É preciso fazer todos os algoritmos para aprender");  
    }  
} 
 
//Saída : É preciso fazer todos os algoritmos para aprender
//***********************************************************
 
//2. Imprimir seu nome.
 
package Exercicio_2;  
  
import javax.swing.JOptionPane;  
  
public class MainClass {  
    public static void main(String[] args) {  
        String nome = JOptionPane.showInputDialog("Digite seu nome:");  
        System.out.println("Seu nome é: " + nome);  
    }  
}  
 
//Saída : Seu nome é: Maurício Carvalho
//***********************************************************
 
//3. Criar um algoritmo que imprima o produto entre 28 e 43.
 
package Exercicio_3;  
  
import javax.swing.JOptionPane;  
  
public class MainClass {  
    public static void main(String[] args) {  
        Integer n1, n2, produto;  
  
        n1 = 28;  
        n2 = 43;  
        produto = (n1 * n2);
  
        System.out.println("O Produto de: " + n1 + " * " + n2 + " é: "  
                + produto);  
 
 
//Saída : O Produto de: 28 * 43 é: 1204
//***********************************************************
 
/*
4. Criar um algoritmo que imprima a média aritmética entre os 
números 8, 9 e 7.
*/
 
package Exercicio_4;  
  
public class MainClass {  
    public static void main(String[] args) {  
        Integer mediaAritmetica;  
        mediaAritmetica = (8 + 9 + 7) / 3;  
        System.out.println("A Média Aritmética entre 8,9,7 é: " + mediaAritmetica);  
    }  
}  
//Saída: A Média Aritmética entre 8,9,7 é: 8
//***********************************************************
 
//5. Ler um número inteiro e imprimi-lo.
 
package Exercicio_5;  
  
import javax.swing.JOptionPane;  
  
public class MainClass {  
    public static void main(String[] args) {  
        int numInteiro;  
        numInteiro = Integer.parseInt(JOptionPane  
                .showInputDialog("Digite um número inteiro"));  // DIGITEI 10 !  
  
        System.out.println("O Número inteiro digitado foi :" + numInteiro);  
    }  
}  
//Saída: O Número inteiro digitado foi :10
//***********************************************************
 
//6. Ler dois números inteiros e imprimi-los.
 
package Exercicio_6;  
  
import javax.swing.JOptionPane;  
  
public class MainClass {  
    public static void main(String[] args) {  
        int numInteiro1, numInteiro2;  
        numInteiro1 = Integer.parseInt(JOptionPane  
                .showInputDialog("Digite o primeiro número inteiro")); // DIGITEI 10  
        numInteiro2 = Integer.parseInt(JOptionPane  
                .showInputDialog("Digite o segundo número inteiro")); // DIGITEI 5  
                                                                           
        System.out.println("Os Números inteiros são :" + numInteiro1 + " e "  
                + numInteiro2);  
    }  
}  
//Saída: Os Números inteiros são:10 e 5
//***********************************************************
 
/*
7. Ler um número inteiro e imprimir seu sucessor e seu 
antecessor.
*/
 
 
package Exercicio_7;  
  
import javax.swing.JOptionPane;  
  
public class MainClass {  
    public static void main(String[] args) {  
        int numInteiro, sucessor, antecessor;  
        numInteiro = Integer.parseInt(JOptionPane  
                .showInputDialog("Digite o número")); // DIGITEI 15  
  
        sucessor = numInteiro + 1;  
        antecessor = numInteiro - 1;  
  
        System.out.println("Sucessor:" + sucessor);  
        System.out.println("Antecessor:" + antecessor);  
    }  
} 
/*
Saída: Sucessor:16
       Antecessor:14
*/
//***********************************************************
 
//8. Ler nome, endereço e telefone e imprimi-los.
 
public class MainClass {  
    public static void main(String[] args) {  
        String nome, end, tel;  
        nome = JOptionPane.showInputDialog("Digite o Nome");  
        end = JOptionPane.showInputDialog("Digite o Endereço");  
        tel = JOptionPane.showInputDialog("Telefone:");  
  
        System.out.println("Nome:" + nome);  
        System.out.println("Endereço:" + end);  
        System.out.println("Telefone:" + tel);  
    }  
  
}
/*
Saída : Nome:Mauricio Carvalho
        Endereço:Rua X
        Telefone:1234-4567
*/        
//***********************************************************
/*
9. Ler dois números inteiros e imprimir a soma. Antes do 
resultado deve aparecer a palavra Soma.
*/
 
public class MainClass {  
    public static void main(String[] args) {  
        int x, y;  
        x = Integer.parseInt(JOptionPane  
                .showInputDialog("Digite o Primeiro valor:")); //DIGITEI 5  
        y = Integer.parseInt(JOptionPane  
                .showInputDialog("Digite o Segundo valor:")); //DIGITEI 10  
        System.out.println("Soma:" + (x + y));  
    }  
}  
//Saída: Soma:15
//***********************************************************
 
//10.Ler dois números inteiros e imprimir o produto.
 
public class MainClass {  
    public static void main(String[] args) {  
        Integer n1, n2, produto;  
  
        n1 = Integer.parseInt(JOptionPane  
                .showInputDialog("Digite o Valor de N1"));   //10
        n2 = Integer.parseInt(JOptionPane  
                .showInputDialog("Digite o Valor de N2"));  //2
  
        produto = (n1 * n2);  
  
        System.out.println("O Produto de: " + n1 + " * " + n2 + " é: "  
                + produto);  
                
//Saída : O Produto de: 10 * 2 é: 20
//***********************************************************
 
//11.Ler um número e imprimir a terça parte deste número.
 
public class MainClass {  
    public static void main(String[] args) {  
        Double num, tercaParte;  
  
        num = Double.parseDouble(JOptionPane.showInputDialog("Informe o Número"));  
        tercaParte = num / 3;  
        System.out.println("1/3 de: " + num + " é " + tercaParte);  
    }  
}  
//Saída  : 1/3 de: 9.0 é 3.0
//***********************************************************
/*
12.Entrar com dois números e imprimir a média aritmética com 
a mensagem “média” antes do resultado.
*/
 
public class MainClass {  
    public static void main(String[] args) {  
        double nota1, nota2, media;  
  
        nota1 = Double.parseDouble(JOptionPane  
                .showInputDialog("Entre com a Nota 1"));  //10
  
        nota2 = Double.parseDouble(JOptionPane  
                .showInputDialog("Entre com a Nota 2"));  //7
  
        media = (nota1 + nota2) / 2;  
        System.out.println("A média Aritmética é: " + media);  
  
    }  
}  
//Saída  : A média Aritmética é: 8.5
//***********************************************************
 
/*
13.Fazer um algoritmo que possa entrar com o saldo de uma 
aplicação e imprima o novo saldo, considerando um reajuste 
de 1%.
*/
 
public class MainClass {  
    public static void main(String[] args) {  
        double saldo;  
  
        saldo = Double.parseDouble(JOptionPane  
                .showInputDialog("ENTRE COM O SALDO")); // DIGITEI 100  
  
        // saldo = saldo + (saldo * 0.01);  
        // Que é a mesma coisa que:  
        saldo += (saldo * 0.01);  
  
        System.out.println("O SALDO ATUAL É DE: " + saldo);  
  
    }  
} 
//Saída  : O SALDO ATUAL É DE: 101.0
//***********************************************************
 
/*
14.Entrar com a base e altura de um retângulo e imprimir a área 
e o perímetro.
(Área=base*altura; Perímetro=2*base+2*altura)
*/
public class MainClass {  
    public static void main(String[] args) {  
        Float base, altura, area, perimetro;  
  
        base = Float.parseFloat(JOptionPane  
                .showInputDialog("Digite a base do rêtangulo"));  
  
        altura = Float.parseFloat(JOptionPane  
                .showInputDialog("Digite a altura do rêtangulo"));  
          
        perimetro = (2 * base) + (2 * altura);  
        area = base * altura;  
          
  
        System.out.println("Para um retângulo de com as medidas :" + "\n"  
                + "ALTURA:" + altura + "\n" + "BASE:" + base + "\n"  
                + "SEGUE AS MEDIDAS" + "\n" + "PERÍMETRO =" + perimetro + "\n"  
                + "ÁREA =" + area);  
    }  
}  
/*
Saída: Para um retângulo de com as medidas :
ALTURA:10.0
BASE:10.0
SEGUE AS MEDIDAS
PERÍMETRO =40.0
ÁREA =100.0
*/
//***********************************************************
/*
15.Entrar com o raio de um círculo e imprimir o perímetro e a 
área. (Perímetro=2*pi*raio; Área=pi*raio*raio; pi=3,1415)
*/
 
public class MainClass {  
    public static void main(String[] args) {  
        Double raio, perimetro, area, pi;  
  
        raio = Double.parseDouble(JOptionPane  
                .showInputDialog("DIGITE O RAIO DO CÍRCULO")); // DIGITEI 10  
        pi = 3.1415;  
        perimetro = 2 * pi * raio;  
        area = pi * raio * raio;  
  
        System.out.println("CIRCULO RAIO = " + raio);  
        System.out.println("PERÍMETRO = " + perimetro);  
        System.out.println("ÁREA = " + area);  
    }  
} 
/*
Saída: 
CIRCULO RAIO = 10.0
PERÍMETRO = 62.830000000000005
ÁREA = 314.15000000000003
*/
//***********************************************************
/*
16.Entrar com o lado de um quadrado e imprimir a área e o 
perímetro. (ver ex. 14)
*/
 
public class MainClass {  
    public static void main(String[] args) {  
        Float lado, area, perimetro;  
  
        lado = Float.parseFloat(JOptionPane  
                .showInputDialog("Digite o valor do lado do quadrado")); // DIGITEI 10  
  
        area = lado * lado;  
        perimetro = (2 * lado) + (2 * lado);  
  
        System.out.println("LADO: " + lado);  
        System.out.println("ÁREA: " + area);  
        System.out.println("PERÍMETRO:" + perimetro);  
    }  
}
/*
Saída: 
LADO: 10.0
ÁREA: 100.0
PERÍMETRO:40.0
*/
//***********************************************************
/*
17.Criar um algoritmo que calcule e imprima a área de um 
triângulo. (Área=Base*Altura)/2.
*/
 
public class MainClass {  
    public static void main(String[] args) {  
        double areaTriang, baseTriang, alturaTriang;  
  
        baseTriang = Double.parseDouble(JOptionPane  
                .showInputDialog("INFORME O VALOR DA BASE DO TRIÂNGULO"));  
  
        alturaTriang = Double.parseDouble(JOptionPane  
                .showInputDialog("INFORME O VALOR DA ALTURA DO TRIÂNGULO"));  
  
        areaTriang = (baseTriang * alturaTriang) / 2;  
        System.out.println("PARA O TRIÂNGULO:" + "\n" + "BASE =" + baseTriang  
                + " ALTURA =" + alturaTriang + "\n" + "ÁREA = " + areaTriang);  
    }  
}  
/*
Saída :
PARA O TRIÂNGULO:
BASE =10.0 ALTURA =10.0
ÁREA = 50.0
*/
//***********************************************************
/*
18.Em épocas de pouco dinheiro, os comerciantes estão 
procurando aumentar suas vendas oferecendo desconto. Faça  
um algoritmo possa entrar com o valor de um produto e 
imprima o novo valor tendo em vista que o desconto foi de 9%.
*/
public class MainClass {  
    static final Double descontoProduto = 0.09;  
    public static Double ValorProduto;  
  
    public static void main(String[] args) {  
  
        String str = "Entre com o valor do Produto";  
        ValorProduto = Double.parseDouble(JOptionPane.showInputDialog(str));  
        ValorProduto -= ValorProduto * descontoProduto;  
  
        str = "O Valor deste produto com desconto é: R$" + ValorProduto;  
        JOptionPane.showMessageDialog(null, str);  
    }  
}  
//Saída para o valor 10: "O Valor deste produto com desconto é: R$9.1"
//***********************************************************
 
/*
19.Construir um algoritmo que leia um número e indique se o 
número digitado está compreendido entre 20 e 90 ou não.
*/
public class MainClass {  
    static Double numEntrada;  
  
    public static void main(String[] args) {  
        String str = "Informe o Nº que deseja avaliar";  
        numEntrada = Double.parseDouble(JOptionPane.showInputDialog(str));  
  
        if (numEntrada >= 20 && numEntrada <= 90) {  
            str = "O Número:" + numEntrada + " , Está compreendido entre 20 e 90";  
            JOptionPane.showMessageDialog(null, str);  
        } else {  
            str = "O Número:" + numEntrada  
                    + " , Não está compreendido entre 20 e 90";  
            JOptionPane.showMessageDialog(null, str);  
        }  
    }  
}  
/*
Saída para o valor 25:
"O Número: 25, Está compreendido entre 20 e 90"
 
Saída para o valor 10:
"O Número: 10, Está compreendido entre 20 e 90" 
 
************************************************************/
/*
20.Entrar com o nome, sexo e idade de uma pessoa. Se a pessoa 
for do sexo feminino e tiver menos que 25 anos, imprimir  
nome e mensagem: ACEITA. Caso contrário, imprimir nome
e mensagem: NÃO ACEITA. (Considerar f ou F no sexo).
*/
public class MainClass {  
    // Declara as variáveis  
    static Integer idade;  
    static String sexo;  
    static String nome;  
  
    public static void main(String[] args) {  
        // Declara uma variável do tipo String para receber as mensagens que  
        // serão exibidas ao usuário.  
        String str = "Informe o nome:";  
        // Atribui o valor digitado a variável nome.  
        nome = JOptionPane.showInputDialog(null, str);  
  
        str = "Informe a Idade:";  
        // Atribui um valor a variável idade, informado pelo usuário;  
        idade = Integer.parseInt(JOptionPane.showInputDialog(str));  
        Integer laco = 0;  
  
        // FAÇA (do)  
        // Crio um laço se a pessoa digitar algo que não seja F-f ou M-m  
        // o sistema peça para a informação  
        // informar novamente.  
  
        do {  
            str = "Informe o Sexo :" + "\n" + " F-Feminino" + "\n"  
                    + "M-Masculino";  
            // Pega o valor informado pelo Usúario e atribui a variável sexo.  
            sexo = JOptionPane.showInputDialog(str);  
  
            // Deixa a Letra digitada em Maiúsculo exemplo m -> M , f-F.  
            // Assim mesmo se a pessoa infromar F ou f vai funcionar (:  
            sexo = sexo.toUpperCase();  
  
            // Seleciona a variável Sexo para testar os casos.  
            switch (sexo) {  
            // Caso F faça...  
            case "F":  
                // Cria String com todos os dados da pessoa (Sexo Feminino).  
                str = "Nome:" + nome + "\n";  
                str += "Sexo:" + sexo + "\n";  
                str += "Idade:" + idade;  
                // Testa idade < que 25 anos  
                if (idade < 25) {  
                    JOptionPane.showMessageDialog(null, "ACEITA" + str);  
                    // informo que pode sair do laço  
                    laco = 1;  
                } else {  
                    JOptionPane.showMessageDialog(null, "NÃO ACEITA" + str);  
                }  
                break;  
            // Caso M faça...  
            case "M":  
                str = "Nome:" + nome + "\n";  
                str += "Sexo:" + sexo + "\n";  
                str += "Idade:" + idade;  
                JOptionPane.showMessageDialog(null, "NÃO ACEITA\n"+ str);  
                // informo que pode sair do laço  
                laco = 1;  
                break;  
  
            default:  
                // Caso não seja nenhum dos 2 irá cair aqui no default,imprimir  
                // o  
                // erro e pedir para selecionar novamente F OU M por causa do  
                // Laço.  
                str = "ERRO OPÇÃO INVÀLIDA" + "\n" + "Informe : F-Feminino"  
                        + "\n" + "M-Masculino";  
                JOptionPane.showMessageDialog(null, str);  
                break;  
            }  
            // ENQUANDO FOR VALOR DE LAÇO FOR -> 0  
        } while (laco == 0);  
    }  
}  
 
/*Saída : por ter muitas possibilidades , quem quiser eu ajudo a testar .
************************************************************/
 
/*
23.Ler um número e indicar se o número é múltiplo de 4 o 
múltiplo de 7.
*/
public class MainClass {  
    static String str;  
    static Integer num;  
  
    public static void main(String[] args) {  
  
        str = "Infome o Nº";  
        num = Integer.parseInt(JOptionPane.showInputDialog(str));  
  
        str = " - Não é multiplo de 4 nem 7";  
        if (num % 4 == 0) {  
            str = " é - Multiplo de 4.";  
            JOptionPane.showMessageDialog(null, num + str);  
        } else if (num % 7 == 0) {  
            str = " é - Multiplo de 7.";  
            JOptionPane.showMessageDialog(null, num + str);  
        } else {  
            JOptionPane.showMessageDialog(null,num + str);  
        }  
    }  
}  