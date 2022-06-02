public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {

        //throw new UnsupportedOperationException()
        //khi đang thực hiện test sẽ để câu lệnh trên cho mn biết
        if(number < 0)
            return  -number;
        return number;
    }
}
