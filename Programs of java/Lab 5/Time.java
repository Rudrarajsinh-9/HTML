import java.util.Scanner;
class T1 
{
    int hour;
    int min;
    Time()
    {
        int hour = 5;
        int min = 15;
    }
    Time(int hour,int min);
    {
    this.hour;
    this.min;
    } 
    void addition(Time t)
    {
        int h = this.hour+t.hour;
        int m = this.min+t.min;
        if(m>60)
        {
            m = m-60;
            h++;
        }
        System.out.println(h+ ":" +m)
    }
   
}
public class Time