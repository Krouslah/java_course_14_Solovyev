import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        System.out.println(str);
        str.append("Сквозь туман кремнистый путь блестит;");
        str.insert(0, "Выхожу один я на дорогу;\n");
        System.out.println(str);
        System.out.println();
        str.insert(str.length(), "\nНочь тиха. Пустыня внемлет богу,");
        System.out.println(str);
        System.out.println();
        Pattern phoneNumber = Pattern.compile("\\+*\\d{11}");
        String phone = """
                +79778511408
                +79057648369
                +79698648389
                example@example.com""";
        Matcher matcher = phoneNumber.matcher(phone);
        while (matcher.find()){
            StringBuilder str2 = new StringBuilder();
            str2.insert(str2.length(), matcher.group());
            str2.replace(3,10, "*******");
            System.out.println(str2);
        }
    }
}
