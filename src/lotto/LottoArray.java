package lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoArray {
    int[] ball;
    int ballIndex;

    public void creatBall(int N) {
	ballIndex = N + 1; // ����+1
	ball = new int[ballIndex];
	for (int i = 1; i < ball.length; i++) {
	    ball[i] = i;
	}
    }

    public void takeBall(int M) {
	Random ran = new Random();
	if (M < ballIndex) {
	    for (int i = 0; i < 100; i++) // ���ö���
	    {
		int tempIndex = ran.nextInt(ballIndex);
		ball[0] = ball[1];
		ball[1] = ball[tempIndex];
		ball[tempIndex] = ball[0];
	    }

	    for (int i = 1; i <= M; i++) // ��ֳz�y
	    {
		Arrays.sort(ball, 1, M + 1);
		System.out.println("ball[" + i + "] = " + String.format("%02d", ball[i]));
	    }

	} else {
	    System.out.println("����y�Ƥ��i�j���`��");
	}

    }
}
