class ThreadSimulator implements Runnable {

    public static String[] palindromsArray = {"вирив", "вишив", "вилив", "вимив", "око", "тут", "кок", "шалаш", "дід", "піп", "біб", "Пилип", "Алла", "Анна", "комок", "ротатор", "корок", "зараз", "багнет", "бахур", "баюра", "береги", "блават", "блюзнірство", "бовван", "бовваніти", "брезкнути", "брость", "бузувір", "бузько", "буцегарня", "бязь", "ватра", "верф", "вино", "висмик", "відтак", "вікопомний", "вно", "віхоть", "врна,", "в’язи", "габа", "гателИти", "герць", "гиря", "ґандж,", "ґевал", "ґніт", "ґорґоші", "ґуральня", "далебі", "двірець", "десниця", "дженджуристий", "джереґеля", "джиґун", "дзвнка", "дзиґарі", "допіру", "достоту", "жир", "заполоч", "захланний", "знічев’я", "зугарний", "кавалок", "калабаня,", "карафа", "картатий", "кІнва", "кльба", "комиза", "коц", "краля", "кріс", "кжіль", "лайдак", "лАнець", "ланіти", "легіт", "леґінь", "листковий", "літепло", "лда", "лутка", "митусем", "муравель", "мурелі", "навІдліг", "навпрошки", "наглий", "напашки", "напірник,", "натщесерце,", "невістулька,", "нехворощ", "нижник", "нівроку", "обрус", "оковита", "осоння", "паламар", "перебендя", "печеня", "поготв", "позрний", "помисливий", "пошиванка,", "прцінь", "притИчина", "путівець", "рамена", "рахманний", "ремствувати", "ринва", "рінь,", "робітня", "ружина", "рурка", "світлина", "свічадо", "святенник", "серпанок", "стрій", "талан", "тирса", "тривкий", "туркіт", "філіжанка", "фіранка", "харапудитися", "цебер,", "церата", "цигикач,", "черінь", "чоловічок", "шабатура", "шпиталь", "штука", "шуйця", "ятка"};

    private long millisTime;

    public ThreadSimulator(){

    }

    public ThreadSimulator(int time){
        millisTime = time;
    }

    public void start(){
      //  synchronized (this){
            this.run();
       // }

    }


 /*public void run(){
        millisTime += System.currentTimeMillis();
     while(System.currentTimeMillis()<millisTime) {
         String randomWord  = this.getRandom();
         System.out.print(randomWord + " -> ");
         System.out.println(isPalindrom(randomWord));
    }
}*/

    public void run(){
        for (int i = 0; i < palindromsArray.length; i++) {
            System.out.print(palindromsArray[i] + " -> ");
            System.out.println(isPalindrom(palindromsArray[i]));
        }
        System.out.println("-----------------------------");

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

    public String getRandom(){
            return palindromsArray[(int) (Math.random() * palindromsArray.length)];
    }

}
