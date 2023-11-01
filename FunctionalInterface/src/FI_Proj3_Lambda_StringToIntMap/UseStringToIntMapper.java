package FI_Proj3_Lambda_StringToIntMap;

public class UseStringToIntMapper {
    public static void main(String[] args) {
        StringToIntMapper stringToIntMapper = (username)-> {
            return username.length();
        };
        System.out.println(stringToIntMapper.map("Bhuwan"));
    }
}
