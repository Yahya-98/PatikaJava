public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 =f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        double randomNumber = Math.random() * 100;
        if(isCeck()){
            if(randomNumber <= 50){
                this.f2.healt = f1.hit(f2);
            }else{
                this.f1.healt = f1.hit(f2);
            }
            while (this.f1.healt > 0 && this.f2.healt >0){
                System.out.println("===== YENİ ROUND =====");
                this.f2.healt = f1.hit(f2);
                if(isWin()){
                    break;
                }
                System.out.println(this.f2.name + " Sağlık : " + this.f2.healt);
                this.f1.healt = f2.hit(f1);
                if(isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Sağlık : " + this.f1.healt);
            }
        }else{
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCeck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if(this.f1.healt == 0){
            System.out.println(f2.name + " kazandı !");
            return true;
        }
        if (this.f2.healt == 0){
            System.out.println(this.f1.name + " kazandı !");
        }
        return false;
    }
}

