import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

    public static void main(String[] args) throws ParseException {

//        String str1= "15-04-1990";
//        SimpleDateFormat dat1 =  new SimpleDateFormat("dd-MM-yyyy") ;
//         Date dat2 =  dat1.parse(str1)  ;


        String date ="0000-01-01";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd" );  //01янв0001 года   -парсер человеческий!!!! а 0000 в риале тоже 0001
        Date dateOne = format.parse(date);
        System.out.println(dateOne);




    }
}



