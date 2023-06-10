package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	
	@Test
	void _1を渡すと文字列1を返す() throws Exception {
		// 準備
		FizzBuzz fizzbuzz = new FizzBuzz();
		// 実行 & 検証
		assertEquals("1", fizzbuzz.convert(1));
	}
	
	@Test
	void _2を渡すと文字列2を返す() throws Exception {
		// 準備
		FizzBuzz fizzbuzz = new FizzBuzz();
		// 実行 & 検証
		assertEquals("2", fizzbuzz.convert(2));
	}
}
