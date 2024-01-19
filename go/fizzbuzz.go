package main

/*
Prints the numbers from 1 to 100 inclusive each on their own line,
substitutes multiples of 3 for the text "fizz" and multiples of 5 for "buzz".
For multiples of 3 and 5 print instead "fizzbuzz".
*/

func main() {
	for i := 1; i <= 100; i++ {
		if i%3 == 0 && i%5 == 0 {
			println("fizzbuzz")
		} else if i%3 == 0 {
			println("fizz")
		} else if i%5 == 0 {
			println("buzz")
		} else {
			println(i)
		}
	}
}
