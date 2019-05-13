public class Server implements Runnable {

    private volatile boolean stop = false;
    private long start = System.currentTimeMillis();
    private long limit;

    public Server(int time){
        limit = start+time;
    }

   @Override
public void run(){

    while(System.currentTimeMillis()<limit){
        new Server(0).getRandomWord(Main.palindromsArray);
    }
}

private String getRandomWord(String[]strList){
    return strList[(int)Math.random()*strList.length];
}



}
