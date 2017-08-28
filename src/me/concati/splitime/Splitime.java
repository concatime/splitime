/*
 * Copyright 2017 @concatime
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.concati.splitime;

public class Splitime
{
	public void println(final String text) {
		System.out.println(text);
	}

	public String capitalize(final String word) {
		final char[] newWord = word.toCharArray();
		newWord[0] = Character.toTitleCase(newWord[0]);
		return String.valueOf(newWord);
	}

	public boolean isDigit(final String str) {
		return str.chars().allMatch(Character::isDigit);
	}

	public int pow(final int val) {
		return this.pow(val, 2);
	}

	public int pow(final int val, final int pow) {
		return pow > 0 ? val * pow(val, pow - 1) : 1;
	}

	/**
	 * @param min included
	 * @param max excluded
	 */
	public int random(final int min, final int max) {
		// stackoverflow.com/q/363681
		return java.util.concurrent.ThreadLocalRandom.current().nextInt(min, max);
	}

	public char randomLetter() {
		return (char) this.random(97, 123);
	}

	public boolean prime(final int n) {
		switch (n) {
			case 0:
			case 1:
				return false;
			case 2:
			case 3:
				return true;
			default:
				return this.prime(n, n / 2);
		}
	}

	public boolean prime(final int x, int i) {
		// Simplified from (i == 1 ? true : x % i != 0 && prime(x, i - 1));
		return i == 1 || x % i != 0 && this.prime(x, --i);
	}

	public byte priorityOfOperator(final char chr) {
		byte rank = 0;
		switch (chr) {
			case '^':
				rank++;
			case '*':
			case '/':
				rank++;
			case '+':
			case '-':
				rank++;
			default:
				return rank;
		}
	}
}
