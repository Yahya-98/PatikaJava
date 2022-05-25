public class Fighter {

    String name;
    int damage;
    int healt;
    int weight;
    int dodge;

    Fighter(String name, int damage, int healt, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.healt = healt;
        this.weight = weight;

        this.dodge = dodge;
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if(foe.isDodge()){
            System.out.println(foe.name + " dodgeladı");
            return foe.healt;
        }
        if (foe.healt - this.damage < 0){
            return 0;
        }
        return foe.healt - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
