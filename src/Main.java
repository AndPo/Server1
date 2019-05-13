import java.util.ArrayList;
import java.util.Timer;

public class Main {


    public static String[] palindromsArray = {"вирив", "вишив", "вилив", "вимив", "око", "тут", "кок", "шалаш", "дід", "піп", "біб", "Пилип", "Алла", "Анна", "комок", "ротатор", "корок", "зараз", "багнет", "бахур", "баюра", "береги", "блават", "блюзнірство", "бовван", "бовваніти", "брезкнути", "брость", "бузувір", "бузько", "буцегарня", "бязь", "ватра", "верф", "вино", "висмик", "відтак", "вікопомний", "вно", "віхоть", "врна,", "в’язи", "габа", "гателИти", "герць", "гиря", "ґандж,", "ґевал", "ґніт", "ґорґоші", "ґуральня", "далебі", "двірець", "десниця", "дженджуристий", "джереґеля", "джиґун", "дзвнка", "дзиґарі", "допіру", "достоту", "жир", "заполоч", "захланний", "знічев’я", "зугарний", "кавалок", "калабаня,", "карафа", "картатий", "кІнва", "кльба", "комиза", "коц", "краля", "кріс", "кжіль", "лайдак", "лАнець", "ланіти", "легіт", "леґінь", "листковий", "літепло", "лда", "лутка", "митусем", "муравель", "мурелі", "навІдліг", "навпрошки", "наглий", "напашки", "напірник,", "натщесерце,", "невістулька,", "нехворощ", "нижник", "нівроку", "обрус", "оковита", "осоння", "паламар", "перебендя", "печеня", "поготв", "позрний", "помисливий", "пошиванка,", "прцінь", "притИчина", "путівець", "рамена", "рахманний", "ремствувати", "ринва", "рінь,", "робітня", "ружина", "рурка", "світлина", "свічадо", "святенник", "серпанок", "стрій", "талан", "тирса", "тривкий", "туркіт", "філіжанка", "фіранка", "харапудитися", "цебер,", "церата", "цигикач,", "черінь", "чоловічок", "шабатура", "шпиталь", "штука", "шуйця", "ятка"};


    public static void main(String[] args) {

        Main mainObj = new Main();
        int counter = 0;
        ArrayList<Thread> threadsList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            threadsList.add(new Thread(mainObj.runnable));
            System.out.println("thread_"+i);
            threadsList.get(i).start();
            try {
                threadsList.get(i).join();
            }catch (InterruptedException iex){
                iex.printStackTrace();
            }
        }
        System.out.println(threadsList.get((int)Math.random()*10).getState());
/*
        Thread thread1 = new Thread(mainObj.runnable);
        thread1.start();
*/

    }

    private String isPalindrom(String word){
        Boolean palindrom = true;
        for (int i = 0; i < (word.length()/2); i++) {
            if(word.charAt(i)!=word.charAt(word.length()-i-1)){
                palindrom = false;
                break;
            }
        }
        return palindrom ? "IS palindrom" : "NOT palindrom";
    }

     Runnable  runnable =  () ->{

             String randomWord = palindromsArray[(int) (Math.random() * palindromsArray.length)];
             System.out.print(randomWord + " -> ");
             System.out.println(isPalindrom(randomWord));

    };
}
