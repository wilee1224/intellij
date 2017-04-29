import java.util.Scanner;

/**
 * Created by SDS on 2017-04-14.
 */
public class test
{
    static int n,k,cnt, temp,ans;
    static int[] arr;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        arr = new int[n+1];

        //n까지 수를 채움
        for(int i = 2 ; i <= n ; i++)
        {
            arr[i] = i;
        }

        // 2 ~ n까지 배열을 인쇄
        for(int i = 2 ; i <= n ; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //0으로 만든 k 번째 숫자를 ans에 저장
        for(int i = 2 ; i <=n ; i+=2)
        {
            temp = arr[i];
            arr[i] = 0;
            cnt++;
            System.out.print("cnt : "+cnt+", ");
            if(cnt == k) ans = temp;
        }
        System.out.println();
        // 2 ~ n까지 배열을 인쇄(2의 배수 0으로 만든 후)
        for(int i = 2 ; i <= n ; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println(cnt);
        System.out.println();

        for(int i = 3 ; i <= n ; i++)
        {

            for(int j = 1 ; cnt < k  ; j++)
            {
                if (arr[i] != 0)
                {
                    System.out.println("i :" + i + ", " + " j :" + j + ", ");
                    ans = arr[i * j];
                    arr[i * j] = 0;
                    System.out.print("ans :" + ans + ", ");
                    cnt++;
                    System.out.println("cnt : " + cnt);
                }
            }

        }

        System.out.println("Ans : "+ans);

    }


/*    static boolean isPrime(int z)
    {
        System.out.print(z+" isPrime : ");
        if(z==1) return false;
        else if(z==2) return true;
            else if(z>2)
                {
                    for (int i = 2; i <= Math.sqrt(z); i++)
                    {
                        if (z % i == 0) return false;
                        // z>2 -> 2부터 z의 제곱근(sqrt)까지 루프, 나머지가 0이면 false
                    }
                }
        return true;        //루프 종료시까지 false 없으면 true
    }*/
}