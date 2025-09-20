package entities;

public class Bill {

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;


    public double cover() {
        if (feeding() > 30){
            return 0.00;
        }
        else {
            return 4.00;
        }
    }

    public double feeding(){
        return (beer * 5.00) + (barbecue * 7.00) + (softDrink * 3.00);
    }

    public double ticket(){
        int masculino = 10;
        int feminino = 8;

        if(gender == 'M'){
            return masculino;
        }
        else {
            return feminino;
        }
    }

    public double total(){
        return cover() + feeding() + ticket();
    }
}


