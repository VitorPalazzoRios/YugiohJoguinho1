package jogobrabo;
import java.util.Scanner;
public class JogoBrabo {
    /*
     esse é um algoritimo com uma breve simulação do jogo Yu-Gi-Oh!
     alguma regras importantes para ser descritas nesse algoritimo
     voce nao pode invocar o mago negro direto da sua mão pois ele tem 7 estrelas, apenas com cartas magicas
     e seu objetivo e fazer com que os pontos de vida de kaiba chegue a 0
     Divirta-se :)
     */

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("É hora do duelo!!");
        System.out.println("Seu desafio é ganhar do kaiba que quer ser o Rei dos duelos");
        int Lifepoint1 = 1500;
        int LifepointBot = 4500;
        int magonegro = 2500;
        int escolha1;
        int escolha2;
        int escolha3;
        int escolha4;
        int x = 0, y = 0 , z = 0,a =0;
        String carta2 = "Regras Antigas";
        String carta3 = "Mil Facas";
        String carta4 = "Monstro que renasce";
        System.out.println("Kaiba está prestes a ganhar o jogo com o seu Blue Eyes Ultimate Dragon com 4500 de ATK");
        System.out.println("Voce tem " + Lifepoint1 + " de lifepoints");
        System.out.println("Kaiba tem " + LifepointBot + " de lifepoints");
        System.out.println("Voce tem 4 cartas na mão e elas são:");
        System.out.println("Mago Negro com 2500 de ATK");
        System.out.println(" ");
        System.out.println("Carta Magica : Mil facas seu efeito é : Se vc controlar um monstro chamado Mago negro");
        System.out.println("voce pode destruir um monstro que seu oponente controla");
        System.out.println(" ");
        System.out.println("Carta Magica: regras antigas:Voce pode invocar qualquer monstro normal acima de 5 estrelas");
        System.out.println(" ");
        System.out.println("Voce tem a maga negra em seu cemiterio com 2000 de ATK");
        System.out.println(" ");
        System.out.println("Carta Magica: Monstro que renasce:Voce pode reviver um monstro do seu cemiterio ou do cemiterio do seu oponente ");
        System.out.println(" ");
        System.out.println("FAÇA A SECUENCIA CERTA PARA GANHAR O DUELO!!!!!!");
        while( x == 0){
        System.out.println("1 = Monstro que renasce, 2 = Mil Facas, 3= Regras antigas");
        escolha1 = ler.nextInt();
        
        if (escolha1 != 3) {
            System.out.println("Carta errada , KAIBA OBLITEROU VOCE");
        
        }else
            x = 1 ;
            }  
        while( y == 0){
        System.out.println("Voce invocou o mago negro usando a regras antigas, qual sua proxima jogada ?");
        System.out.println("1 = Monstro que renasce, 2 = Mil Facas");
        escolha2 = ler.nextInt();
        
        if (escolha2 != 2) {
            System.out.println("Escolha errada, KAIBA OBLITEROU VOCE");
       
        } else 
            y =1 ;
            }
            System.out.println("Voce joga a carta magica MIL FACAS, e acaba com o Blue eyes de Kaiba");
            System.out.println("Kaiba está muito nervoso pois não espera que voce tivesse a mil facas na mão");
            System.out.println("Ele ativa sua carta armadilha Recarga de alma");
            System.out.println("Ele paga 2000 pontos de Vida para invocar seu Blue eyes do cemiterio");
            System.out.println("em modo de defesa e com o ATK E DEF zerados");
            System.out.println("E Voce compra uma carta");
            System.out.println("voce compra o Jack's Knight um monstro de 5 estrelas");
            LifepointBot = LifepointBot - 2000;
            System.out.println("");
            System.out.println("AGORA É SUA CHANCE DE BRILHAR");
        while(z == 0){
        System.out.println("1 = Monstro que renasce, 2 = Invocar Jacks Knight");
        escolha3 = ler.nextInt();
        if (escolha3 != 1) {
            System.out.println("Voce invocou Jacks Knight mas nao consiguiu zerar os life points ");
            System.out.println("e kaiba obliterou voce");
        }else
            z = 1 ;
            }
             System.out.println("Voce ativou o monstro que renasce e invocou a maga negra do cemiterio");
             while(a == 0){
            System.out.println("Voce ataca o blue eyes de kaiba com quem ? 1 = Mago negro ou 2 = Maga negra ?");
            escolha4 = ler.nextInt();
            
             if (escolha4 != 2) {
                 System.out.println("Voce atacou com o mago negro e não conseguiu zerar os lifepoint do Kaiba");
                 System.out.println("ELE OBLITEROU VOCE"); 
             }else
                 a =1 ;
                 }
            System.out.println("voce ataca kaiba com a maga nega e em seguida ataca kaiba com mago negro");
            System.out.println("PARABENS VOCE É O REI DOS DUELOS");
            LifepointBot = LifepointBot - magonegro;
            System.out.println("Life points de kaiba :" + LifepointBot);
       
        
        }
    }

