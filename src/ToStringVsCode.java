class Robo{
    private String name;
    private int id;

    public Robo(int id, String name){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
    }
}

public class ToStringVsCode {
    public static void main(String[] args){

        Robo robo1 = new Robo(1, "chitti");
        System.out.println(robo1);

    }
}
