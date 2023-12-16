package main

import (
	"fmt"
)

func main() {
	var x int
	var y int

	fmt.Scanf("%d\n%d", &x, &y)

	if x > 0 && y > 0 {
		fmt.Println(1)
	} else if x > 0 && y < 0 {
		fmt.Println(4)
	} else if x < 0 && y > 0 {
		fmt.Println(2)
	} else {
		fmt.Println(3)
	}
}
