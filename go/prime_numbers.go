package main

import "fmt"

/*
- Skip even numbers because they cannot be prime.
- Only check up to the square root because anything higher than the square root
  has no chance of multiplying evenly into `n`.
- Start checking at 2 because 1 is not prime.
*/

func printPrimes(max int) {
	for n := 2; n < max+1; n++ {
		if n == 2 {
			println(n)
			continue
		}

		if n%2 == 0 {
			continue
		}

		isPrime := true
		for i := 3; i*i < n+1; i++ {
			if n%i == 0 {
				isPrime = false
				break
			}
		}

		if !isPrime {
			continue
		}

		println(n)
	}
}

func test(max int) {
	fmt.Printf("Primes up to %v:\n", max)
	printPrimes(max)
	fmt.Println("=====")
}

func main() {
	test(10)
	test(20)
	test(30)
}
