package sem2;

public class NullExp {
    public static void main(String[] args) throws Exception {
        isNull(null);
    }

    private  static void isNull(String name) {
        if(name == null || name.isEmpty()){
            throw new RuntimeException("is null");
    
        }
        else
            name = name;
    } 
}
