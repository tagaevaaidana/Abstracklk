public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep(2,4,"M","Sheep");
        Sheep sheep1 = new Sheep(40,5,"M","Sheep");
        Sheep sheep2 = new Sheep(30,3,"M","Sheep");
       Sheep[] sheepArr = new Sheep[]{sheep,sheep1,sheep2};

        Cow cow = new Cow(60,2,"M","Cow");
        Cow cow1 = new Cow(60,2,"M","Cow");
        Cow cow2 = new Cow(60,2,"M","Cow");
        Cow cow3 = new Cow(60,2,"M","Cow");
        Cow cow4 = new Cow(60,2,"M","Cow");

        Cow[]cows = new Cow[]{cow, cow1, cow2,cow3, cow4};

        Horse horse = new Horse(70,5,"M","Horse","black");
        Horse horse1 = new Horse(70,5,"M","Horse","black");
        Horse[] horses = new Horse[]{horse,horse1};

        Farm farms = new Farm("Moscow",cows,sheepArr,horses,"Aidan");
        Farm farms2 = new Farm("Moscow",new Cow[]{cow},new Sheep[]{sheep},new Horse[]{horse}, "Aidana");









    }
}