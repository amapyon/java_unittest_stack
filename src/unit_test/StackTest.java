package unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testInit() throws Exception {
		// Stackのインスタンスを生成した時に
		// size()メソッドが0を返すかを確認する
		// capacity()メソッドが10を返すかを確認する
		Stack stack = new Stack();
		assertEquals(0, stack.size());
	}

	@Test
	public void testCapacity() throws Exception {
		// Stackのインスタンスを生成する際に
		// 整数を渡した時に、capacity()メソッドが
		// スタックの容量を返すかを確認する
	}

	@Test
	public void testPushPushPop() throws Exception {
		// push()メソッドを2回、pop()メソッドを1回行った時に
		// スタックの状態が期待通りかを確認する
	}

	@Test
	public void testPopWhenEmpty() throws Exception {
		// スタックが空の状態で、pop()メソッドを実行した時に
		// EmptyException例外が発生するかを確認する
	}

	@Test
	public void testPushWhenMaxLimit() throws Exception {
		// スタックに最大数の値が積まれている状態で、
		// push()メソッドを実行した時に
		// OverflowException例外が発生するかを確認する
	}

}
