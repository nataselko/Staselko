public class Hum {

    private String name;
    public static int count;

    public Hum(String name) {
        this.name = name;
        count++;


    }

    public void setName(String name) {
        this.name = name;

    }
   // public static int count(){
      //  count++;
      //  return count;
    //}

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }
}
