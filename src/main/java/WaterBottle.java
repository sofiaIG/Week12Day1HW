public class WaterBottle {

    private int volume = 100;


    public int getVolume(){
        return volume;
    }

    public int setVolume(int newVolume){
        volume = newVolume;
        return volume;
    }

    public int add10(){
        volume +=10;
        return volume;
    }

    public int empty(){
        volume = 0;
        return volume;
    }

    public int refill(){
        if (volume==0){
            return volume =100;
        }
        else
            return volume;
    }
}
