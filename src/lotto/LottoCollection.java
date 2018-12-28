package lotto;

import java.util.Random;
import java.util.TreeSet;

public class LottoCollection {

    public String takeBall(int N, int M) {
	Random ran = new Random();
	String ball = "";
	TreeSet<String> result = new TreeSet<>();

	if (M > N) {
	    M = N;
	}

	do {
	    ball = String.format("%02d", ran.nextInt(N) + 1);
	    result.add(ball);
	} while (result.size() < M);

	System.out.println(result.size());
	return result.toString();
    }

}
