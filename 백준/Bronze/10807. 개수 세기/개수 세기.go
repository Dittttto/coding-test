package main

import "fmt"

func main() {
	var n int
	fmt.Scanln(&n)

	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
	}

	var v int
	fmt.Scanln(&v)

	var result int
	for i := 0; i < n; i++ {
		if arr[i] == v {
			result++
		}
	}

	fmt.Println(result)
}