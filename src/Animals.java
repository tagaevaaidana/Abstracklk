public class Animals {
    private int weight;
    private int age;
    private String gender;
    private String NickName;

    public Animals(int weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        NickName = nickName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", NickName='" + NickName + '\'' +
                '}';
    }
}
