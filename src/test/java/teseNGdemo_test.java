
import org.testng.Assert;
import org.testng.annotations.Test;

public class teseNGdemo_test {

    addnum ins1= new addnum();
    mullnumber ins2=new mullnumber();
    devnumber ins3=new devnumber();

   @Test
   public void addtionTest(int a, int b){
       Assert.assertEquals(5,ins1.addtion(3,2));
   }
    public void multiplicationTest(int a,int b){
       Assert.assertEquals(6,ins2.multiplication(3,2));
    }

    public void devition(int a,int b)
    {
        Assert.assertNull( ins3.devition(5,0),"correct");
        Assert.assertNotNull(ins3.devition(6,3),"correct");

    }


}
