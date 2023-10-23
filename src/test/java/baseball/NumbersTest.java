package baseball;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import baseball.domain.Numbers;

class NumbersTest {

	@Test
	void 숫자가_3자리가_아니면_예외를_던진다() {
		List<Integer> numbers1 = List.of(1,2,3,4,5);
		List<Integer> numbers2 = List.of(1,2);

		Assertions.assertThrows(IllegalArgumentException.class, () -> new Numbers(numbers1));
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Numbers(numbers2));
	}

	@Test
	void 중복된_숫자가_있으면_예외를_던진다() {
		List<Integer> numbers = List.of(1,1,2);

		Assertions.assertThrows(IllegalArgumentException.class, () -> new Numbers(numbers));
	}

	@Test
	void 각_숫자의_크기가_1이상_9이하가_아니면_예외를_던진다() {
		List<Integer> numbers1 = List.of(10,2,4);
		List<Integer> numbers2 = List.of(0,3,5);

		Assertions.assertThrows(IllegalArgumentException.class, () -> new Numbers(numbers1));
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Numbers(numbers2));
	}
}