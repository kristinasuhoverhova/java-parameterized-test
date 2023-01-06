public class test {
}
@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age=age;
        this.result=result;
    }

    @Parameterized.Parameters// Пометь метод аннотацией для параметров
    public static Object[][] getTextData() {
        return new Object[][] {
                {17,false},
                {21,true},
                {18,true},
                {19,true}// Заполни массив тестовыми данными и ожидаемым результатом
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        int age;
        boolean isAdult = program.checkIsAdult(18);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("текст",true,isAdult);
    }
}