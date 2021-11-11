package Labb1;


import java.io.IOException;

public class Main {
    Volvo240 bil = new Volvo240();
    boolean off = false;

    public static void main(String[] args)  {
        new Main().printCoordinates();
    }

    public static void clearConsole() throws IOException{
        final String os = System.getProperty("os.name");

        if (os.contains("Windows")) {
            Runtime.getRuntime().exec("cls");
        } else {
            Runtime.getRuntime().exec("clear");
        }
    }


    public void printCoordinates(){
        bil.incrementSpeed(5);
        bil.move();
        System.out.println("Y:"+bil.getCoordinates()[0]+", X:"+bil.getCoordinates()[1]);
    }

}
