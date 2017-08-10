import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Created by User on 10.08.2017.
 */
   @RunWith(Parameterized.class)
    public class ParametriseTest{

        private double firstArg;
        private double secondArg;
        private double resultArg;

        @Parameterized.Parameters
        public static Object[] data(){
            return new Object[]{
                    10.3, 20.4, 30.7
            };
        }


        @Test
        public void testSum() {
            Assert.assertSame(Calculator.sum(firstArg, secondArg), resultArg);
        }

}
