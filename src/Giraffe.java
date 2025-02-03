public class Giraffe {

    private float age;
    private float weight;
    private String color = "brown";
    private float neck_length = 0;
    private float coff = 0.35f;


    public Giraffe(float age, int weight){
        this.age = age;
        this.weight = weight;
        color = color;
        getNeck_length(age);
    }

    public Giraffe() {
        age = 0f;
        weight = 1000f;
        neck_length = 100f;
        color = color;
    }

    //Метод взросления, учитывая шею
    public float bDay(float age){
        return this.age + getNeck_length(this.age);
    }

    //Написал, чтобы проверить, что возвращает цвет =)
    public String getColor(){
        return color;
    }

    // Длинна шеи
    public float getNeck_length(float age){
        return neck_length = this.age * coff;
    }

    public float eat(float eatCount){
        return weight = weight + eatCount;
    }
    public float poop(float poopCount){
       return weight = weight - poopCount;
    }

}
